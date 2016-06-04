
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
 *         &lt;element name="fragment_masses" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="channel" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                 &lt;attribute name="mz" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="isotopic_contributions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contributing_channel" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="affected_channel" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="channel" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                                     &lt;attribute name="correction" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="channel" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="mass_tolerance" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="centroiding_preference" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="normalization" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="output_type" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="channel_code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fragmentMasses",
    "isotopicContributions"
})
@XmlRootElement(name = "libra_summary")
public class LibraSummary
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "fragment_masses", required = true)
    protected List<FragmentMasses> fragmentMasses;
    @XmlElement(name = "isotopic_contributions")
    protected IsotopicContributions isotopicContributions;
    @XmlAttribute(name = "mass_tolerance", required = true)
    protected float massTolerance;
    @XmlAttribute(name = "centroiding_preference", required = true)
    protected int centroidingPreference;
    @XmlAttribute(required = true)
    protected int normalization;
    @XmlAttribute(name = "output_type", required = true)
    protected int outputType;
    @XmlAttribute(name = "channel_code")
    protected String channelCode;

    /**
     * Gets the value of the fragmentMasses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fragmentMasses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFragmentMasses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FragmentMasses }
     * 
     * 
     */
    public List<FragmentMasses> getFragmentMasses() {
        if (fragmentMasses == null) {
            fragmentMasses = new ArrayList<FragmentMasses>();
        }
        return this.fragmentMasses;
    }

    /**
     * Gets the value of the isotopicContributions property.
     * 
     * @return
     *     possible object is
     *     {@link IsotopicContributions }
     *     
     */
    public IsotopicContributions getIsotopicContributions() {
        return isotopicContributions;
    }

    /**
     * Sets the value of the isotopicContributions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsotopicContributions }
     *     
     */
    public void setIsotopicContributions(IsotopicContributions value) {
        this.isotopicContributions = value;
    }

    /**
     * Gets the value of the massTolerance property.
     * 
     */
    public float getMassTolerance() {
        return massTolerance;
    }

    /**
     * Sets the value of the massTolerance property.
     * 
     */
    public void setMassTolerance(float value) {
        this.massTolerance = value;
    }

    /**
     * Gets the value of the centroidingPreference property.
     * 
     */
    public int getCentroidingPreference() {
        return centroidingPreference;
    }

    /**
     * Sets the value of the centroidingPreference property.
     * 
     */
    public void setCentroidingPreference(int value) {
        this.centroidingPreference = value;
    }

    /**
     * Gets the value of the normalization property.
     * 
     */
    public int getNormalization() {
        return normalization;
    }

    /**
     * Sets the value of the normalization property.
     * 
     */
    public void setNormalization(int value) {
        this.normalization = value;
    }

    /**
     * Gets the value of the outputType property.
     * 
     */
    public int getOutputType() {
        return outputType;
    }

    /**
     * Sets the value of the outputType property.
     * 
     */
    public void setOutputType(int value) {
        this.outputType = value;
    }

    /**
     * Gets the value of the channelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * Sets the value of the channelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

}
