
package uk.ac.ebi.jpepxml.model.pepxml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="quant_label_masses" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="static_quant_label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "asapratio_timestamp")
public class AsapratioTimestamp
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlAttribute(name = "quant_label_masses")
    protected String quantLabelMasses;
    @XmlAttribute(name = "static_quant_label")
    protected String staticQuantLabel;

    /**
     * Gets the value of the quantLabelMasses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantLabelMasses() {
        return quantLabelMasses;
    }

    /**
     * Sets the value of the quantLabelMasses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantLabelMasses(String value) {
        this.quantLabelMasses = value;
    }

    /**
     * Gets the value of the staticQuantLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaticQuantLabel() {
        return staticQuantLabel;
    }

    /**
     * Sets the value of the staticQuantLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaticQuantLabel(String value) {
        this.staticQuantLabel = value;
    }

}
