package fr.agefospme.referentiel.individu.commun;

import static org.junit.Assert.*;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class UtilTest {
	
	
	@Test
	public void testS(){
		assertTrue(StringUtils.containsIgnoreCase("Champ obligatoire manquant Espace vide non autorise.", "obli"));
		
	}



	@Test
	public void test() {
		String subjectString = "T^êèé&-@àr";
		String resultString = subjectString.replaceAll("[^\\p{L}\\p{Nd}]+", "");
		// System.out.println(""+resultString);

		String test = StringUtils.normalizeSpace(resultString);
		System.out.println("Test upperCase :" + StringUtils.upperCase(test));

		String s = "È,É,Ê,Ë,Û,Ù,Ï,Î,À,Â,Ô,è,é,ê,ë,û,ù,ï,î,à,â,ôT^êèé&-@àr";
		StringBuilder builder = new StringBuilder(s.toString());

		s = s.replaceAll("[èéêë]", "e");
		s = s.replaceAll("[ûù]", "u");
		s = s.replaceAll("[ïî]", "i");
		s = s.replaceAll("[àâ]", "a");
		s = s.replaceAll("ô", "o");

		s = s.replaceAll("[ÈÉÊË]", "E");
		s = s.replaceAll("[ÛÙ]", "U");
		s = s.replaceAll("[ÏÎ]", "I");
		s = s.replaceAll("[ÀÂ]", "A");
		s = s.replaceAll("Ô", "O");
		s = s.replaceAll("[^\\p{L}\\p{Nd}]+", "");

		System.out.println(s);
	}

}
