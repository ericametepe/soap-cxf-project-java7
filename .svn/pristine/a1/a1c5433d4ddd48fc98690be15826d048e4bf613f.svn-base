package fr.agefospme.referentiel.individu.service;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

/**
 * 
 * @author ykodjovi - L’application d’origine, le Portail DGA CPF ou NSI V2 par
 *         exemple - Le login de l’utilisateur dans cette application - Le code
 *         du site AGEFOS auquel est rattaché l’utilisateur
 */
public class UtilisateurAgefosDto implements Serializable {
	@NotNull
	@NotBlank
	private String login;
	@NotNull
	@NotBlank
	private String codeSite;
	@NotNull
	@NotBlank
	private String applicationOrigine;

	public UtilisateurAgefosDto() {
	}

	public UtilisateurAgefosDto(String login, String codeSite,
			String applicationOrigine) {
		this.login = login;
		this.codeSite = codeSite;
		this.applicationOrigine = applicationOrigine;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getCodeSite() {
		return codeSite;
	}

	public void setCodeSite(String codeSite) {
		this.codeSite = codeSite;
	}

	public String getApplicationOrigine() {
		return applicationOrigine;
	}

	public void setApplicationOrigine(String applicationOrigine) {
		this.applicationOrigine = applicationOrigine;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((applicationOrigine == null) ? 0 : applicationOrigine
						.hashCode());
		result = prime * result
				+ ((codeSite == null) ? 0 : codeSite.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UtilisateurAgefosDto other = (UtilisateurAgefosDto) obj;
		if (applicationOrigine == null) {
			if (other.applicationOrigine != null)
				return false;
		} else if (!applicationOrigine.equals(other.applicationOrigine))
			return false;
		if (codeSite == null) {
			if (other.codeSite != null)
				return false;
		} else if (!codeSite.equals(other.codeSite))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UtilisateurAgefosDto [login=" + login + ", codeSite="
				+ codeSite + ", applicationOrigine=" + applicationOrigine + "]";
	}

}
