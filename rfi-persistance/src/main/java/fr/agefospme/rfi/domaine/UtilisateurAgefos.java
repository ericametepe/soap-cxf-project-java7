package fr.agefospme.rfi.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * 
 * @author ykodjovi
 *
 */

@Embeddable
public class UtilisateurAgefos implements Serializable {
    @Column(nullable=false)
	private String login;
    @Column(nullable=false)
	private String codeSite;
    @Column(nullable=false)
	private String applicationOrigine;
	
	public UtilisateurAgefos() {
		
	}
	
	
	public UtilisateurAgefos(String login, String codeSite,
			String applicationOrigine) {
		this.login = login;
		this.codeSite = codeSite;
		this.applicationOrigine = applicationOrigine;
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
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


	@Override
	public String toString() {
		return "UtilisateurAgefos [login=" + login + ", codeSite=" + codeSite
				+ ", applicationOrigine=" + applicationOrigine + "]";
	}


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
		UtilisateurAgefos other = (UtilisateurAgefos) obj;
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

}
