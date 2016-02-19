
package fr.agefospme.rfi.ws.gestionindividu.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.4
 * 2016-02-19T17:16:13.861+01:00
 * Generated source version: 3.0.4
 */

@WebFault(name = "erreur", targetNamespace = "urn:agefospme:commun:Erreur")
public class ModifierIndividuFault extends Exception {
    public static final long serialVersionUID = 1L;
    
    private agefospme.commun.erreur.Erreur erreur;

    public ModifierIndividuFault() {
        super();
    }
    
    public ModifierIndividuFault(String message) {
        super(message);
    }
    
    public ModifierIndividuFault(String message, Throwable cause) {
        super(message, cause);
    }

    public ModifierIndividuFault(String message, agefospme.commun.erreur.Erreur erreur) {
        super(message);
        this.erreur = erreur;
    }

    public ModifierIndividuFault(String message, agefospme.commun.erreur.Erreur erreur, Throwable cause) {
        super(message, cause);
        this.erreur = erreur;
    }

    public agefospme.commun.erreur.Erreur getFaultInfo() {
        return this.erreur;
    }
}