package fr.agefospme.rfi.domaine;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse implements Serializable {

	private String adresseLigne1;
	private String adresseLigne2;
	private String adresseLigne3;
	private String codePostal;
	private String ville;
	private String pays;
	
	public Adresse() {
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
	public Adresse(String adresseLigne1, String adresseLigne2,
			String adresseLigne3, String codePostal, String ville, String pays) {
		super();
		this.adresseLigne1 = adresseLigne1;
		this.adresseLigne2 = adresseLigne2;
		this.adresseLigne3 = adresseLigne3;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((adresseLigne1 == null) ? 0 : adresseLigne1.hashCode());
		result = prime * result
				+ ((adresseLigne2 == null) ? 0 : adresseLigne2.hashCode());
		result = prime * result
				+ ((adresseLigne3 == null) ? 0 : adresseLigne3.hashCode());
		result = prime * result
				+ ((codePostal == null) ? 0 : codePostal.hashCode());
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		Adresse other = (Adresse) obj;
		if (adresseLigne1 == null) {
			if (other.adresseLigne1 != null)
				return false;
		} else if (!adresseLigne1.equals(other.adresseLigne1))
			return false;
		if (adresseLigne2 == null) {
			if (other.adresseLigne2 != null)
				return false;
		} else if (!adresseLigne2.equals(other.adresseLigne2))
			return false;
		if (adresseLigne3 == null) {
			if (other.adresseLigne3 != null)
				return false;
		} else if (!adresseLigne3.equals(other.adresseLigne3))
			return false;
		if (codePostal == null) {
			if (other.codePostal != null)
				return false;
		} else if (!codePostal.equals(other.codePostal))
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Adresse [adresseLigne1=" + adresseLigne1 + ", adresseLigne2="
				+ adresseLigne2 + ", adresseLigne3=" + adresseLigne3
				+ ", codePostal=" + codePostal + ", ville=" + ville + ", pays="
				+ pays + "]";
	}

}
