
package uk.ac.ebi.jpepxml.model.pepxml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mixtureModelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mixtureModelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="point" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="pos_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="neg_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="neg_obs_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="pos_obs_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pos_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="neg_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mixtureModelType", propOrder = {
    "point"
})
public class MixtureModelType
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    protected List<Point> point;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(name = "pos_bandwidth", required = true)
    protected float posBandwidth;
    @XmlAttribute(name = "neg_bandwidth", required = true)
    protected float negBandwidth;

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Point }
     * 
     * 
     */
    public List<Point> getPoint() {
        if (point == null) {
            point = new ArrayList<Point>();
        }
        return this.point;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the posBandwidth property.
     * 
     */
    public float getPosBandwidth() {
        return posBandwidth;
    }

    /**
     * Sets the value of the posBandwidth property.
     * 
     */
    public void setPosBandwidth(float value) {
        this.posBandwidth = value;
    }

    /**
     * Gets the value of the negBandwidth property.
     * 
     */
    public float getNegBandwidth() {
        return negBandwidth;
    }

    /**
     * Sets the value of the negBandwidth property.
     * 
     */
    public void setNegBandwidth(float value) {
        this.negBandwidth = value;
    }

}
