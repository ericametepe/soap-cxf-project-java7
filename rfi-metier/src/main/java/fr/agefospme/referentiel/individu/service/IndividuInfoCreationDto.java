package fr.agefospme.referentiel.individu.service;

import java.io.Serializable;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
/**
 * 
 * @author ykodjovi
 *-	Son NIR, communément appelé numéro de sécurité sociale (chaîne de 13 caractères), ici utilisé comme identifiant du compteur CPF.
-	Son nom de naissance
-	Son prénom
-	Sa civilité
-	Sa situation professionnelle, indiquant si l’individu est salarié ou demandeur d’emploi
-	Sa date de naissance
-	Son adresse de domiciliation = Adresse postale Code postal -	Ville - Pays de domiciliation
-	Son numéro de téléphone
-	Son adresse e-Mail
-	Son rattachement à un établissement adhérent à l’AGEFOS pour le CPF ou non


 */
public class IndividuInfoCreationDto implements Serializable {
	@NotNull
	@NotBlank
	@Pattern(regexp="[a-zA-Z0-9]{13}", message="{Pattern.IndividuInfoCreationDto.nir.custom}")
	private String nir;
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
	@Size(min=1,max=1)
	@NotBlank
	private String civilite;
	@NotNull
	@NotBlank
	@Size(min=1,max=1)
	private String situationProfessionnelle;
	@NotNull
	@Past(message="une date anterieure svp")
	private Date dateDeNaissance;
	@NotNull
	@Valid
	private AdresseDto adresseDto;

    @Pattern(regexp="(0|\\+33|0033)[1-9][0-9]{8}",message="{Pattern.IndividuInfoCreationDto.telephone.custom}")
    
	private String telephone;
	@Pattern(regexp="[^@]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+",message="{Pattern.IndividuInfoCreationDto.email.custom}")
	private String email;
	@NotNull
	private boolean rattachementCPF;
	@NotNull
	@Valid
	private UtilisateurAgefosDto utilisateurAgefosDto;
	
	
	public IndividuInfoCreationDto() {
	}
	


	public IndividuInfoCreationDto(String nir, String nomDeNaissance,
			String prenom, String civilite, String situationProfessionnelle,
			Date dateDeNaissance, AdresseDto adresse, String telephone,
			String email, boolean rattachementCPF,
			UtilisateurAgefosDto utilisateurAgefosDto) {
		this.nir = nir;
		this.nomDeNaissance = nomDeNaissance;
		this.prenom = prenom;
		this.civilite = civilite;
		this.situationProfessionnelle = situationProfessionnelle;
		this.dateDeNaissance = dateDeNaissance;
		this.adresseDto = adresse;
		this.telephone = telephone;
		this.email = email;
		this.rattachementCPF = rattachementCPF;
		this.utilisateurAgefosDto = utilisateurAgefosDto;
	}







	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




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








	public UtilisateurAgefosDto getUtilisateurAgefosDto() {
		return utilisateurAgefosDto;
	}




	public void setUtilisateurAgefosDto(UtilisateurAgefosDto utilisateurAgefosDto) {
		this.utilisateurAgefosDto = utilisateurAgefosDto;
	}





	public boolean isRattachementCPF() {
		return rattachementCPF;
	}







	public void setRattachementCPF(boolean rattachementCPF) {
		this.rattachementCPF = rattachementCPF;
	}



	public AdresseDto getAdresseDto() {
		return adresseDto;
	}



	public void setAdresseDto(AdresseDto adresseDto) {
		this.adresseDto = adresseDto;
	}



	@Override
	public String toString() {
		return "IndividuInfoCreationDto [nir=" + nir + ", nomDeNaissance="
				+ nomDeNaissance + ", prenom=" + prenom + ", civilite="
				+ civilite + ", situationProfessionnelle="
				+ situationProfessionnelle + ", dateDeNaissance="
				+ dateDeNaissance + ", adresseDto=" + adresseDto
				+ ", telephone=" + telephone + ", email=" + email
				+ ", rattachementCPF=" + rattachementCPF
				+ ", utilisateurAgefosDto=" + utilisateurAgefosDto + "]";
	}










}
