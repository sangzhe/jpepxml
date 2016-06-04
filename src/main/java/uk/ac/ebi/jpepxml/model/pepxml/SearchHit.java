
package uk.ac.ebi.jpepxml.model.pepxml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="alternative_protein" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="modification_info" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                 &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="search_score" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="analysis_result" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax'/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hit_rank" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *       &lt;attribute name="peptide" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="num_tot_proteins" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="num_matched_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="tot_num_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="calc_neutral_pep_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="num_missed_cleavages" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="num_matched_peptides" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="is_rejected" default="0">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="calc_pI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alternativeProtein",
    "modificationInfo",
    "searchScore",
    "analysisResult",
    "parameter"
})
public class SearchHit
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "alternative_protein")
    protected List<AlternativeProtein> alternativeProtein;
    @XmlElement(name = "modification_info")
    protected ModificationInfo modificationInfo;
    @XmlElement(name = "search_score")
    protected List<NameValueType> searchScore;
    @XmlElement(name = "analysis_result")
    protected List<AnalysisResult> analysisResult;
    protected List<NameValueType> parameter;
    @XmlAttribute(name = "hit_rank", required = true)
    protected long hitRank;
    @XmlAttribute(required = true)
    protected String peptide;
    @XmlAttribute(name = "peptide_prev_aa")
    protected String peptidePrevAa;
    @XmlAttribute(name = "peptide_next_aa")
    protected String peptideNextAa;
    @XmlAttribute(required = true)
    protected String protein;
    @XmlAttribute(name = "num_tot_proteins", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long numTotProteins;
    @XmlAttribute(name = "num_matched_ions")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numMatchedIons;
    @XmlAttribute(name = "tot_num_ions")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totNumIons;
    @XmlAttribute(name = "calc_neutral_pep_mass", required = true)
    protected float calcNeutralPepMass;
    @XmlAttribute(required = true)
    protected String massdiff;
    @XmlAttribute(name = "num_tol_term")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numTolTerm;
    @XmlAttribute(name = "num_missed_cleavages")
    protected BigInteger numMissedCleavages;
    @XmlAttribute(name = "num_matched_peptides")
    protected BigInteger numMatchedPeptides;
    @XmlAttribute(name = "is_rejected")
    protected BigInteger isRejected;
    @XmlAttribute(name = "protein_descr")
    protected String proteinDescr;
    @XmlAttribute(name = "calc_pI")
    protected String calcPI;
    @XmlAttribute(name = "protein_mw")
    protected Double proteinMw;

    /**
     * Gets the value of the alternativeProtein property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeProtein property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeProtein().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeProtein }
     * 
     * 
     */
    public List<AlternativeProtein> getAlternativeProtein() {
        if (alternativeProtein == null) {
            alternativeProtein = new ArrayList<AlternativeProtein>();
        }
        return this.alternativeProtein;
    }

    /**
     * Gets the value of the modificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationInfo }
     *     
     */
    public ModificationInfo getModificationInfo() {
        return modificationInfo;
    }

    /**
     * Sets the value of the modificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationInfo }
     *     
     */
    public void setModificationInfo(ModificationInfo value) {
        this.modificationInfo = value;
    }

    /**
     * Gets the value of the searchScore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchScore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchScore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValueType }
     * 
     * 
     */
    public List<NameValueType> getSearchScore() {
        if (searchScore == null) {
            searchScore = new ArrayList<NameValueType>();
        }
        return this.searchScore;
    }

    /**
     * Gets the value of the analysisResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysisResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysisResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalysisResult }
     * 
     * 
     */
    public List<AnalysisResult> getAnalysisResult() {
        if (analysisResult == null) {
            analysisResult = new ArrayList<AnalysisResult>();
        }
        return this.analysisResult;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameValueType }
     * 
     * 
     */
    public List<NameValueType> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<NameValueType>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the hitRank property.
     * 
     */
    public long getHitRank() {
        return hitRank;
    }

    /**
     * Sets the value of the hitRank property.
     * 
     */
    public void setHitRank(long value) {
        this.hitRank = value;
    }

    /**
     * Gets the value of the peptide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeptide() {
        return peptide;
    }

    /**
     * Sets the value of the peptide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeptide(String value) {
        this.peptide = value;
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
     * Gets the value of the numTotProteins property.
     * 
     */
    public long getNumTotProteins() {
        return numTotProteins;
    }

    /**
     * Sets the value of the numTotProteins property.
     * 
     */
    public void setNumTotProteins(long value) {
        this.numTotProteins = value;
    }

    /**
     * Gets the value of the numMatchedIons property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumMatchedIons() {
        return numMatchedIons;
    }

    /**
     * Sets the value of the numMatchedIons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumMatchedIons(BigInteger value) {
        this.numMatchedIons = value;
    }

    /**
     * Gets the value of the totNumIons property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotNumIons() {
        return totNumIons;
    }

    /**
     * Sets the value of the totNumIons property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotNumIons(BigInteger value) {
        this.totNumIons = value;
    }

    /**
     * Gets the value of the calcNeutralPepMass property.
     * 
     */
    public float getCalcNeutralPepMass() {
        return calcNeutralPepMass;
    }

    /**
     * Sets the value of the calcNeutralPepMass property.
     * 
     */
    public void setCalcNeutralPepMass(float value) {
        this.calcNeutralPepMass = value;
    }

    /**
     * Gets the value of the massdiff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassdiff() {
        return massdiff;
    }

    /**
     * Sets the value of the massdiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassdiff(String value) {
        this.massdiff = value;
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
     * Gets the value of the numMissedCleavages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumMissedCleavages() {
        return numMissedCleavages;
    }

    /**
     * Sets the value of the numMissedCleavages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumMissedCleavages(BigInteger value) {
        this.numMissedCleavages = value;
    }

    /**
     * Gets the value of the numMatchedPeptides property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumMatchedPeptides() {
        return numMatchedPeptides;
    }

    /**
     * Sets the value of the numMatchedPeptides property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumMatchedPeptides(BigInteger value) {
        this.numMatchedPeptides = value;
    }

    /**
     * Gets the value of the isRejected property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIsRejected() {
        if (isRejected == null) {
            return new BigInteger("0");
        } else {
            return isRejected;
        }
    }

    /**
     * Sets the value of the isRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIsRejected(BigInteger value) {
        this.isRejected = value;
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
     * Gets the value of the calcPI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcPI() {
        return calcPI;
    }

    /**
     * Sets the value of the calcPI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcPI(String value) {
        this.calcPI = value;
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

}
