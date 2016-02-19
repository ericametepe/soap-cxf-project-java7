
package fr.agefospme.rfi.ws.gestionindividu.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.agefospme.rfi.ws.gestionindividu.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsulterIndividuParIdentifiantMetierRequest_QNAME = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "consulterIndividuParIdentifiantMetierRequest");
    private final static QName _ConsulterIndividuParIdentifiantMetierResponse_QNAME = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "consulterIndividuParIdentifiantMetierResponse");
    private final static QName _ConsulterIndividuParNirEtNomDeNaissanceRequest_QNAME = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "ConsulterIndividuParNirEtNomDeNaissanceRequest");
    private final static QName _ConsulterIndividuParNirEtNomDeNaissanceResponse_QNAME = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "consulterIndividuParNirEtNomDeNaissanceResponse");
    private final static QName _CreerIndividuRequest_QNAME = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "creerIndividuRequest");
    private final static QName _CreerIndividuResponse_QNAME = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "CreerIndividuResponse");
    private final static QName _ModifierIndividuRequest_QNAME = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "modifierIndividuRequest");
    private final static QName _ModifierIndividuResponse_QNAME = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "modifierIndividuResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.agefospme.rfi.ws.gestionindividu.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsulterIndividuParIdentifiantMetierRequest }
     * 
     */
    public ConsulterIndividuParIdentifiantMetierRequest createConsulterIndividuParIdentifiantMetierRequest() {
        return new ConsulterIndividuParIdentifiantMetierRequest();
    }

    /**
     * Create an instance of {@link ConsulterIndividuParIdentifiantMetierResponse }
     * 
     */
    public ConsulterIndividuParIdentifiantMetierResponse createConsulterIndividuParIdentifiantMetierResponse() {
        return new ConsulterIndividuParIdentifiantMetierResponse();
    }

    /**
     * Create an instance of {@link ConsulterIndividuParNirEtNomDeNaissanceRequest }
     * 
     */
    public ConsulterIndividuParNirEtNomDeNaissanceRequest createConsulterIndividuParNirEtNomDeNaissanceRequest() {
        return new ConsulterIndividuParNirEtNomDeNaissanceRequest();
    }

    /**
     * Create an instance of {@link ConsulterIndividuParNirEtNomDeNaissanceResponse }
     * 
     */
    public ConsulterIndividuParNirEtNomDeNaissanceResponse createConsulterIndividuParNirEtNomDeNaissanceResponse() {
        return new ConsulterIndividuParNirEtNomDeNaissanceResponse();
    }

    /**
     * Create an instance of {@link CreerIndividuRequest }
     * 
     */
    public CreerIndividuRequest createCreerIndividuRequest() {
        return new CreerIndividuRequest();
    }

    /**
     * Create an instance of {@link CreerIndividuResponse }
     * 
     */
    public CreerIndividuResponse createCreerIndividuResponse() {
        return new CreerIndividuResponse();
    }

    /**
     * Create an instance of {@link ModifierIndividuRequest }
     * 
     */
    public ModifierIndividuRequest createModifierIndividuRequest() {
        return new ModifierIndividuRequest();
    }

    /**
     * Create an instance of {@link ModifierIndividuResponse }
     * 
     */
    public ModifierIndividuResponse createModifierIndividuResponse() {
        return new ModifierIndividuResponse();
    }

    /**
     * Create an instance of {@link Addresse }
     * 
     */
    public Addresse createAddresse() {
        return new Addresse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterIndividuParIdentifiantMetierRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:agefospme:rfi:GestionIndividu:1.0", name = "consulterIndividuParIdentifiantMetierRequest")
    public JAXBElement<ConsulterIndividuParIdentifiantMetierRequest> createConsulterIndividuParIdentifiantMetierRequest(ConsulterIndividuParIdentifiantMetierRequest value) {
        return new JAXBElement<ConsulterIndividuParIdentifiantMetierRequest>(_ConsulterIndividuParIdentifiantMetierRequest_QNAME, ConsulterIndividuParIdentifiantMetierRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterIndividuParIdentifiantMetierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:agefospme:rfi:GestionIndividu:1.0", name = "consulterIndividuParIdentifiantMetierResponse")
    public JAXBElement<ConsulterIndividuParIdentifiantMetierResponse> createConsulterIndividuParIdentifiantMetierResponse(ConsulterIndividuParIdentifiantMetierResponse value) {
        return new JAXBElement<ConsulterIndividuParIdentifiantMetierResponse>(_ConsulterIndividuParIdentifiantMetierResponse_QNAME, ConsulterIndividuParIdentifiantMetierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterIndividuParNirEtNomDeNaissanceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:agefospme:rfi:GestionIndividu:1.0", name = "ConsulterIndividuParNirEtNomDeNaissanceRequest")
    public JAXBElement<ConsulterIndividuParNirEtNomDeNaissanceRequest> createConsulterIndividuParNirEtNomDeNaissanceRequest(ConsulterIndividuParNirEtNomDeNaissanceRequest value) {
        return new JAXBElement<ConsulterIndividuParNirEtNomDeNaissanceRequest>(_ConsulterIndividuParNirEtNomDeNaissanceRequest_QNAME, ConsulterIndividuParNirEtNomDeNaissanceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterIndividuParNirEtNomDeNaissanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:agefospme:rfi:GestionIndividu:1.0", name = "consulterIndividuParNirEtNomDeNaissanceResponse")
    public JAXBElement<ConsulterIndividuParNirEtNomDeNaissanceResponse> createConsulterIndividuParNirEtNomDeNaissanceResponse(ConsulterIndividuParNirEtNomDeNaissanceResponse value) {
        return new JAXBElement<ConsulterIndividuParNirEtNomDeNaissanceResponse>(_ConsulterIndividuParNirEtNomDeNaissanceResponse_QNAME, ConsulterIndividuParNirEtNomDeNaissanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerIndividuRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:agefospme:rfi:GestionIndividu:1.0", name = "creerIndividuRequest")
    public JAXBElement<CreerIndividuRequest> createCreerIndividuRequest(CreerIndividuRequest value) {
        return new JAXBElement<CreerIndividuRequest>(_CreerIndividuRequest_QNAME, CreerIndividuRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerIndividuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:agefospme:rfi:GestionIndividu:1.0", name = "CreerIndividuResponse")
    public JAXBElement<CreerIndividuResponse> createCreerIndividuResponse(CreerIndividuResponse value) {
        return new JAXBElement<CreerIndividuResponse>(_CreerIndividuResponse_QNAME, CreerIndividuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierIndividuRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:agefospme:rfi:GestionIndividu:1.0", name = "modifierIndividuRequest")
    public JAXBElement<ModifierIndividuRequest> createModifierIndividuRequest(ModifierIndividuRequest value) {
        return new JAXBElement<ModifierIndividuRequest>(_ModifierIndividuRequest_QNAME, ModifierIndividuRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierIndividuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:agefospme:rfi:GestionIndividu:1.0", name = "modifierIndividuResponse")
    public JAXBElement<ModifierIndividuResponse> createModifierIndividuResponse(ModifierIndividuResponse value) {
        return new JAXBElement<ModifierIndividuResponse>(_ModifierIndividuResponse_QNAME, ModifierIndividuResponse.class, null, value);
    }

}
