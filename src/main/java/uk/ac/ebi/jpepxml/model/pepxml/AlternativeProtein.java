
package uk.ac.ebi.jpepxml.model.pepxml;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class AlternativeProtein
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlAttribute(required = true)
    protected String protein;
    @XmlAttribute(name = "protein_descr")
    protected String proteinDescr;
    @XmlAttribute(name = "num_tol_term")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numTolTerm;
    @XmlAttribute(name = "protein_mw")
    protected Double proteinMw;
    @XmlAttribute(name = "peptide_prev_aa")
    protected String peptidePrevAa;
    @XmlAttribute(name = "peptide_next_aa")
    protected String peptideNextAa;

    /**
     * Gets the value of the protein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtein() {
        return protein;
    }

    /**
     * Sets the value of the protein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtein(String value) {
        this.protein = value;
    }

    /**
     * Gets the value of the proteinDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProteinDescr() {
        return proteinDescr;
    }

    /**
     * Sets the value of the proteinDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProteinDescr(String value) {
        this.proteinDescr = value;
    }

    /**
     * Gets the value of the numTolTerm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumTolTerm() {
        return numTolTerm;
    }

    /**
     * Sets the value of the numTolTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumTolTerm(BigInteger value) {
        this.numTolTerm = value;
    }

    /**
     * Gets the value of the proteinMw property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getProteinMw() {
        return proteinMw;
    }

    /**
     * Sets the value of the proteinMw property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setProteinMw(Double value) {
        this.proteinMw = value;
    }

    /**
     * Gets the value of the peptidePrevAa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeptidePrevAa() {
        return peptidePrevAa;
    }

    /**
     * Sets the value of the peptidePrevAa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeptidePrevAa(String value) {
        this.peptidePrevAa = value;
    }

    /**
     * Gets the value of the peptideNextAa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeptideNextAa() {
        return peptideNextAa;
    }

    /**
     * Sets the value of the peptideNextAa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeptideNextAa(String value) {
        this.peptideNextAa = value;
    }

}
