
package fr.agefospme.rfi.ws.gestionindividu.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addresse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addresse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresseLigne1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adresseLigne2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adresseLigne3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePostal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addresse", propOrder = {
    "adresseLigne1",
    "adresseLigne2",
    "adresseLigne3",
    "codePostal",
    "ville",
    "pays"
})
public class Addresse {

    @XmlElement(required = true)
    protected String adresseLigne1;
    protected String adresseLigne2;
    protected String adresseLigne3;
    @XmlElement(required = true)
    protected String codePostal;
    @XmlElement(required = true)
    protected String ville;
    @XmlElement(required = true)
    protected String pays;

    /**
     * Obtient la valeur de la propriété adresseLigne1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseLigne1() {
        return adresseLigne1;
    }

    /**
     * Définit la valeur de la propriété adresseLigne1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseLigne1(String value) {
        this.adresseLigne1 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseLigne2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseLigne2() {
        return adresseLigne2;
    }

    /**
     * Définit la valeur de la propriété adresseLigne2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseLigne2(String value) {
        this.adresseLigne2 = value;
    }

    /**
     * Obtient la valeur de la propriété adresseLigne3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresseLigne3() {
        return adresseLigne3;
    }

    /**
     * Définit la valeur de la propriété adresseLigne3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresseLigne3(String value) {
        this.adresseLigne3 = value;
    }

    /**
     * Obtient la valeur de la propriété codePostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Définit la valeur de la propriété codePostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePostal(String value) {
        this.codePostal = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

    /**
     * Obtient la valeur de la propriété pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * Définit la valeur de la propriété pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

}
