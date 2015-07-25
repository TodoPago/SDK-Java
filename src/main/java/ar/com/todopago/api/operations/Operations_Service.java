
package ar.com.todopago.api.operations;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Operations", targetNamespace = "http://api.todopago.com.ar", wsdlLocation = "file:/D:/WorkspaceJuno/TodoPago-sdk/res/Operations.wsdl")
public class Operations_Service
    extends Service
{

    private final static URL OPERATIONS_WSDL_LOCATION;
    private final static WebServiceException OPERATIONS_EXCEPTION;
    private final static QName OPERATIONS_QNAME = new QName("http://api.todopago.com.ar", "Operations");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/WorkspaceJuno/TodoPago-sdk/res/Operations.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERATIONS_WSDL_LOCATION = url;
        OPERATIONS_EXCEPTION = e;
    }

    public Operations_Service() {
        super(__getWsdlLocation(), OPERATIONS_QNAME);
    }

    public Operations_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERATIONS_QNAME, features);
    }

    public Operations_Service(URL wsdlLocation) {
        super(wsdlLocation, OPERATIONS_QNAME);
    }

    public Operations_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERATIONS_QNAME, features);
    }

    public Operations_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Operations_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperationsPortType
     */
    @WebEndpoint(name = "OperationsHttpsSoap11Endpoint")
    public OperationsPortType getOperationsHttpsSoap11Endpoint() {
        return super.getPort(new QName("http://api.todopago.com.ar", "OperationsHttpsSoap11Endpoint"), OperationsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationsPortType
     */
    @WebEndpoint(name = "OperationsHttpsSoap11Endpoint")
    public OperationsPortType getOperationsHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.todopago.com.ar", "OperationsHttpsSoap11Endpoint"), OperationsPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns OperationsPortType
     */
    @WebEndpoint(name = "OperationsHttpSoap11Endpoint")
    public OperationsPortType getOperationsHttpSoap11Endpoint() {
        return super.getPort(new QName("http://api.todopago.com.ar", "OperationsHttpSoap11Endpoint"), OperationsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationsPortType
     */
    @WebEndpoint(name = "OperationsHttpSoap11Endpoint")
    public OperationsPortType getOperationsHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.todopago.com.ar", "OperationsHttpSoap11Endpoint"), OperationsPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERATIONS_EXCEPTION!= null) {
            throw OPERATIONS_EXCEPTION;
        }
        return OPERATIONS_WSDL_LOCATION;
    }

}
