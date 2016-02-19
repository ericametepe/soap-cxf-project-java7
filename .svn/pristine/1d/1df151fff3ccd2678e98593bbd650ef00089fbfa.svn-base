package fr.agefospme.referentiel.individu.service;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class InfoConsultationIdMetierDto implements Serializable {
	
	@NotNull
	@NotBlank
	@Pattern(regexp="[0-9]{8}")
	private String idMetier;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getIdMetier() {
		return idMetier;
	}

	public void setIdMetier(String idMetier) {
		this.idMetier = idMetier;
	}

	@Override
	public String toString() {
		return "InfoConsultationIdMetierDto [idMetier=" + idMetier + "]";
	}

}
