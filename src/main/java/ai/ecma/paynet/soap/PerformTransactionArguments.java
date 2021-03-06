//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.23 at 10:36:05 AM UZT 
//


package ai.ecma.paynet.soap;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for PerformTransactionArguments complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PerformTransactionArguments">
 *   &lt;complexContent>
 *     &lt;extension base="{http://example.soap.uz/models/soap/}GenericArguments">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="parameters" type="{http://example.soap.uz/models/soap/}GenericParam" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transactionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformTransactionArguments", propOrder = {
        "amount",
        "parameters",
        "serviceId",
        "transactionId",
        "transactionTime"
})
public class PerformTransactionArguments
        extends GenericArguments {

    protected long amount;
    @XmlElement(nillable = true)
    protected List<GenericParam> parameters;
    protected long serviceId;
    protected long transactionId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTime;

    /**
     * Gets the value of the amount property.
     */
    public long getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     */
    public void setAmount(long value) {
        this.amount = value;
    }

    /**
     * Gets the value of the parameters property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericParam }
     */
    public List<GenericParam> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<GenericParam>();
        }
        return this.parameters;
    }

    /**
     * Gets the value of the serviceId property.
     */
    public long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     */
    public void setServiceId(long value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the transactionId property.
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionTime property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getTransactionTime() {
        return transactionTime;
    }

    /**
     * Sets the value of the transactionTime property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setTransactionTime(XMLGregorianCalendar value) {
        this.transactionTime = value;
    }

    @Override
    public String toString() {
        return "PerformTransactionArguments{" +
                "amount=" + amount +
                ", parameters=" + parameters +
                ", serviceId=" + serviceId +
                ", transactionId=" + transactionId +
                ", transactionTime=" + transactionTime +
                '}';
    }
}
