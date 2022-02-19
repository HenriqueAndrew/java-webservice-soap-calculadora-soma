
package br.cli;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.cli package. 
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

    private final static QName _Somar_QNAME = new QName("http://provider.br/", "somar");
    private final static QName _Hello_QNAME = new QName("http://provider.br/", "hello");
    private final static QName _SomarResponse_QNAME = new QName("http://provider.br/", "somarResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://provider.br/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.cli
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SomarResponse }
     * 
     */
    public SomarResponse createSomarResponse() {
        return new SomarResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Somar }
     * 
     */
    public Somar createSomar() {
        return new Somar();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.br/", name = "somar")
    public JAXBElement<Somar> createSomar(Somar value) {
        return new JAXBElement<Somar>(_Somar_QNAME, Somar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.br/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.br/", name = "somarResponse")
    public JAXBElement<SomarResponse> createSomarResponse(SomarResponse value) {
        return new JAXBElement<SomarResponse>(_SomarResponse_QNAME, SomarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://provider.br/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
