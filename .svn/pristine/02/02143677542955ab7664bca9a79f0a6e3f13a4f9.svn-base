package fr.agefospme.referentiel.individu.service;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 
 * @author ykodjovi
 *
 *
 *         - Adresse postale - Code postal - Ville - Pays de domiciliation
 */
public class AdresseDto implements Serializable {
	@NotNull
	@NotBlank
	private String adresseLigne1;
	private String adresseLigne2;
	private String adresseLigne3;
	@NotNull
	@NotBlank
	private String codePostal;
	@NotNull
	@NotBlank
	private String ville;
	@NotNull
	@NotBlank
	private String pays;

	public AdresseDto() {
	}

	public String getAdresseLigne1() {
		return adresseLigne1;
	}

	public void setAdresseLigne1(String adresseLigne1) {
		this.adresseLigne1 = adresseLigne1;
	}

	public String getAdresseLigne2() {
		return adresseLigne2;
	}

	public void setAdresseLigne2(String adresseLigne2) {
		this.adresseLigne2 = adresseLigne2;
	}

	public String getAdresseLigne3() {
		return adresseLigne3;
	}

	public void setAdresseLigne3(String adresseLigne3) {
		this.adresseLigne3 = adresseLigne3;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdresseDto(String adresseLigne1, String adresseLigne2,
			String adresseLigne3, String codePostal, String ville, String pays) {
		this.adresseLigne1 = adresseLigne1;
		this.adresseLigne2 = adresseLigne2;
		this.adresseLigne3 = adresseLigne3;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	@Override
	public String toString() {
		return "AdresseDto [adresseLigne1=" + adresseLigne1
				+ ", adresseLigne2=" + adresseLigne2 + ", adresseLigne3="
				+ adresseLigne3 + ", codePostal=" + codePostal + ", ville="
				+ ville + ", pays=" + pays + "]";
	}

}
