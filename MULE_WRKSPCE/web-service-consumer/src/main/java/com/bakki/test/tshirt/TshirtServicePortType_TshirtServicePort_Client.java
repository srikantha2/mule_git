
package com.bakki.test.tshirt;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.google.common.util.concurrent.Service.State;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2014-12-25T21:03:30.887-05:00
 * Generated source version: 2.5.1
 * 
 */
public final class TshirtServicePortType_TshirtServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://mulesoft.org/tshirt-service", "TshirtService");

    private TshirtServicePortType_TshirtServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = TshirtService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        TshirtService ss = new TshirtService(wsdlURL, SERVICE_NAME);
        TshirtServicePortType port = ss.getTshirtServicePort();  
        
        {
        System.out.println("Invoking orderTshirt...");
        com.bakki.test.tshirt.OrderTshirt _orderTshirt_body = new OrderTshirt();
        _orderTshirt_body.setName("Srikanth Prakash");
        _orderTshirt_body.setSize(Size.L);
        _orderTshirt_body.setAddress1("123 Windsor Lakes pl");
        _orderTshirt_body.setCity("Indy");
        _orderTshirt_body.setStateOrProvince("IN");
        _orderTshirt_body.setCountry("USA");
        _orderTshirt_body.setEmail("SAM@SMAM1.com");
        _orderTshirt_body.setPostalCode("12345");
        try {
            com.bakki.test.tshirt.OrderTshirtResponse _orderTshirt__return = port.orderTshirt(_orderTshirt_body);
            System.out.println("orderTshirt.result=" + _orderTshirt__return);

        } catch (TshirtFault_Exception e) { 
            System.out.println("Expected exception: TshirtFault has occurred.");
            System.out.println(e.toString());
        }catch (Exception e) { 
            System.out.println("Expected exception: TshirtFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking listInventory...");
        try {
            java.util.List<com.bakki.test.tshirt.InventoryItem> _listInventory__return = port.listInventory();
            System.out.println("listInventory.result=" + _listInventory__return);

        } catch (TshirtFault_Exception e) { 
            System.out.println("Expected exception: TshirtFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking trackOrder...");
        com.bakki.test.tshirt.TrackOrder _trackOrder_body = new TrackOrder();
        _trackOrder_body.setEmail("bhagya@bakka2com");
        _trackOrder_body.setOrderId("999");
        try {
            com.bakki.test.tshirt.TrackOrderResponse _trackOrder__return = port.trackOrder(_trackOrder_body);
            System.out.println("trackOrder.result=" + _trackOrder__return);

        } catch (TshirtFault_Exception e) { 
            System.out.println("Expected exception: TshirtFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}
