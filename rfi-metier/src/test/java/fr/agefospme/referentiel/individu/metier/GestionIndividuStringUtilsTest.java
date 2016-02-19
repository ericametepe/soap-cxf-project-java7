package fr.agefospme.referentiel.individu.metier;

import static org.junit.Assert.*;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampMalFormateException;

public class GestionIndividuStringUtilsTest {

	@Test
	public void testTestValupprimerCaractereSpeciauxEtNormalivalerEnMajuvalculeShouldBeOk() {
		String val="BâtîmÊîûÛeÊ# ";
		String valAfer="BATIMEIUUEE";
		String res=null;
		
		try {
			 res=GestionIndividuStringUtils.supprimerCaractereSpeciauxEtNormalivalerEnMajuvalcule(val);
		} catch (GestionIndividuChampMalFormateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("converterUtil.valupprimerCaractereSpeciauxEtNormalivalerEnMajuvalcule :"+res);
		assertTrue(StringUtils.equals(res, valAfer));
		
		
	}
	}

