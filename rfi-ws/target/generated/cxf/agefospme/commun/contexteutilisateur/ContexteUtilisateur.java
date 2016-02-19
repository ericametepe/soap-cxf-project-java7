
package agefospme.commun.contexteutilisateur;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour contexteUtilisateur complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="contexteUtilisateur"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codeSite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="applicationOrigine" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contexteUtilisateur", propOrder = {
    "login",
    "codeSite",
    "applicationOrigine"
})
public class ContexteUtilisateur {

    @XmlElement(required = true)
    protected String login;
    @XmlElement(required = true)
    protected String codeSite;
    @XmlElement(required = true)
    protected String applicationOrigine;

    /**
     * Obtient la valeur de la propriété login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Définit la valeur de la propriété login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtient la valeur de la propriété codeSite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSite() {
        return codeSite;
    }

    /**
     * Définit la valeur de la propriété codeSite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSite(String value) {
        this.codeSite = value;
    }

    /**
     * Obtient la valeur de la propriété applicationOrigine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationOrigine() {
        return applicationOrigine;
    }

    /**
     * Définit la valeur de la propriété applicationOrigine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationOrigine(String value) {
        this.applicationOrigine = value;
    }

}
