/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.web;

import br.cli.WsServicoCalc;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author alexandrelerario
 */
@Named(value = "jSFrequest")
@RequestScoped
public class JSFrequest {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WsServicoCalc/WsServicoCalc.wsdl")
    private br.cli.WsServicoCalc_Service service;

    /**
     * Creates a new instance of JSFrequest
     */
    public JSFrequest() {
    }
    
   
    private int v1, v2, resultado;

    public void somar(){
        
        try { // Call Web Service Operation
            WsServicoCalc port = service.getWsServicoCalcPort();
            // TODO initialize WS operation arguments here
            //int v1 = 0;
            //int v2 = 0;
            // TODO process result here
            int result = port.somar(v1, v2);
            System.out.println("Result = "+result);
            resultado= result;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            resultado= 0;
        }

    } 

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }
    
    
}
