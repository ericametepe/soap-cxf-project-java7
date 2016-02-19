package fr.agefospme.referentiel.individu.service;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import fr.agefospme.referentiel.individu.commun.AbstractMetierTest;
import fr.agefospme.referentiel.individu.service.exception.DuplicateIndividuCreationException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampMalFormateException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampObligatoireManquantException;
import fr.agefospme.rfi.domaine.repository.IndividuRepository;

public class ReferentielIndividuServiceManagerImplITTest extends
		AbstractMetierTest {

	@Inject
	private GestionIndividuServiceManager manager;

	@Inject
	private IndividuRepository individuRepository;

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testCreateIndividuInfoCreationDtoShoulBeOK() {
		IndividuInfoCreationDto creationDto = mockValidInfoCreationDto();
		IndividuDto dto = null;
		try {
			try {
				dto = manager.create(creationDto);
			} catch (GestionIndividuChampObligatoireManquantException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (DuplicateIndividuCreationException e) {
			System.out.println("*********************" + e);
			e.printStackTrace();
		} catch (GestionIndividuChampMalFormateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(dto != null);
	}

	@Test
	public void testCreateIndividuInfoCreationDtoShouldFail() throws GestionIndividuChampMalFormateException, DuplicateIndividuCreationException {
		IndividuInfoCreationDto creationDto = mockBadInfoCreationDto();
		IndividuDto dto = null;
		thrown.expect(GestionIndividuChampMalFormateException.class);
		try {
			dto = manager.create(creationDto);
		} catch (GestionIndividuChampObligatoireManquantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertTrue(dto == null);
	}

	@After
	public void tearDown() {
		individuRepository.deleteAll();

	}

}
