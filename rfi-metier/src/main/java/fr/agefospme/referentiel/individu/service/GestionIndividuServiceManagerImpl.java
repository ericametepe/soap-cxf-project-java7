package fr.agefospme.referentiel.individu.service;

import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.ConstraintViolation;

import org.joda.time.DateTime;
import org.springframework.core.convert.ConversionService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fr.agefospme.referentiel.individu.service.exception.DuplicateIndividuCreationException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampMalFormateException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampObligatoireManquantException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuErrorMessageAndCode;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuNomAssocieIncorrectException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuNonTrouveException;
import fr.agefospme.rfi.domaine.Adresse;
import fr.agefospme.rfi.domaine.Individu;
import fr.agefospme.rfi.domaine.IndividuHistorique;
import fr.agefospme.rfi.domaine.TypeEvenement;
import fr.agefospme.rfi.domaine.UtilisateurAgefos;
import fr.agefospme.rfi.domaine.repository.IndividuHistoriqueRepository;
import fr.agefospme.rfi.domaine.repository.IndividuRepository;

@Named
@Transactional
public class GestionIndividuServiceManagerImpl implements
		GestionIndividuServiceManager {

	@Inject
	private IndividuRepository individuRepository;

	@Inject
	private IndividuHistoriqueRepository hrRepository;
	@Inject
	private ConversionService conversionService;
	@Inject
	private GestionIndividuValidationService validationService;
	@Inject
	private GestionIndividuRandomIdGenerator generator;

	/**
	 * @author ykodjovi
	 */

	/**
	 * 
	 * @param creationDto
	 * @return individuF
	 * @throws DuplicateIndividuCreationException
	 * @throws GestionIndividuChampMalFormateException
	 * @throws GestionIndividuChampObligatoireManquantException
	 */
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT)
	public IndividuDto create(IndividuInfoCreationDto creationDto)
			throws GestionIndividuChampMalFormateException,
			DuplicateIndividuCreationException,
			GestionIndividuChampObligatoireManquantException {

		IndividuDto individuDto = null;

		try {
			validationService.validateInfoCreation(creationDto);
		} catch (GestionIndividuChampObligatoireManquantException e) {
			throw new GestionIndividuChampObligatoireManquantException(
					e.getCode(), e.getMessage());
		}

		catch (GestionIndividuChampMalFormateException e) {
			throw new GestionIndividuChampObligatoireManquantException(
					e.getCode(), e.getMessage());

		}

		Individu individuToSave = conversionService.convert(creationDto,
				Individu.class);

		// test individu exist nir
		Individu individuTest = null;

		individuTest = individuRepository
				.findByNirAndNomDeNaissanceAndPrenomAndCiviliteAndDateDeNaissance(
						individuToSave.getNir(),
						individuToSave.getNomDeNaissance(),
						individuToSave.getPrenom(),
						individuToSave.getCivilite(),
						individuToSave.getDateDeNaissance());

		if (individuTest != null && individuTest.getId() != null) {
			
			individuDto = conversionService.convert(individuTest,
					IndividuDto.class);
			return individuDto;
		}

		if (individuExist(individuToSave)) {
			throw new DuplicateIndividuCreationException(
					GestionIndividuErrorMessageAndCode.DUPLICATE_INDIVIDU_CREATION_ERROR_MESSAGE
							.getCode(),
					GestionIndividuErrorMessageAndCode.DUPLICATE_INDIVIDU_CREATION_ERROR_MESSAGE
							.getMessage());
		}

		individuToSave.setIdMetier(generator.getRandomId());

		Individu individuS = individuRepository.save(individuToSave);

		individuDto = conversionService.convert(individuS, IndividuDto.class);

		if (individuDto != null) {
			IndividuHistorique individuHistorique = new IndividuHistorique();

			individuHistorique.setNir(individuS.getNir());
			individuHistorique.setIdMetier(individuS.getIdMetier());
			individuHistorique.setDateDeNaissance(individuS
					.getDateDeNaissance());
			individuHistorique.setDateEvenement(new DateTime());
			individuHistorique.setTypeEvt(TypeEvenement.CREATION);
			individuHistorique.setNomDeNaissance(individuS.getNomDeNaissance());
			individuHistorique.setPrenom(individuS.getPrenom());
			individuHistorique
					.setRattachementCPF(individuS.isRattachementCPF());
			individuHistorique.setCivilite(individuS.getCivilite());
			individuHistorique.setSituationProfessionnelle(individuS
					.getSituationProfessionnelle());
			individuHistorique.setTelephone(individuS.getTelephone());
			individuHistorique.setEmail(individuS.getEmail());
			individuHistorique.setAdresseDomiciliation(individuS
					.getAdresseDomiciliation());

			if (creationDto.getUtilisateurAgefosDto() != null) {

				UtilisateurAgefos utilisateurAgefos = new UtilisateurAgefos(
						creationDto.getUtilisateurAgefosDto().getLogin(),
						creationDto.getUtilisateurAgefosDto().getCodeSite(),
						creationDto.getUtilisateurAgefosDto()
								.getApplicationOrigine());

				individuHistorique.setUtilisateurAgefos(utilisateurAgefos);
				hrRepository.save(individuHistorique);

			}

		}

		return individuDto;
	}

	public void setIndividuRepository(IndividuRepository individuRepository) {
		this.individuRepository = individuRepository;
	}

	public String listerViolation(
			Set<ConstraintViolation<IndividuInfoCreationDto>> violations) {
		if (violations.size() >= 1) {
			ConstraintViolation<IndividuInfoCreationDto> violation = violations
					.iterator().next();
			return violation.getPropertyPath() + " avec la valeur: "
					+ violation.getInvalidValue()
					+ " indications sur le message: " + violation.getMessage();
		} else {
			return null;
		}
	}

	@Transactional(readOnly = true, rollbackFor = {
			GestionIndividuChampObligatoireManquantException.class,
			GestionIndividuChampMalFormateException.class }, isolation = Isolation.DEFAULT)
	public IndividuDto consulter(InfoConsultationIdMetierDto idMetierDto)
			throws GestionIndividuChampMalFormateException,
			GestionIndividuChampObligatoireManquantException,
			GestionIndividuNonTrouveException {

		IndividuDto dto = null;

		validationService.validateInfoConsultationIdMetierDto(idMetierDto);

		dto = getIndividuDtoByIdMetier(idMetierDto.getIdMetier());

		return dto;

	}

	private IndividuDto getIndividuDtoByIdMetier(String idmetier)
			throws GestionIndividuNonTrouveException {

		Individu individuF = null;
		IndividuDto dto = null;

		individuF = individuRepository.findByIdMetier(idmetier);

		if (individuF == null) {
			throw new GestionIndividuNonTrouveException(
					GestionIndividuErrorMessageAndCode.INDIVIDU_NON_TROUVE_ERROR_MESSAGE
							.getCode(),
					GestionIndividuErrorMessageAndCode.INDIVIDU_NON_TROUVE_ERROR_MESSAGE
							.getMessage());

		}

		if (individuF != null && individuF.getId() != null) {
			dto = conversionService.convert(individuF, IndividuDto.class);

		}
		return dto;
	}

	private Individu getIndividuByIdMetier(String idmetier)
			throws GestionIndividuNonTrouveException {

		Individu individuF = null;

		individuF = individuRepository.findByIdMetier(idmetier);

		if (individuF == null) {
			throw new GestionIndividuNonTrouveException(
					GestionIndividuErrorMessageAndCode.INDIVIDU_NON_TROUVE_ERROR_MESSAGE
							.getCode(),
					GestionIndividuErrorMessageAndCode.INDIVIDU_NON_TROUVE_ERROR_MESSAGE
							.getMessage());
		}
		return individuF;
	}

	@Transactional(readOnly = true, isolation = Isolation.DEFAULT)
	public IndividuDto consulter(
			IndividuInfoConsultationNirNomDto consultationNirNomDto)
			throws GestionIndividuChampObligatoireManquantException,
			GestionIndividuChampMalFormateException,
			GestionIndividuNonTrouveException,
			GestionIndividuNomAssocieIncorrectException {
		IndividuDto dto = null;
		Individu individu = null;

		String nir = consultationNirNomDto.getNir();
		String nom = consultationNirNomDto.getNomDeNaissance();

		validationService.validateConsultationNirNomDto(consultationNirNomDto);

		individu = individuRepository.findByNirAndNomDeNaissanceNot(nir, nom);

		if (individu != null && individu.getId() != null) {
			throw new GestionIndividuNomAssocieIncorrectException(
					GestionIndividuErrorMessageAndCode.NOM_DE_NAISSANCE_ASSOCIE_AU_NIR_ERROR_MESSAGE
							.getCode(),
					GestionIndividuErrorMessageAndCode.NOM_DE_NAISSANCE_ASSOCIE_AU_NIR_ERROR_MESSAGE
							.getMessage());

		}

		individu = individuRepository.findByNirAndNomDeNaissance(nir, nom);

		if (individu == null) {
			throw new GestionIndividuNonTrouveException(
					GestionIndividuErrorMessageAndCode.INDIVIDU_NON_TROUVE_ERROR_MESSAGE
							.getCode(),
					GestionIndividuErrorMessageAndCode.INDIVIDU_NON_TROUVE_ERROR_MESSAGE
							.getMessage());

		}

		if (individu != null && individu.getId() != null) {
			dto = conversionService.convert(individu, IndividuDto.class);
		}

		return dto;
	}

	private boolean individuExist(Individu individu)
			throws DuplicateIndividuCreationException {
		Individu individuWithNir = null;
		Individu individuWithother = null;

		individuWithNir = individuRepository.findByNir(individu.getNir());

		individuWithother = individuRepository
				.findByNirAndNomDeNaissanceAndPrenomAndCiviliteAndDateDeNaissance(
						individu.getNir(), individu.getNomDeNaissance(),
						individu.getPrenom(), individu.getCivilite(),
						individu.getDateDeNaissance());

		if ((individuWithNir != null && individuWithNir.getId() != null
				&& individuWithother != null && individuWithother.getId() != null)
				|| (individuWithNir != null && individuWithNir.getId() != null && individuWithother == null)) {
			return true;
		}

		return false;
	}

	@Transactional(readOnly = false, isolation = Isolation.DEFAULT,rollbackFor = {
			GestionIndividuChampObligatoireManquantException.class,
			GestionIndividuChampMalFormateException.class,GestionIndividuNonTrouveException.class })
	public IndividuDto modifier(IndividuInfoModificationDto modificationDto)
			throws GestionIndividuChampMalFormateException,
			GestionIndividuChampObligatoireManquantException,
			GestionIndividuNonTrouveException {

		IndividuDto individuDto = null;

		validationService.validateInfoModification(modificationDto);

		Individu individuToModify = null;

		individuToModify = getIndividuByIdMetier(modificationDto.getIdMetier());

		individuToModify.setNomDeNaissance(modificationDto.getNomDeNaissance());
		individuToModify.setDateDeNaissance(modificationDto
				.getDateDeNaissance());
		individuToModify.setPrenom(modificationDto.getPrenom());
		individuToModify.setSituationProfessionnelle(modificationDto
				.getSituationProfessionnelle());
		individuToModify.setCivilite(modificationDto.getCivilite());
		individuToModify
				.setRattachementCPF(modificationDto.isRattachementCPF());
		individuToModify.setTelephone(modificationDto.getTelephone());
		individuToModify.setEmail(modificationDto.getEmail());

		Adresse adresseDomiciliation = individuToModify
				.getAdresseDomiciliation();

		adresseDomiciliation.setAdresseLigne1(modificationDto.getAdresseDto()
				.getAdresseLigne1());
		adresseDomiciliation.setAdresseLigne2(modificationDto.getAdresseDto()
				.getAdresseLigne2());
		adresseDomiciliation.setAdresseLigne3(modificationDto.getAdresseDto()
				.getAdresseLigne3());
		adresseDomiciliation.setCodePostal(modificationDto.getAdresseDto()
				.getCodePostal());
		adresseDomiciliation.setVille(modificationDto.getAdresseDto()
				.getVille());
		adresseDomiciliation.setPays(modificationDto.getAdresseDto().getPays());

		individuToModify.setAdresseDomiciliation(adresseDomiciliation);

		Individu individuS = individuRepository.save(individuToModify);

		IndividuHistorique historique = historiser(individuS,
				TypeEvenement.MODIFICATION,
				modificationDto.getUtilisateurAgefosDto());

		if (historique != null && historique.getId() != null) {
			individuDto = conversionService.convert(individuS,
					IndividuDto.class);
		}

		return individuDto;
	}

	public IndividuHistorique historiser(Individu individu,
			TypeEvenement evenement, UtilisateurAgefosDto utilisateurAgefosDto) {
		IndividuHistorique individuHistoriqueToSave = new IndividuHistorique();

		individuHistoriqueToSave.setNir(individu.getNir());
		individuHistoriqueToSave.setIdMetier(individu.getIdMetier());
		individuHistoriqueToSave.setDateDeNaissance(individu
				.getDateDeNaissance());
		individuHistoriqueToSave.setDateEvenement(new DateTime());
		individuHistoriqueToSave.setTypeEvt(evenement);
		individuHistoriqueToSave
				.setNomDeNaissance(individu.getNomDeNaissance());
		individuHistoriqueToSave.setPrenom(individu.getPrenom());
		individuHistoriqueToSave.setRattachementCPF(individu
				.isRattachementCPF());
		individuHistoriqueToSave.setCivilite(individu.getCivilite());
		individuHistoriqueToSave.setSituationProfessionnelle(individu
				.getSituationProfessionnelle());
		individuHistoriqueToSave.setTelephone(individu.getTelephone());
		individuHistoriqueToSave.setEmail(individu.getEmail());
		individuHistoriqueToSave.setAdresseDomiciliation(individu
				.getAdresseDomiciliation());

		UtilisateurAgefos utilisateurAgefos = new UtilisateurAgefos(
				utilisateurAgefosDto.getLogin(),
				utilisateurAgefosDto.getCodeSite(),
				utilisateurAgefosDto.getApplicationOrigine());
		individuHistoriqueToSave.setUtilisateurAgefos(utilisateurAgefos);

		IndividuHistorique indHistoriqueS = hrRepository
				.save(individuHistoriqueToSave);
		return indHistoriqueS;

	}

}
