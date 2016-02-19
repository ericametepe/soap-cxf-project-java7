
package fr.agefospme.rfi.ws.gestionindividu.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConsulterIndividuParNirEtNomDeNaissanceRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConsulterIndividuParNirEtNomDeNaissanceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nir" type="{urn:agefospme:rfi:GestionIndividu:1.0}nir"/&gt;
 *         &lt;element name="nomDeNaissance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsulterIndividuParNirEtNomDeNaissanceRequest", propOrder = {
    "nir",
    "nomDeNaissance"
})
public class ConsulterIndividuParNirEtNomDeNaissanceRequest {

    @XmlElement(required = true)
    protected String nir;
    @XmlElement(required = true)
    protected String nomDeNaissance;

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

}
