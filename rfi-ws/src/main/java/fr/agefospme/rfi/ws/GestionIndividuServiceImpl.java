package fr.agefospme.rfi.ws;

import java.util.Date;

import javax.inject.Inject;
import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.ConversionService;

import agefospme.commun.contexteutilisateur.ContexteUtilisateur;
import agefospme.commun.contexteutilisateur.ObjectFactory;
import agefospme.commun.erreur.Erreur;
import fr.agefospme.referentiel.individu.service.AdresseDto;
import fr.agefospme.referentiel.individu.service.GestionIndividuServiceManager;
import fr.agefospme.referentiel.individu.service.IndividuDto;
import fr.agefospme.referentiel.individu.service.IndividuInfoConsultationNirNomDto;
import fr.agefospme.referentiel.individu.service.IndividuInfoCreationDto;
import fr.agefospme.referentiel.individu.service.IndividuInfoModificationDto;
import fr.agefospme.referentiel.individu.service.InfoConsultationIdMetierDto;
import fr.agefospme.referentiel.individu.service.UtilisateurAgefosDto;
import fr.agefospme.referentiel.individu.service.exception.DuplicateIndividuCreationException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampMalFormateException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampObligatoireManquantException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuErrorMessageAndCode;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuNomAssocieIncorrectException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuNonTrouveException;
import fr.agefospme.rfi.ws.gestionindividu.gen.Addresse;
import fr.agefospme.rfi.ws.gestionindividu.gen.ConsulterIndividuParIdentifiantMetierFault;
import fr.agefospme.rfi.ws.gestionindividu.gen.ConsulterIndividuParIdentifiantMetierRequest;
import fr.agefospme.rfi.ws.gestionindividu.gen.ConsulterIndividuParIdentifiantMetierResponse;
import fr.agefospme.rfi.ws.gestionindividu.gen.ConsulterIndividuParNirEtNomDeNaissanceFault;
import fr.agefospme.rfi.ws.gestionindividu.gen.ConsulterIndividuParNirEtNomDeNaissanceRequest;
import fr.agefospme.rfi.ws.gestionindividu.gen.ConsulterIndividuParNirEtNomDeNaissanceResponse;
import fr.agefospme.rfi.ws.gestionindividu.gen.CreerIndividuFault;
import fr.agefospme.rfi.ws.gestionindividu.gen.CreerIndividuRequest;
import fr.agefospme.rfi.ws.gestionindividu.gen.CreerIndividuResponse;
import fr.agefospme.rfi.ws.gestionindividu.gen.GestionIndividuPortType;
import fr.agefospme.rfi.ws.gestionindividu.gen.ModifierIndividuFault;
import fr.agefospme.rfi.ws.gestionindividu.gen.ModifierIndividuRequest;
import fr.agefospme.rfi.ws.gestionindividu.gen.ModifierIndividuResponse;

/**
 * 
 * @author ykodjovi
 *
 */

@javax.jws.WebService(serviceName = "GestionIndividu", portName = "GestionIndividuPort", endpointInterface = "fr.agefospme.rfi.ws.gestionindividu.gen.GestionIndividuPortType")
public class GestionIndividuServiceImpl implements GestionIndividuPortType {

	@Inject
	private GestionIndividuServiceManager serviceManager;
	@Inject
	@Qualifier("contextFactory")
	private ObjectFactory contextFactory;
	@Inject
	@Qualifier("erreurFactory")
	private agefospme.commun.erreur.ObjectFactory erreurFactory;
	@Inject
	@Qualifier("genFactory")
	private fr.agefospme.rfi.ws.gestionindividu.gen.ObjectFactory genFactory;

	@Inject
	private ConversionService conversionService;

