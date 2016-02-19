package fr.agefospme.rfi.domaine;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.Valid;
import javax.validation.constraints.Size;

@Entity
public class Individu implements Serializable {
	

	@SequenceGenerator(name="IND_GEN",sequenceName="IND_SEQ")
	@Id @GeneratedValue(generator="IND_GEN")
	private Long id;
	@Column(length = 8, unique = true,nullable=false)
	private String idMetier;
	@Column(length = 13, unique = true, nullable=false)
	private String nir;
	@Size(min=1,max=50)
	@Column(nullable=false)
	private String nomDeNaissance;
	@Column(nullable=false)
	private String prenom;
	@Column(nullable=false, length=1)
	private String civilite;
	@Column(nullable=false,length=1)
	private String situationProfessionnelle;
	@Column(nullable=false)

	private Date dateDeNaissance;
	private String telephone;
	@Column(nullable=false)
	@Embedded
	@Valid
	private Adresse adresseDomiciliation;
	private String email;
	@Column(nullable=false)
	private boolean rattachementCPF;



	public Individu() {
	}
	
	
	public Individu( String idMetier, String nir,
			String nomDeNaissance, String prenom, String civilite,
			String situationProfessionnelle, Date dateDeNaissance,
			String telephone, Adresse adresseDomiciliation, String email,
			boolean rattachementCPF) {
		this.idMetier = idMetier;
		this.nir = nir;
		this.nomDeNaissance = nomDeNaissance;
		this.prenom = prenom;
		this.civilite = civilite;
		this.situationProfessionnelle = situationProfessionnelle;
		this.dateDeNaissance = dateDeNaissance;
		this.telephone = telephone;
		this.adresseDomiciliation = adresseDomiciliation;
		this.email = email;
		this.rattachementCPF = rattachementCPF;
	}
	private static final long serialVersionUID = -4628230209437580214L;


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

	public Adresse getAdresseDomiciliation() {
		return adresseDomiciliation;
	}

	public void setAdresseDomiciliation(Adresse adresseDomiciliation) {
		this.adresseDomiciliation = adresseDomiciliation;
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
		return "Individu [id=" + id + ", idMetier=" + idMetier + ", nir=" + nir
				+ ", nomDeNaissance=" + nomDeNaissance + ", prenom=" + prenom
				+ ", civilite=" + civilite + ", situationProfessionnelle="
				+ situationProfessionnelle + ", dateDeNaissance="
				+ dateDeNaissance + ", telephone=" + telephone
				+ ", adresseDomiciliation=" + adresseDomiciliation + ", email="
				+ email + ", rattachementCPF=" + rattachementCPF + "]";
	}



	

}
