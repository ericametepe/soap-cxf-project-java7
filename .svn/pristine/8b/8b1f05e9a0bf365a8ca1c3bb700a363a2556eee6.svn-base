package fr.agefospme.referentiel.individu.service.exception;
/**
 * 
 * @author ykodjovi
 * E_RFI_1 Individu déjà existant. L’individu existe déjà dans le référentiel. 
 * E_RFI_2 Individu non trouvé L’individu n’existe pas dans le référentiel Individu. 
 * E_RFI_3 Nom incorrect Le nom associé au NIR est incorrect. 
 * E_RFI_4 Individu inactif L’individu est inactif dans le référentiel individu. 
 * E_RFI_5 Champ mal formaté Le champ « XX » est mal formaté. 
 * Valeurs possibles pour « XX » : NIR, nom, email, téléphone, date de naissance, civilité, situation professionnelle E_RFI_6 Champ obligatoire manquant La donnée obligatoire « XX » est manquante. 
 * Valeurs possibles pour « XX » : NIR, 
 * identifiant métier, nom, prénom, date de naissance, adresse, civilité, situation professionnelle, Rattachement à un établissement AGEFOS
 *
 */
public enum GestionIndividuErrorMessageAndCode {
	
	DUPLICATE_INDIVIDU_CREATION_ERROR_MESSAGE("E_RFI_1","L’individu existe deja dans le référentiel"),
	INDIVIDU_NON_TROUVE_ERROR_MESSAGE("E_RFI_2","L’individu n’existe pas dans le référentiel Individu"),
	NOM_DE_NAISSANCE_ASSOCIE_AU_NIR_ERROR_MESSAGE("E_RFI_3","Le nom associé au NIR est incorrect"),
	CHAMP_MAL_FORMATE("E_RFI_5","Champ mal formate"),
	CHAMP_OBLIGATOIRE("E_RFI_6","Champ obligatoire manquant");
	

	
	private String code;
	private String message;
	
	private GestionIndividuErrorMessageAndCode(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