	@Override
	public CreerIndividuResponse creerIndividu(
			Holder<ContexteUtilisateur> headerRFI,
			CreerIndividuRequest creerIndividuRequest)
			throws CreerIndividuFault {
		CreerIndividuResponse creerIndividuResponse = genFactory
				.createCreerIndividuResponse();
		IndividuDto dto = null;

		if (creerIndividuRequest == null) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
					.getCode());
			erreur.setMessage("creerIndividuRequest null");
			throw new CreerIndividuFault(
					GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
							.getCode(),
					erreur);
		}

		if (headerRFI == null || headerRFI.value == null) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
					.getCode());
			erreur.setMessage(GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
					.getMessage().concat(
							":  champs utilisateur agefos obligatoire"));
			throw new CreerIndividuFault(
					GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
							.getMessage().concat(
									":champs utilisateur agefos obligatoire"),
					erreur);

		}

		Date dateNais = GestionIndividuServiceUtil
				.convertXMLDateToDate(creerIndividuRequest.getDateDeNaissance());

		if (dateNais == null) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
					.getCode());
			erreur.setMessage(GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
					.getMessage()
					.concat(": date de naissance non valide: valeurs possibles 2000-05-05"));
			throw new CreerIndividuFault(
					GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
							.getMessage()
							.concat(": date de naissance non valide: valeurs possibles 2000-05-05"),
					erreur);
		}

		IndividuInfoCreationDto creationDto = new IndividuInfoCreationDto();

		creationDto.setDateDeNaissance(dateNais);

		creationDto.setNomDeNaissance(creerIndividuRequest.getNomDeNaissance());
		creationDto.setNir(creerIndividuRequest.getNir());
		creationDto.setPrenom(creerIndividuRequest.getPrenom());
		creationDto.setEmail(creerIndividuRequest.getEmail());
		creationDto.setCivilite(creerIndividuRequest.getCivilite());
		creationDto.setSituationProfessionnelle(creerIndividuRequest
				.getSituationProfessionnelle());
		creationDto.setTelephone(creerIndividuRequest.getTelephone());
		creationDto
				.setRattachementCPF(creerIndividuRequest.isRattachementCPF());

		Addresse adresse = creerIndividuRequest.getAdresseDeDomiciliation();

		if (adresse == null) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
					.getCode());
			erreur.setMessage(GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
					.getMessage().concat(": champ adresse obligatoire"));
			throw new CreerIndividuFault(
					GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
							.getMessage().concat(":champ adresse obligatoire"),
					erreur);
		}

		AdresseDto adresseDto = new AdresseDto();

		adresseDto.setAdresseLigne1(adresse.getAdresseLigne1());
		adresseDto.setAdresseLigne2(adresse.getAdresseLigne2());
		adresseDto.setAdresseLigne3(adresse.getAdresseLigne3());
		adresseDto.setCodePostal(adresse.getCodePostal());
		adresseDto.setVille(adresse.getVille());
		adresseDto.setPays(adresse.getPays());

		creationDto.setAdresseDto(adresseDto);

		UtilisateurAgefosDto utilisateurAgefosDto = new UtilisateurAgefosDto(
				headerRFI.value.getLogin(), headerRFI.value.getCodeSite(),
				headerRFI.value.getApplicationOrigine());

		creationDto.setUtilisateurAgefosDto(utilisateurAgefosDto);

		try {
			dto = serviceManager.create(creationDto);
		}

		catch (GestionIndividuChampObligatoireManquantException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new CreerIndividuFault(erreur.getCode(), erreur);
		}

		catch (GestionIndividuChampMalFormateException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new CreerIndividuFault(erreur.getCode(), erreur);

		} catch (DuplicateIndividuCreationException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new CreerIndividuFault(erreur.getCode(), erreur);

		}

		if (dto != null) {

			creerIndividuResponse.setIdMetier(dto.getIdMetier());

			creerIndividuResponse.setNomDeNaissance(dto.getNomDeNaissance());
			creerIndividuResponse.setDateDeNaissance(GestionIndividuServiceUtil
					.asXMLGregorianCalendar(dto.getDateDeNaissance()));

			creerIndividuResponse.setPrenom(dto.getPrenom());
			creerIndividuResponse.setCivilite(dto.getCivilite());
			creerIndividuResponse.setSituationProfessionnelle(dto
					.getSituationProfessionnelle());

			creerIndividuResponse.setRattachementCPF(dto.isRattachementCPF());

			creerIndividuResponse.setTelephone(dto.getTelephone());
			creerIndividuResponse.setEmail(dto.getEmail());

			Addresse addresseDom = genFactory.createAddresse();

			addresseDom
					.setAdresseLigne1(dto.getAdresseDto().getAdresseLigne1());

			addresseDom
					.setAdresseLigne2(dto.getAdresseDto().getAdresseLigne2());

			addresseDom
					.setAdresseLigne3(dto.getAdresseDto().getAdresseLigne3());

			addresseDom.setCodePostal(dto.getAdresseDto().getCodePostal());

			addresseDom.setVille(dto.getAdresseDto().getVille());

			addresseDom.setPays(dto.getAdresseDto().getPays());

			creerIndividuResponse.setAdresseDeDomiciliation(addresseDom);

		}

		return creerIndividuResponse;
	}

	@Override
	public ConsulterIndividuParIdentifiantMetierResponse consulterIndividuParIdentifiantMetier(
			ConsulterIndividuParIdentifiantMetierRequest consulterIndividuParIdentifiantMetierRequest)
			throws ConsulterIndividuParIdentifiantMetierFault {

		ConsulterIndividuParIdentifiantMetierResponse response = null;

		if (consulterIndividuParIdentifiantMetierRequest == null) {
			Erreur erreur = erreurFactory.createErreur();

			erreur.setCode(GestionIndividuErrorMessageAndCode.CHAMP_OBLIGATOIRE
					.getCode());
			erreur.setMessage("consulterIndividuParIdentifiantMetierRequest null");
			throw new ConsulterIndividuParIdentifiantMetierFault(
					GestionIndividuErrorMessageAndCode.CHAMP_OBLIGATOIRE
							.getCode(),
					erreur);

		}

		IndividuDto individuDto = null;
		InfoConsultationIdMetierDto idMetierDto = new InfoConsultationIdMetierDto();

		idMetierDto.setIdMetier(consulterIndividuParIdentifiantMetierRequest
				.getIdentifiantMetier());

		try {
			individuDto = serviceManager.consulter(idMetierDto);
		} catch (GestionIndividuChampMalFormateException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ConsulterIndividuParIdentifiantMetierFault(
					erreur.getCode(), erreur);
		} catch (GestionIndividuChampObligatoireManquantException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ConsulterIndividuParIdentifiantMetierFault(
					erreur.getCode(), erreur);
		} catch (GestionIndividuNonTrouveException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ConsulterIndividuParIdentifiantMetierFault(
					erreur.getCode(), erreur);
		}

		if (individuDto != null) {
			response = genFactory
					.createConsulterIndividuParIdentifiantMetierResponse();

			response.setIdMetier(individuDto.getIdMetier());
			response.setNomDeNaissance(individuDto.getNomDeNaissance());
			response.setPrenom(individuDto.getPrenom());
			response.setCivilite(individuDto.getCivilite());
			response.setSituationProfessionnelle(individuDto
					.getSituationProfessionnelle());
			response.setDateDeNaissance(GestionIndividuServiceUtil
					.asXMLGregorianCalendar(individuDto.getDateDeNaissance()));

			response.setEmail(individuDto.getEmail());
			response.setTelephone(individuDto.getTelephone());
			response.setRattachementCPF(individuDto.isRattachementCPF());

			if (individuDto.getAdresseDto() != null) {
				Addresse addresse = genFactory.createAddresse();
				addresse.setAdresseLigne1(individuDto.getAdresseDto()
						.getAdresseLigne1());
				addresse.setAdresseLigne2(individuDto.getAdresseDto()
						.getAdresseLigne2());
				addresse.setAdresseLigne3(individuDto.getAdresseDto()
						.getAdresseLigne3());
				addresse.setCodePostal(individuDto.getAdresseDto()
						.getCodePostal());
				addresse.setVille(individuDto.getAdresseDto().getVille());
				addresse.setPays(individuDto.getAdresseDto().getPays());

				response.setAdresseDeDomiciliation(addresse);

			}

		}
		return response;
	}

	@Override
	public ModifierIndividuResponse modifierIndividu(
			ContexteUtilisateur headerRFI,
			ModifierIndividuRequest modifierIndividuRequest)
			throws ModifierIndividuFault {
		
		ModifierIndividuResponse response=null;

		IndividuInfoModificationDto modificationDto = new IndividuInfoModificationDto();

		modificationDto.setIdMetier(modifierIndividuRequest.getIdMetier());
		modificationDto.setNomDeNaissance(modifierIndividuRequest
				.getNomDeNaissance());
		Date dateNais = GestionIndividuServiceUtil
				.convertXMLDateToDate(modifierIndividuRequest.getDateDeNaissance());

		if (dateNais == null) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
					.getCode());
			erreur.setMessage(GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
					.getMessage()
					.concat(": date de naissance non valide: valeurs possibles 2000-05-05"));
			throw new ModifierIndividuFault(
					GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
							.getMessage()
							.concat(": date de naissance non valide: valeurs possibles 2000-05-05"),
					erreur);
		}
		modificationDto.setDateDeNaissance(dateNais);
		modificationDto.setPrenom(modifierIndividuRequest.getPrenom());
		modificationDto.setCivilite(modifierIndividuRequest.getCivilite());
		modificationDto.setSituationProfessionnelle(modifierIndividuRequest
				.getSituationProfessionnelle());
		modificationDto.setRattachementCPF(modifierIndividuRequest.isRattachementCPF());
		modificationDto.setEmail(modifierIndividuRequest.getEmail());
		modificationDto.setTelephone(modifierIndividuRequest.getTelephone());

		Addresse adresseReq = modifierIndividuRequest.getAdresseDeDomiciliation();

		AdresseDto adresseDto = new AdresseDto();
		adresseDto.setAdresseLigne1(adresseReq.getAdresseLigne1());
		adresseDto.setAdresseLigne2(adresseReq.getAdresseLigne2());
		adresseDto.setAdresseLigne3(adresseReq.getAdresseLigne3());
		adresseDto.setCodePostal(adresseReq.getCodePostal());
		adresseDto.setVille(adresseReq.getVille());
		adresseDto.setPays(adresseReq.getPays());

		modificationDto.setAdresseDto(adresseDto);

		UtilisateurAgefosDto utilisateurAgefosDto = new UtilisateurAgefosDto(
				headerRFI.getLogin(), headerRFI.getCodeSite(),
				headerRFI.getApplicationOrigine());

		modificationDto.setUtilisateurAgefosDto(utilisateurAgefosDto);
		IndividuDto individuDto = null;
		
		try {
			individuDto = serviceManager.modifier(modificationDto);
		} catch (GestionIndividuChampMalFormateException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ModifierIndividuFault(erreur.getCode(),erreur);
		} catch (GestionIndividuChampObligatoireManquantException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ModifierIndividuFault(erreur.getCode(),erreur);
		} catch (GestionIndividuNonTrouveException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ModifierIndividuFault(erreur.getCode(),erreur);
		}

		if (individuDto != null) {
			
			response=genFactory.createModifierIndividuResponse();
			
			response.setIdMetier(individuDto.getIdMetier());
			
			response.setNomDeNaissance(individuDto.getNomDeNaissance());
			response.setPrenom(individuDto.getPrenom());
			response.setCivilite(individuDto.getCivilite());
			response.setRattachementCPF(individuDto.isRattachementCPF());
			response.setSituationProfessionnelle(individuDto
					.getSituationProfessionnelle());
			response.setDateDeNaissance(GestionIndividuServiceUtil
					.asXMLGregorianCalendar(individuDto.getDateDeNaissance()));

			response.setEmail(individuDto.getEmail());
			response.setTelephone(individuDto.getTelephone());

			if (individuDto.getAdresseDto() != null) {
				Addresse addresse = genFactory.createAddresse();

				addresse.setAdresseLigne1(individuDto.getAdresseDto()
						.getAdresseLigne1());
				addresse.setAdresseLigne2(individuDto.getAdresseDto()
						.getAdresseLigne2());
				addresse.setAdresseLigne3(individuDto.getAdresseDto()
						.getAdresseLigne3());
				addresse.setCodePostal(individuDto.getAdresseDto()
						.getCodePostal());
				addresse.setVille(individuDto.getAdresseDto().getVille());
				addresse.setPays(individuDto.getAdresseDto().getPays());

				response.setAdresseDeDomiciliation(addresse);
			}

		}
		return response;
	}

	@Override
	public ConsulterIndividuParNirEtNomDeNaissanceResponse consulterIndividuParNirEtNomDeNaissance(
			ConsulterIndividuParNirEtNomDeNaissanceRequest consulterIndividuParNirEtNomDeNaissanceRequest)
			throws ConsulterIndividuParNirEtNomDeNaissanceFault {

		IndividuDto individuDto = null;

		if (consulterIndividuParNirEtNomDeNaissanceRequest == null) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(GestionIndividuErrorMessageAndCode.CHAMP_OBLIGATOIRE
					.getCode());
			erreur.setMessage(GestionIndividuErrorMessageAndCode.CHAMP_OBLIGATOIRE
					.getMessage());
			throw new ConsulterIndividuParNirEtNomDeNaissanceFault(
					GestionIndividuErrorMessageAndCode.CHAMP_OBLIGATOIRE
							.getMessage().concat(":champ adresse obligatoire"),
					erreur);
		}

		IndividuInfoConsultationNirNomDto individuInfoConsultationDto = conversionService
				.convert(consulterIndividuParNirEtNomDeNaissanceRequest,
						IndividuInfoConsultationNirNomDto.class);

		try {
			individuDto = serviceManager.consulter(individuInfoConsultationDto);
		} catch (GestionIndividuChampObligatoireManquantException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ConsulterIndividuParNirEtNomDeNaissanceFault(
					erreur.getCode(), erreur);
		} catch (GestionIndividuChampMalFormateException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ConsulterIndividuParNirEtNomDeNaissanceFault(
					erreur.getCode(), erreur);
		} catch (GestionIndividuNonTrouveException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ConsulterIndividuParNirEtNomDeNaissanceFault(
					erreur.getCode(), erreur);
		} catch (GestionIndividuNomAssocieIncorrectException e) {
			Erreur erreur = erreurFactory.createErreur();
			erreur.setCode(e.getCode());
			erreur.setMessage(e.getMessage());
			throw new ConsulterIndividuParNirEtNomDeNaissanceFault(
					erreur.getCode(), erreur);
		}


		final ConsulterIndividuParNirEtNomDeNaissanceResponse   response = conversionService.convert(individuDto,
				ConsulterIndividuParNirEtNomDeNaissanceResponse.class);

		return response;
	}

}
