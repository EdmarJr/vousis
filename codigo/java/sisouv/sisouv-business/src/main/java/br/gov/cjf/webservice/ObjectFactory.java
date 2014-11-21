
package br.gov.cjf.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.cjf.webservice package. 
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

    private final static QName _GetDadosCPFSecurity_QNAME = new QName("http://webservice.cjf.gov.br/", "getDadosCPFSecurity");
    private final static QName _SetDadosCPFSecutity_QNAME = new QName("http://webservice.cjf.gov.br/", "setDadosCPFSecutity");
    private final static QName _SetDadosCPFSecutityResponse_QNAME = new QName("http://webservice.cjf.gov.br/", "setDadosCPFSecutityResponse");
    private final static QName _SetObjetcCPFSecutityResponse_QNAME = new QName("http://webservice.cjf.gov.br/", "setObjetcCPFSecutityResponse");
    private final static QName _GetObjetcCPFSecurityResponse_QNAME = new QName("http://webservice.cjf.gov.br/", "getObjetcCPFSecurityResponse");
    private final static QName _SetObjetcCPFSecutity_QNAME = new QName("http://webservice.cjf.gov.br/", "setObjetcCPFSecutity");
    private final static QName _GetDadosCPFSecurityResponse_QNAME = new QName("http://webservice.cjf.gov.br/", "getDadosCPFSecurityResponse");
    private final static QName _GetObjetcCPFSecurity_QNAME = new QName("http://webservice.cjf.gov.br/", "getObjetcCPFSecurity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.cjf.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetObjetcCPFSecurityResponse }
     * 
     */
    public GetObjetcCPFSecurityResponse createGetObjetcCPFSecurityResponse() {
        return new GetObjetcCPFSecurityResponse();
    }

    /**
     * Create an instance of {@link SetDadosCPFSecutity }
     * 
     */
    public SetDadosCPFSecutity createSetDadosCPFSecutity() {
        return new SetDadosCPFSecutity();
    }

    /**
     * Create an instance of {@link GetDadosCPFSecurity }
     * 
     */
    public GetDadosCPFSecurity createGetDadosCPFSecurity() {
        return new GetDadosCPFSecurity();
    }

    /**
     * Create an instance of {@link SetDadosCPFSecutityResponse }
     * 
     */
    public SetDadosCPFSecutityResponse createSetDadosCPFSecutityResponse() {
        return new SetDadosCPFSecutityResponse();
    }

    /**
     * Create an instance of {@link SetObjetcCPFSecutityResponse }
     * 
     */
    public SetObjetcCPFSecutityResponse createSetObjetcCPFSecutityResponse() {
        return new SetObjetcCPFSecutityResponse();
    }

    /**
     * Create an instance of {@link GetObjetcCPFSecurity }
     * 
     */
    public GetObjetcCPFSecurity createGetObjetcCPFSecurity() {
        return new GetObjetcCPFSecurity();
    }

    /**
     * Create an instance of {@link SetObjetcCPFSecutity }
     * 
     */
    public SetObjetcCPFSecutity createSetObjetcCPFSecutity() {
        return new SetObjetcCPFSecutity();
    }

    /**
     * Create an instance of {@link GetDadosCPFSecurityResponse }
     * 
     */
    public GetDadosCPFSecurityResponse createGetDadosCPFSecurityResponse() {
        return new GetDadosCPFSecurityResponse();
    }

    /**
     * Create an instance of {@link CPF }
     * 
     */
    public CPF createCPF() {
        return new CPF();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDadosCPFSecurity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cjf.gov.br/", name = "getDadosCPFSecurity")
    public JAXBElement<GetDadosCPFSecurity> createGetDadosCPFSecurity(GetDadosCPFSecurity value) {
        return new JAXBElement<GetDadosCPFSecurity>(_GetDadosCPFSecurity_QNAME, GetDadosCPFSecurity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDadosCPFSecutity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cjf.gov.br/", name = "setDadosCPFSecutity")
    public JAXBElement<SetDadosCPFSecutity> createSetDadosCPFSecutity(SetDadosCPFSecutity value) {
        return new JAXBElement<SetDadosCPFSecutity>(_SetDadosCPFSecutity_QNAME, SetDadosCPFSecutity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDadosCPFSecutityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cjf.gov.br/", name = "setDadosCPFSecutityResponse")
    public JAXBElement<SetDadosCPFSecutityResponse> createSetDadosCPFSecutityResponse(SetDadosCPFSecutityResponse value) {
        return new JAXBElement<SetDadosCPFSecutityResponse>(_SetDadosCPFSecutityResponse_QNAME, SetDadosCPFSecutityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetObjetcCPFSecutityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cjf.gov.br/", name = "setObjetcCPFSecutityResponse")
    public JAXBElement<SetObjetcCPFSecutityResponse> createSetObjetcCPFSecutityResponse(SetObjetcCPFSecutityResponse value) {
        return new JAXBElement<SetObjetcCPFSecutityResponse>(_SetObjetcCPFSecutityResponse_QNAME, SetObjetcCPFSecutityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjetcCPFSecurityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cjf.gov.br/", name = "getObjetcCPFSecurityResponse")
    public JAXBElement<GetObjetcCPFSecurityResponse> createGetObjetcCPFSecurityResponse(GetObjetcCPFSecurityResponse value) {
        return new JAXBElement<GetObjetcCPFSecurityResponse>(_GetObjetcCPFSecurityResponse_QNAME, GetObjetcCPFSecurityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetObjetcCPFSecutity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cjf.gov.br/", name = "setObjetcCPFSecutity")
    public JAXBElement<SetObjetcCPFSecutity> createSetObjetcCPFSecutity(SetObjetcCPFSecutity value) {
        return new JAXBElement<SetObjetcCPFSecutity>(_SetObjetcCPFSecutity_QNAME, SetObjetcCPFSecutity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDadosCPFSecurityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cjf.gov.br/", name = "getDadosCPFSecurityResponse")
    public JAXBElement<GetDadosCPFSecurityResponse> createGetDadosCPFSecurityResponse(GetDadosCPFSecurityResponse value) {
        return new JAXBElement<GetDadosCPFSecurityResponse>(_GetDadosCPFSecurityResponse_QNAME, GetDadosCPFSecurityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObjetcCPFSecurity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.cjf.gov.br/", name = "getObjetcCPFSecurity")
    public JAXBElement<GetObjetcCPFSecurity> createGetObjetcCPFSecurity(GetObjetcCPFSecurity value) {
        return new JAXBElement<GetObjetcCPFSecurity>(_GetObjetcCPFSecurity_QNAME, GetObjetcCPFSecurity.class, null, value);
    }

}
