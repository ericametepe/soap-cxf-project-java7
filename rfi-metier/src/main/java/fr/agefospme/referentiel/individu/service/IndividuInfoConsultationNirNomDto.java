package fr.agefospme.referentiel.individu.service;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class IndividuInfoConsultationNirNomDto implements Serializable {

	@NotNull
	@NotBlank
	@Pattern(regexp = "[a-zA-Z0-9]{13}", message="{Pattern.IndividuInfoCreationDto.nir.custom}")
	private String nir;

	@NotNull
	@NotBlank(message = "{Pattern.IndividuInfoCreationDto.nomDeNaissance.custom}")
	@Size(max = 50)
	@Pattern(regexp ="[A-Z]+", message = "{Pattern.IndividuInfoCreationDto.nomDeNaissance.custom}")
	private String nomDeNaissance;
	
	
	public IndividuInfoConsultationNirNomDto() {
	}
	
	
	

	public String getNir() {
		return nir;
	}

	public void setNir(String nir) {
		this.nir = nir;
	}

	public String getNomDeNaissance() {
		return nomDeNaissance;
	}

	public void setNomDeNaissance(String nomDeNaissance) {
		this.nomDeNaissance = nomDeNaissance;
	}

	@Override
	public String toString() {
		return "IndividuInfoConsultationDto [nir=" + nir + ", nomDeNaissance="
				+ nomDeNaissance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nir == null) ? 0 : nir.hashCode());
		result = prime * result
				+ ((nomDeNaissance == null) ? 0 : nomDeNaissance.hashCode());
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
		IndividuInfoConsultationNirNomDto other = (IndividuInfoConsultationNirNomDto) obj;
		if (nir == null) {
			if (other.nir != null)
				return false;
		} else if (!nir.equals(other.nir))
			return false;
		if (nomDeNaissance == null) {
			if (other.nomDeNaissance != null)
				return false;
		} else if (!nomDeNaissance.equals(other.nomDeNaissance))
			return false;
		return true;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1068751939591039919L;

}
