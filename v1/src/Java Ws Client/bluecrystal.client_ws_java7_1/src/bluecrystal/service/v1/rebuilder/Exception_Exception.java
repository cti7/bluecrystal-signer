
package bluecrystal.service.v1.rebuilder;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://rebuilder.v1.service.bluecrystal/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private bluecrystal.service.v1.rebuilder.Exception faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public Exception_Exception(String message, bluecrystal.service.v1.rebuilder.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public Exception_Exception(String message, bluecrystal.service.v1.rebuilder.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: bluecrystal.service.v1.rebuilder.Exception
     */
    public bluecrystal.service.v1.rebuilder.Exception getFaultInfo() {
        return faultInfo;
    }

}
