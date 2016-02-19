package fr.agefospme.referentiel.individu.service;

import java.util.Date;

public class IndividuDto {
	private Long id;
	private String idMetier;
	private String nir;
	private String nomDeNaissance;
	private String prenom;
	private String civilite;
	private String situationProfessionnelle;
	private Date dateDeNaissance;
	private String telephone;
	private AdresseDto adresseDto;
	
	private String email;
	private boolean rattachementCPF;
	
	public IndividuDto() {
	}
	
	
	public IndividuDto(Long id, String idMetier, String nir,
			String nomDeNaissance, String prenom, String civilite,
			String situationProfessionnelle, Date dateDeNaissance,
			String telephone, AdresseDto adresseDomiciliation,
			UtilisateurAgefosDto utilisateurAgefos, String email,
			boolean rattachementCPF) {
		this.id = id;
		this.idMetier = idMetier;
		this.nir = nir;
		this.nomDeNaissance = nomDeNaissance;
		this.prenom = prenom;
		this.civilite = civilite;
		this.situationProfessionnelle = situationProfessionnelle;
		this.dateDeNaissance = dateDeNaissance;
		this.telephone = telephone;
		this.adresseDto = adresseDomiciliation;
		this.email = email;
		this.rattachementCPF = rattachementCPF;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdMetier() {
		return idMetier;
	}
	public void setIdMetier(String idMetier) {
		this.idMetier = idMetier;
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





	@Override
	public String toString() {
		return "IndividuDto [id=" + id + ", idMetier=" + idMetier + ", nir="
				+ nir + ", nomDeNaissance=" + nomDeNaissance + ", prenom="
				+ prenom + ", civilite=" + civilite
				+ ", situationProfessionnelle=" + situationProfessionnelle
				+ ", dateDeNaissance=" + dateDeNaissance + ", telephone="
				+ telephone + ", adresse=" + adresseDto + ", email=" + email
				+ ", rattachementCPF=" + rattachementCPF + "]";
	}


	public AdresseDto getAdresseDto() {
		return adresseDto;
	}


	public void setAdresseDto(AdresseDto adresseDto) {
		this.adresseDto = adresseDto;
	}



	



	
	

}
