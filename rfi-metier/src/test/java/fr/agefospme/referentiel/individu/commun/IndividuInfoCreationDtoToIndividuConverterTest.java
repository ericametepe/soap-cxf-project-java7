package fr.agefospme.referentiel.individu.commun;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.springframework.core.convert.ConversionService;

import fr.agefospme.referentiel.individu.service.IndividuInfoCreationDto;
import fr.agefospme.rfi.domaine.Individu;

public class IndividuInfoCreationDtoToIndividuConverterTest extends
		AbstractMetierTest {
	@Inject
	private ConversionService conversionService;


	@Test
	public void testConvert() {

		IndividuInfoCreationDto source = mockValidInfoCreationDto();

		Individu individu = conversionService.convert(source, Individu.class);
		System.out.println("==================Individu entity=============:"+ individu.toString());
		assertTrue(StringUtils.equals(individu.getAdresseDomiciliation().getVille(),"ville"));
		assertTrue(StringUtils.equals(individu.getAdresseDomiciliation().getPays(),"pays"));
		assertTrue(StringUtils.equals(individu.getAdresseDomiciliation().getCodePostal(),"codePostal"));
		assertTrue(StringUtils.equals(individu.getAdresseDomiciliation().getAdresseLigne1(),"adresseLigne1"));
		assertTrue(StringUtils.equals(individu.getAdresseDomiciliation().getAdresseLigne2(),"adresseLigne2"));
		assertTrue(StringUtils.equals(individu.getAdresseDomiciliation().getAdresseLigne3(),"adresseLigne3"));
	}

	

}
