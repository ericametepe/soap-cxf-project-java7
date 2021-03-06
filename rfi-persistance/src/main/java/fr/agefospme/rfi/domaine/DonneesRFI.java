package fr.agefospme.rfi.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class DonneesRFI implements Serializable {
	
	@SequenceGenerator(name="DONNE_RFI_GEN",sequenceName="DONNE_RFI_SEQ")
	@Id @GeneratedValue(generator="DONNE_RFI_GEN")
	private int id;
	@NotNull
	@Column(nullable=false,length=6)
	private String codeListe;
	@NotNull
	@Column(nullable=false)
	private String code;
	@Column(nullable=false)
	private String libelle;
	
	private String libelleLong;

	public DonneesRFI() {
	}

	public DonneesRFI(String nomListe, String code,
			String libelle, String libelleLong) {
		
		this.codeListe = nomListe;
		this.code = code;
		this.libelle = libelle;
		this.libelleLong = libelleLong;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodeListe() {
		return codeListe;
	}

	public void setNomListe(String nomListe) {
		this.codeListe = nomListe;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelleLong() {
		return libelleLong;
	}

	public void setLibelleLong(String libelleLong) {
		this.libelleLong = libelleLong;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result
				+ ((libelleLong == null) ? 0 : libelleLong.hashCode());
		result = prime * result
				+ ((codeListe == null) ? 0 : codeListe.hashCode());
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
		DonneesRFI other = (DonneesRFI) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (libelleLong == null) {
			if (other.libelleLong != null)
				return false;
		} else if (!libelleLong.equals(other.libelleLong))
			return false;
		if (codeListe == null) {
			if (other.codeListe != null)
				return false;
		} else if (!codeListe.equals(other.codeListe))
			return false;
		return true;
	}

}
