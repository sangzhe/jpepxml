
package uk.ac.ebi.jpepxml.model.pepxml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="intensity" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="channel" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                 &lt;attribute name="target_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="absolute" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="normalized" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="reject" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="is_rejected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intensity"
})
@XmlRootElement(name = "libra_result")
public class LibraResult
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(required = true)
    protected List<Intensity> intensity;
    @XmlAttribute(name = "is_rejected")
    protected Boolean isRejected;

    /**
     * Gets the value of the intensity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intensity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntensity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intensity }
     * 
     * 
     */
    public List<Intensity> getIntensity() {
        if (intensity == null) {
            intensity = new ArrayList<Intensity>();
        }
        return this.intensity;
    }

    /**
     * Gets the value of the isRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getIsRejected() {
        if (isRejected == null) {
            return false;
        } else {
            return isRejected;
        }
    }

    /**
     * Sets the value of the isRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRejected(Boolean value) {
        this.isRejected = value;
    }

}
