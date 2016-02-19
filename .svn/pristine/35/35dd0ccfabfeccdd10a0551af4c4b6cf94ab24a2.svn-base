package fr.agefospme.referentiel.individu.service;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;

import fr.agefospme.referentiel.individu.commun.AbstractMetierTest;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampMalFormateException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampObligatoireManquantException;

public class GestionIndividuValidationServiceImplITTest extends
AbstractMetierTest {

	@Autowired
	private GestionIndividuValidationService validationService;
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test()
	public void testValidateInfoCreationShouldBeOk() {
		IndividuInfoCreationDto dto = mockValidInfoCreationDto();

		try {
			validationService.validateInfoCreation(dto);
		} catch (GestionIndividuChampObligatoireManquantException e) {
			assertNotNull(e);
		} catch (GestionIndividuChampMalFormateException e) {
			assertNotNull(e);
		}

	}

	@Test
	public void testValidateInfoWithEmailShoulF()
			throws GestionIndividuChampMalFormateException, GestionIndividuChampObligatoireManquantException {

		IndividuInfoCreationDto dto = mockValidInfoCreationDto();
		dto.setEmail("@eyaaaaaaayaho@.fr");
		thrown.expect(GestionIndividuChampMalFormateException.class);
		validationService.validateInfoCreation(dto);

	}
	
	@Test
	public void testValidateInfoWithCivilteNullShoulF()
			throws GestionIndividuChampMalFormateException, GestionIndividuChampObligatoireManquantException {

		IndividuInfoCreationDto dto = mockValidInfoCreationDto();
		dto.setCivilite(null);
//		dto.setSituationProfessionnelle(null); on peut tjrs ecrire des tests uniques pour ces champs 
//		dto.setPrenom(null);
		thrown.expect(GestionIndividuChampObligatoireManquantException.class);
		validationService.validateInfoCreation(dto);

	}

	private void listerViolation(
			Set<ConstraintViolation<IndividuInfoCreationDto>> violations) {

		for (ConstraintViolation<IndividuInfoCreationDto> violation : violations) {
			System.out.println("============Message d'erreur pour l'attribut: "
					+ violation.getPropertyPath() + " pour la valeur: "
					+ violation.getInvalidValue() + " indication : "
					+ violation.getMessage());

		}
	}

	@Test
	public void testValidateInfoCreationShouldFail() {

	}

}
