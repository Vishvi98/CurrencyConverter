
package com.sltc.soa.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sltc.soa.client.stub package. 
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

    private final static QName _CurrencyConverterWithOutUsdResponse_QNAME = new QName("http://soa.sltc.com/", "currencyConverterWithOutUsdResponse");
    private final static QName _CurrencyConverterSourceUsdResponse_QNAME = new QName("http://soa.sltc.com/", "currencyConverterSourceUsdResponse");
    private final static QName _CurrencyConverterTargetUsd_QNAME = new QName("http://soa.sltc.com/", "currencyConverterTargetUsd");
    private final static QName _CurrencyConverterWithOutUsd_QNAME = new QName("http://soa.sltc.com/", "currencyConverterWithOutUsd");
    private final static QName _CurrencyConverterSourceUsd_QNAME = new QName("http://soa.sltc.com/", "currencyConverterSourceUsd");
    private final static QName _CurrencyConverterTargetUsdResponse_QNAME = new QName("http://soa.sltc.com/", "currencyConverterTargetUsdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sltc.soa.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CurrencyConverterWithOutUsd }
     * 
     */
    public CurrencyConverterWithOutUsd createCurrencyConverterWithOutUsd() {
        return new CurrencyConverterWithOutUsd();
    }

    /**
     * Create an instance of {@link CurrencyConverterSourceUsdResponse }
     * 
     */
    public CurrencyConverterSourceUsdResponse createCurrencyConverterSourceUsdResponse() {
        return new CurrencyConverterSourceUsdResponse();
    }

    /**
     * Create an instance of {@link CurrencyConverterTargetUsd }
     * 
     */
    public CurrencyConverterTargetUsd createCurrencyConverterTargetUsd() {
        return new CurrencyConverterTargetUsd();
    }

    /**
     * Create an instance of {@link CurrencyConverterWithOutUsdResponse }
     * 
     */
    public CurrencyConverterWithOutUsdResponse createCurrencyConverterWithOutUsdResponse() {
        return new CurrencyConverterWithOutUsdResponse();
    }

    /**
     * Create an instance of {@link CurrencyConverterTargetUsdResponse }
     * 
     */
    public CurrencyConverterTargetUsdResponse createCurrencyConverterTargetUsdResponse() {
        return new CurrencyConverterTargetUsdResponse();
    }

    /**
     * Create an instance of {@link CurrencyConverterSourceUsd }
     * 
     */
    public CurrencyConverterSourceUsd createCurrencyConverterSourceUsd() {
        return new CurrencyConverterSourceUsd();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConverterWithOutUsdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "currencyConverterWithOutUsdResponse")
    public JAXBElement<CurrencyConverterWithOutUsdResponse> createCurrencyConverterWithOutUsdResponse(CurrencyConverterWithOutUsdResponse value) {
        return new JAXBElement<CurrencyConverterWithOutUsdResponse>(_CurrencyConverterWithOutUsdResponse_QNAME, CurrencyConverterWithOutUsdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConverterSourceUsdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "currencyConverterSourceUsdResponse")
    public JAXBElement<CurrencyConverterSourceUsdResponse> createCurrencyConverterSourceUsdResponse(CurrencyConverterSourceUsdResponse value) {
        return new JAXBElement<CurrencyConverterSourceUsdResponse>(_CurrencyConverterSourceUsdResponse_QNAME, CurrencyConverterSourceUsdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConverterTargetUsd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "currencyConverterTargetUsd")
    public JAXBElement<CurrencyConverterTargetUsd> createCurrencyConverterTargetUsd(CurrencyConverterTargetUsd value) {
        return new JAXBElement<CurrencyConverterTargetUsd>(_CurrencyConverterTargetUsd_QNAME, CurrencyConverterTargetUsd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConverterWithOutUsd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "currencyConverterWithOutUsd")
    public JAXBElement<CurrencyConverterWithOutUsd> createCurrencyConverterWithOutUsd(CurrencyConverterWithOutUsd value) {
        return new JAXBElement<CurrencyConverterWithOutUsd>(_CurrencyConverterWithOutUsd_QNAME, CurrencyConverterWithOutUsd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConverterSourceUsd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "currencyConverterSourceUsd")
    public JAXBElement<CurrencyConverterSourceUsd> createCurrencyConverterSourceUsd(CurrencyConverterSourceUsd value) {
        return new JAXBElement<CurrencyConverterSourceUsd>(_CurrencyConverterSourceUsd_QNAME, CurrencyConverterSourceUsd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConverterTargetUsdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "currencyConverterTargetUsdResponse")
    public JAXBElement<CurrencyConverterTargetUsdResponse> createCurrencyConverterTargetUsdResponse(CurrencyConverterTargetUsdResponse value) {
        return new JAXBElement<CurrencyConverterTargetUsdResponse>(_CurrencyConverterTargetUsdResponse_QNAME, CurrencyConverterTargetUsdResponse.class, null, value);
    }

}
