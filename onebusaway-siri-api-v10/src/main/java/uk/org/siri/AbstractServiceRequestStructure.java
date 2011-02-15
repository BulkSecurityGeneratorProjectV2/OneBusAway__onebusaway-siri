//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.13 at 09:30:34 AM PST 
//


package uk.org.siri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;


/**
 * Abstract Service Request for  SIRI  Service request
 * 
 * <p>Java class for AbstractServiceRequestStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractServiceRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/}ContextualisedRequestEndpointGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractServiceRequestStructure", propOrder = {
    "requestTimestamp",
    "messageIdentifier"
})
@XmlSeeAlso({
    ProductionTimetableRequestStructure.class,
    EstimatedTimetableRequestStructure.class,
    StopTimetableRequestStructure.class,
    StopMonitoringRequestStructure.class,
    VehicleMonitoringRequestStructure.class,
    ConnectionTimetableRequestStructure.class,
    ConnectionMonitoringRequestStructure.class,
    GeneralMessageRequestStructure.class,
    ServiceCapabilitiesRequestStructure.class
})
public class AbstractServiceRequestStructure {

    @XmlElement(name = "RequestTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected Date requestTimestamp;
    @XmlElement(name = "MessageIdentifier")
    protected MessageQualifierStructure messageIdentifier;

    /**
     * Gets the value of the requestTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Sets the value of the requestTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setRequestTimestamp(Date value) {
        this.requestTimestamp = value;
    }

    /**
     * Gets the value of the messageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public MessageQualifierStructure getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Sets the value of the messageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public void setMessageIdentifier(MessageQualifierStructure value) {
        this.messageIdentifier = value;
    }

}