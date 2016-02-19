package fr.agefospme.referentiel.individu.service;

import java.io.Serializable;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class IndividuInfoModificationDto implements Serializable {
	
	@NotNull
	@NotBlank
	@Pattern(regexp="[0-9]{8}")
	private String idMetier;
	
	@NotNull
	@NotBlank( message="{Pattern.IndividuInfoCreationDto.nomDeNaissance.custom}")
	@Size(max=50)
	@Pattern(regexp="[A-Z]+", message="{Pattern.IndividuInfoCreationDto.nomDeNaissance.custom}")
	private String nomDeNaissance;
	@NotNull
	@NotBlank( message="{Pattern.IndividuInfoCreationDto.prenom.custom}")
	@Pattern(regexp="[A-Z]+", message="{Pattern.IndividuInfoCreationDto.prenom.custom}")
	private String prenom;
	@NotNull
	@NotBlank
	private String civilite;
	@NotNull
	@NotBlank
	private String situationProfessionnelle;
	@NotNull
	@Past(message="une date anterieure svp")
	private Date dateDeNaissance;
	@NotNull
	@Valid
	private AdresseDto adresseDto;
	
	private String telephone;
	@Pattern(regexp="[^@]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+", message="{Pattern.IndividuInfoCreationDto.email.custom}")
	private String email;
	@NotNull
	private boolean rattachementCPF;
	@NotNull
	@Valid
	private UtilisateurAgefosDto utilisateurAgefosDto;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6516853779196979257L;
	

	public IndividuInfoModificationDto() {
		
	}


	public String getIdMetier() {
		return idMetier;
	}


	public void setIdMetier(String idMetier) {
		this.idMetier = idMetier;
	}


	public String getNomDeNaissance() {
		return nomDeNaissance;
	}


	public void setNomDeNaissance(String nomDeNaissance) {
		this.nomDeNaissance = nomDeNaissance;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getCivilite() {
		return civilite;
	}


	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}


	public String getSituationProfessionnelle() {
		return situationProfessionnelle;
	}


	public void setSituationProfessionnelle(String situationProfessionnelle) {
		this.situationProfessionnelle = situationProfessionnelle;
	}


	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}


	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}


	public AdresseDto getAdresseDto() {
		return adresseDto;
	}


	public void setAdresseDto(AdresseDto adresseDto) {
		this.adresseDto = adresseDto;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isRattachementCPF() {
		return rattachementCPF;
	}


	public void setRattachementCPF(boolean rattachementCPF) {
		this.rattachementCPF = rattachementCPF;
	}


	public UtilisateurAgefosDto getUtilisateurAgefosDto() {
		return utilisateurAgefosDto;
	}


	public void setUtilisateurAgefosDto(UtilisateurAgefosDto utilisateurAgefosDto) {
		this.utilisateurAgefosDto = utilisateurAgefosDto;
	}


	@Override
	public String toString() {
		return "IndividuInfoModificationDto [idMetier=" + idMetier
				+ ", nomDeNaissance=" + nomDeNaissance + ", prenom=" + prenom
				+ ", civilite=" + civilite + ", situationProfessionnelle="
				+ situationProfessionnelle + ", dateDeNaissance="
				+ dateDeNaissance + ", adresseDto=" + adresseDto
				+ ", telephone=" + telephone + ", email=" + email
				+ ", rattachementCPF=" + rattachementCPF
				+ ", utilisateurAgefosDto=" + utilisateurAgefosDto + "]";
	}

}
