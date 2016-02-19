package fr.agefospme.referentiel.individu.service;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import fr.agefospme.referentiel.individu.commun.AbstractMetierTest;
import fr.agefospme.rfi.domaine.repository.IndividuRepository;

public class GestionIndividuRandomIdGeneratorImplITTest extends
		AbstractMetierTest {
	@Inject
	private GestionIndividuRandomIdGenerator randomIdGenerator;
	@Inject
	private IndividuRepository individuRepository;

	@Test
	public void testGetRandomId() {
		String val = randomIdGenerator.getRandomId();
		assertTrue(StringUtils.isNotBlank(val) && StringUtils.isNotEmpty(val));
	}

	@Test(timeout = 36000)
	public void testGetRandomIdInAnInterval() {

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < 1000; i++) {
			String val = randomIdGenerator.getRandomId();
			assertTrue(val.length() == 8);
			values.add(val);
		}
		System.out.println("=======================" + values);
		
	}
}
