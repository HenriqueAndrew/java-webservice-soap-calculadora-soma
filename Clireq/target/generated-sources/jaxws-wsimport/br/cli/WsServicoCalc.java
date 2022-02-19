
package br.cli;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WsServicoCalc", targetNamespace = "http://provider.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsServicoCalc {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://provider.br/", className = "br.cli.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://provider.br/", className = "br.cli.HelloResponse")
    @Action(input = "http://provider.br/WsServicoCalc/helloRequest", output = "http://provider.br/WsServicoCalc/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param v1
     * @param v2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "somar", targetNamespace = "http://provider.br/", className = "br.cli.Somar")
    @ResponseWrapper(localName = "somarResponse", targetNamespace = "http://provider.br/", className = "br.cli.SomarResponse")
    @Action(input = "http://provider.br/WsServicoCalc/somarRequest", output = "http://provider.br/WsServicoCalc/somarResponse")
    public int somar(
        @WebParam(name = "v1", targetNamespace = "")
        int v1,
        @WebParam(name = "v2", targetNamespace = "")
        int v2);

}
