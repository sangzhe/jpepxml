
package uk.ac.ebi.jpepxml.model.pepxml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="mixturemodel_distribution" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="posmodel_distribution">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="negmodel_distribution">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" type="{http://regis-web.systemsbiology.net/pepXML}model_dis_type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mixturemodelbase" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mixturemodel_point" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="pos_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="neg_dens" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pos_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="neg_bandwidth" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="precursor_ion_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="comments" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="prior_probability" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="est_tot_correct" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="tot_num_spectra" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="num_iterations" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mixturemodelDistributionOrMixturemodelbase"
})
public class MixtureModel
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElements({
        @XmlElement(name = "mixturemodel", type = Mixturemodelbase.class),
        @XmlElement(name = "mixturemodel_distribution", type = MixturemodelDistribution.class)
    })
    protected List<pepXMLObject> mixturemodelDistributionOrMixturemodelbase;
    @XmlAttribute(name = "precursor_ion_charge", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger precursorIonCharge;
    @XmlAttribute(required = true)
    protected String comments;
    @XmlAttribute(name = "prior_probability", required = true)
    protected float priorProbability;
    @XmlAttribute(name = "est_tot_correct", required = true)
    protected float estTotCorrect;
    @XmlAttribute(name = "tot_num_spectra", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totNumSpectra;
    @XmlAttribute(name = "num_iterations", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numIterations;

    /**
     * Gets the value of the mixturemodelDistributionOrMixturemodelbase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mixturemodelDistributionOrMixturemodelbase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMixturemodelDistributionOrMixturemodelbase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mixturemodelbase }
     * {@link MixturemodelDistribution }
     * 
     * 
     */
    public List<pepXMLObject> getMixturemodelDistributionOrMixturemodelbase() {
        if (mixturemodelDistributionOrMixturemodelbase == null) {
            mixturemodelDistributionOrMixturemodelbase = new ArrayList<pepXMLObject>();
        }
        return this.mixturemodelDistributionOrMixturemodelbase;
    }

    /**
     * Gets the value of the precursorIonCharge property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecursorIonCharge() {
        return precursorIonCharge;
    }

    /**
     * Sets the value of the precursorIonCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecursorIonCharge(BigInteger value) {
        this.precursorIonCharge = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the priorProbability property.
     * 
     */
    public float getPriorProbability() {
        return priorProbability;
    }

    /**
     * Sets the value of the priorProbability property.
     * 
     */
    public void setPriorProbability(float value) {
        this.priorProbability = value;
    }

    /**
     * Gets the value of the estTotCorrect property.
     * 
     */
    public float getEstTotCorrect() {
        return estTotCorrect;
    }

    /**
     * Sets the value of the estTotCorrect property.
     * 
     */
    public void setEstTotCorrect(float value) {
        this.estTotCorrect = value;
    }

    /**
     * Gets the value of the totNumSpectra property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNumSpectra() {
        return totNumSpectra;
    }

    /**
     * Sets the value of the totNumSpectra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNumSpectra(BigInteger value) {
        this.totNumSpectra = value;
    }

    /**
     * Gets the value of the numIterations property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumIterations() {
        return numIterations;
    }

    /**
     * Sets the value of the numIterations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumIterations(BigInteger value) {
        this.numIterations = value;
    }

}
