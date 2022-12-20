
package com.sltc.soa.client.stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CurrencyConverterWebServerService", targetNamespace = "http://soa.sltc.com/", wsdlLocation = "http://localhost:8888/DemoWebService?wsdl")
public class CurrencyConverterWebServerService
    extends Service
{

    private final static URL CURRENCYCONVERTERWEBSERVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException CURRENCYCONVERTERWEBSERVERSERVICE_EXCEPTION;
    private final static QName CURRENCYCONVERTERWEBSERVERSERVICE_QNAME = new QName("http://soa.sltc.com/", "CurrencyConverterWebServerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8888/DemoWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CURRENCYCONVERTERWEBSERVERSERVICE_WSDL_LOCATION = url;
        CURRENCYCONVERTERWEBSERVERSERVICE_EXCEPTION = e;
    }

    public CurrencyConverterWebServerService() {
        super(__getWsdlLocation(), CURRENCYCONVERTERWEBSERVERSERVICE_QNAME);
    }

    public CurrencyConverterWebServerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CURRENCYCONVERTERWEBSERVERSERVICE_QNAME, features);
    }

    public CurrencyConverterWebServerService(URL wsdlLocation) {
        super(wsdlLocation, CURRENCYCONVERTERWEBSERVERSERVICE_QNAME);
    }

    public CurrencyConverterWebServerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CURRENCYCONVERTERWEBSERVERSERVICE_QNAME, features);
    }

    public CurrencyConverterWebServerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CurrencyConverterWebServerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CurrencyConverterWebServer
     */
    @WebEndpoint(name = "CurrencyConverterWebServerPort")
    public CurrencyConverterWebServer getCurrencyConverterWebServerPort() {
        return super.getPort(new QName("http://soa.sltc.com/", "CurrencyConverterWebServerPort"), CurrencyConverterWebServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CurrencyConverterWebServer
     */
    @WebEndpoint(name = "CurrencyConverterWebServerPort")
    public CurrencyConverterWebServer getCurrencyConverterWebServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soa.sltc.com/", "CurrencyConverterWebServerPort"), CurrencyConverterWebServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CURRENCYCONVERTERWEBSERVERSERVICE_EXCEPTION!= null) {
            throw CURRENCYCONVERTERWEBSERVERSERVICE_EXCEPTION;
        }
        return CURRENCYCONVERTERWEBSERVERSERVICE_WSDL_LOCATION;
    }

}
