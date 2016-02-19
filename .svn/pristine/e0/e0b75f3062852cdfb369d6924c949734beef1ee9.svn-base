package fr.agefospme.referentiel.individu.metier;

import org.apache.commons.lang.StringUtils;

import fr.agefospme.referentiel.individu.service.exception.GestionIndividuChampMalFormateException;
import fr.agefospme.referentiel.individu.service.exception.GestionIndividuErrorMessageAndCode;


public class GestionIndividuStringUtils {

	public static String supprimerCaractereSpeciauxEtNormalivalerEnMajuvalcule(String val) throws GestionIndividuChampMalFormateException {
		
		if (StringUtils.isEmpty(val) || StringUtils.isBlank(val) ) {
			throw new GestionIndividuChampMalFormateException(
					GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
							.getCode(),
					GestionIndividuErrorMessageAndCode.CHAMP_MAL_FORMATE
							.getMessage());
		}
		//
		
		
		 val = val.replaceAll("[^\\p{L}\\p{Nd}]+", "");
		 val = val.replaceAll("[èéêë]","e");
		    val = val.replaceAll("[ûù]","u");
		    val = val.replaceAll("[ïî]","i");
		    val = val.replaceAll("[àâ]","a");
		    val = val.replaceAll("ô","o");

		    val = val.replaceAll("[ÈÉÊË]","E");
		    val = val.replaceAll("[ÛÙ]","U");
		    val = val.replaceAll("[ÏÎ]","I");
		    val = val.replaceAll("[ÀÂ]","A");
		    val = val.replaceAll("Ô","O");
		    
		    val= StringUtils.upperCase(val);
		    
	

		return val;
	}
}
