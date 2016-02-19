package fr.agefospme.rfi.domaine;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * 
 * @author ykodjovi
 * Duplication de tous les champs de la table Individu
 *
 */

@Entity
@Table(name="HISTORIQUE")
public class IndividuHistorique {
	@SequenceGenerator(name="HISTO_IND_SEQ_GEN",sequenceName="HISTO_IND_SEQ")
	@Id @GeneratedValue(generator="HISTO_IND_SEQ_GEN")
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TypeEvenement typeEvt;
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private DateTime dateEvenement;

	@Column(length = 8)
	private String idMetier;
	@Column(length = 13, unique = true, nullable=false)
	private String nir;
	@Column(nullable=false)
	private String nomDeNaissance;
	@Column(nullable=false)
	private String prenom;
	@Column(nullable=false)
	private String civilite;
	@Column(nullable=false)
	private String situationProfessionnelle;
	@Column(nullable=false)
	@Past(message = "une date anterieure svp")
	private Date dateDeNaissance;
	private String telephone;
	@Column(nullable=false)
	@Embedded
	private Adresse adresseDomiciliation;
	private String email;
	@Column(nullable=false)
	private boolean rattachementCPF;
	@NotNull
	@Embedded
	private UtilisateurAgefos utilisateurAgefos;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TypeEvenement getTypeEvt() {
		return typeEvt;
	}
	public void setTypeEvt(TypeEvenement typeEvt) {
		this.typeEvt = typeEvt;
	}
	public DateTime getDateEvenement() {
		return dateEvenement;
	}
	public void setDateEvenement(DateTime dateEvenement) {
		this.dateEvenement = dateEvenement;
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
		return "IndividuHistorique [id=" + id + ", typeEvt=" + typeEvt
				+ ", dateEvenement=" + dateEvenement + ", idMetier=" + idMetier
				+ ", nir=" + nir + ", nomDeNaissance=" + nomDeNaissance
				+ ", prenom=" + prenom + ", civilite=" + civilite
				+ ", situationProfessionnelle=" + situationProfessionnelle
				+ ", dateDeNaissance=" + dateDeNaissance + ", telephone="
				+ telephone + ", adresseDomiciliation=" + adresseDomiciliation
				+ ", email=" + email + ", rattachementCPF=" + rattachementCPF
				+ "]";
	}
	public UtilisateurAgefos getUtilisateurAgefos() {
		return utilisateurAgefos;
	}
	public void setUtilisateurAgefos(UtilisateurAgefos utilisateurAgefos) {
		this.utilisateurAgefos = utilisateurAgefos;
	}


}
