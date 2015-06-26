
package bluecrystal.service.v1.icpbr;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "icpbrService", targetNamespace = "http://icpbr.v1.service.bluecrystal/", wsdlLocation = "http://localhost:8080/bluecrystal.ws.tc_1/serv/icpbr_1?wsdl")
public class IcpbrService_Service
    extends Service
{

    private final static URL ICPBRSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(bluecrystal.service.v1.icpbr.IcpbrService_Service.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = bluecrystal.service.v1.icpbr.IcpbrService_Service.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/bluecrystal.ws.tc_1/serv/icpbr_1?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/bluecrystal.ws.tc_1/serv/icpbr_1?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ICPBRSERVICE_WSDL_LOCATION = url;
    }

    public IcpbrService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IcpbrService_Service() {
        super(ICPBRSERVICE_WSDL_LOCATION, new QName("http://icpbr.v1.service.bluecrystal/", "icpbrService"));
    }

    /**
     * 
     * @return
     *     returns IcpbrService
     */
    @WebEndpoint(name = "icpbrPort")
    public IcpbrService getIcpbrPort() {
        return super.getPort(new QName("http://icpbr.v1.service.bluecrystal/", "icpbrPort"), IcpbrService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IcpbrService
     */
    @WebEndpoint(name = "icpbrPort")
    public IcpbrService getIcpbrPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://icpbr.v1.service.bluecrystal/", "icpbrPort"), IcpbrService.class, features);
    }

}
