
package fr.agefospme.rfi.ws.gestionindividu.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour CreerIndividuRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CreerIndividuRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomDeNaissance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="civilite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dateDeNaissance" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="situationProfessionnelle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rattachementCPF" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="adresseDeDomiciliation" type="{urn:agefospme:rfi:GestionIndividu:1.0}addresse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreerIndividuRequest", propOrder = {
    "nir",
    "nomDeNaissance",
    "prenom",
    "civilite",
    "dateDeNaissance",
    "situationProfessionnelle",
    "email",
    "telephone",
    "rattachementCPF",
    "adresseDeDomiciliation"
})
public class CreerIndividuRequest {

    @XmlElement(required = true)
    protected String nir;
    @XmlElement(required = true)
    protected String nomDeNaissance;
    @XmlElement(required = true)
    protected String prenom;
    @XmlElement(required = true)
    protected String civilite;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateDeNaissance;
    @XmlElement(required = true)
    protected String situationProfessionnelle;
    protected String email;
    protected String telephone;
    protected boolean rattachementCPF;
    @XmlElement(required = true)
    protected Addresse adresseDeDomiciliation;

    /**
     * Obtient la valeur de la propriété nir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNir() {
        return nir;
    }

    /**
     * Définit la valeur de la propriété nir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNir(String value) {
        this.nir = value;
    }

    /**
     * Obtient la valeur de la propriété nomDeNaissance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDeNaissance() {
        return nomDeNaissance;
    }

    /**
     * Définit la valeur de la propriété nomDeNaissance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDeNaissance(String value) {
        this.nomDeNaissance = value;
    }

    /**
     * Obtient la valeur de la propriété prenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit la valeur de la propriété prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

    /**
     * Obtient la valeur de la propriété civilite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilite() {
        return civilite;
    }

    /**
     * Définit la valeur de la propriété civilite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilite(String value) {
        this.civilite = value;
    }

    /**
     * Obtient la valeur de la propriété dateDeNaissance.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * Définit la valeur de la propriété dateDeNaissance.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDeNaissance(XMLGregorianCalendar value) {
        this.dateDeNaissance = value;
    }

    /**
     * Obtient la valeur de la propriété situationProfessionnelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituationProfessionnelle() {
        return situationProfessionnelle;
    }

    /**
     * Définit la valeur de la propriété situationProfessionnelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituationProfessionnelle(String value) {
        this.situationProfessionnelle = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété telephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Définit la valeur de la propriété telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Obtient la valeur de la propriété rattachementCPF.
     * 
     */
    public boolean isRattachementCPF() {
        return rattachementCPF;
    }

    /**
     * Définit la valeur de la propriété rattachementCPF.
     * 
     */
    public void setRattachementCPF(boolean value) {
        this.rattachementCPF = value;
    }

    /**
     * Obtient la valeur de la propriété adresseDeDomiciliation.
     * 
     * @return
     *     possible object is
     *     {@link Addresse }
     *     
     */
    public Addresse getAdresseDeDomiciliation() {
        return adresseDeDomiciliation;
    }

    /**
     * Définit la valeur de la propriété adresseDeDomiciliation.
     * 
     * @param value
     *     allowed object is
     *     {@link Addresse }
     *     
     */
    public void setAdresseDeDomiciliation(Addresse value) {
        this.adresseDeDomiciliation = value;
    }

}
