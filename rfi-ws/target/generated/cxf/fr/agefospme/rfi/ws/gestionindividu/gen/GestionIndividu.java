package fr.agefospme.rfi.ws.gestionindividu.gen;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2016-02-19T17:16:13.915+01:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "GestionIndividu", 
                  wsdlLocation = "file:/Users/kodjovi1/Documents/workspace/rfi-ws/rfi-ws/wsdl/GestionIndividu_1.0.wsdl",
                  targetNamespace = "urn:agefospme:rfi:GestionIndividu:1.0") 
public class GestionIndividu extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "GestionIndividu");
    public final static QName GestionIndividuPort = new QName("urn:agefospme:rfi:GestionIndividu:1.0", "GestionIndividuPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/kodjovi1/Documents/workspace/rfi-ws/rfi-ws/wsdl/GestionIndividu_1.0.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GestionIndividu.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/kodjovi1/Documents/workspace/rfi-ws/rfi-ws/wsdl/GestionIndividu_1.0.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GestionIndividu(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GestionIndividu(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionIndividu() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns GestionIndividuPortType
     */
    @WebEndpoint(name = "GestionIndividuPort")
    public GestionIndividuPortType getGestionIndividuPort() {
        return super.getPort(GestionIndividuPort, GestionIndividuPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionIndividuPortType
     */
    @WebEndpoint(name = "GestionIndividuPort")
    public GestionIndividuPortType getGestionIndividuPort(WebServiceFeature... features) {
        return super.getPort(GestionIndividuPort, GestionIndividuPortType.class, features);
    }

}
