package com.bakki.test.tshirt;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2014-12-25T21:03:31.410-05:00
 * Generated source version: 2.5.1
 * 
 */
@WebServiceClient(name = "TshirtService", 
                  wsdlLocation = "file:/I:/MULE_WRKSPCE/web-service-consumer/src/main/resources/tshirt.wsdl",
                  targetNamespace = "http://mulesoft.org/tshirt-service") 
public class TshirtService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://mulesoft.org/tshirt-service", "TshirtService");
    public final static QName TshirtServicePort = new QName("http://mulesoft.org/tshirt-service", "TshirtServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/I:/MULE_WRKSPCE/web-service-consumer/src/main/resources/tshirt.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TshirtService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/I:/MULE_WRKSPCE/web-service-consumer/src/main/resources/tshirt.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TshirtService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TshirtService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TshirtService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns TshirtServicePortType
     */
    @WebEndpoint(name = "TshirtServicePort")
    public TshirtServicePortType getTshirtServicePort() {
        return super.getPort(TshirtServicePort, TshirtServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TshirtServicePortType
     */
    @WebEndpoint(name = "TshirtServicePort")
    public TshirtServicePortType getTshirtServicePort(WebServiceFeature... features) {
        return super.getPort(TshirtServicePort, TshirtServicePortType.class, features);
    }

}