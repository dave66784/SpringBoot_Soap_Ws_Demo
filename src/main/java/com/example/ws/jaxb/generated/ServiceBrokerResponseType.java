//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.09 at 10:35:01 PM BST 
//


package com.example.ws.jaxb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceBrokerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceBrokerResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="outputParams" type="{http://example.com/ws/jaxb/generated}outputParamsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceBrokerResponseType", propOrder = {
    "serviceId",
    "outputParams"
})
@XmlRootElement(name = "serviceBrokerResponse")
public class ServiceBrokerResponseType {

    @XmlElement(required = true)
    protected String serviceId;
    @XmlElement(required = true)
    protected OutputParamsType outputParams;

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the outputParams property.
     * 
     * @return
     *     possible object is
     *     {@link OutputParamsType }
     *     
     */
    public OutputParamsType getOutputParams() {
        return outputParams;
    }

    /**
     * Sets the value of the outputParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputParamsType }
     *     
     */
    public void setOutputParams(OutputParamsType value) {
        this.outputParams = value;
    }

}
