
package uk.ac.ebi.jpepxml.model.pepxml;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="sample_enzyme">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="specificity" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="sense" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="C"/>
 *                                 &lt;enumeration value="N"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="min_spacing" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" default="1" />
 *                           &lt;attribute name="cut" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="20"/>
 *                                 &lt;pattern value="[A,C-I,K-N,P-T,VWY]+"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="no_cut">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="0"/>
 *                                 &lt;maxLength value="20"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="fidelity" default="specific">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="specific"/>
 *                       &lt;enumeration value="semispecific"/>
 *                       &lt;enumeration value="nonspecific"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="independent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="search_summary" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="search_database" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="local_path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="database_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="orig_database_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="database_release_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                           &lt;attribute name="database_release_identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="size_in_db_entries" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="size_of_residues" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="AA"/>
 *                                 &lt;enumeration value="NA"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="enzymatic_search_constraint" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="enzyme" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="max_num_internal_cleavages" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="min_number_termini" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="sequence_search_constraint" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="sequence" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="aminoacid_modification" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="aminoacid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="peptide_terminus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}aa_symbolType" />
 *                           &lt;attribute name="binary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="terminal_modification" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="variable" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="symbol" type="{http://regis-web.systemsbiology.net/pepXML}term_symbolType" />
 *                           &lt;attribute name="protein_terminus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="base_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="search_engine" use="required" type="{http://regis-web.systemsbiology.net/pepXML}engineType" />
 *                 &lt;attribute name="search_engine_version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="precursor_mass_type" use="required" type="{http://regis-web.systemsbiology.net/pepXML}massType" />
 *                 &lt;attribute name="fragment_mass_type" use="required" type="{http://regis-web.systemsbiology.net/pepXML}massType" />
 *                 &lt;attribute name="out_data_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="out_data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="search_id" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="analysis_timestamp" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="spectrum_query" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="search_result" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="search_hit" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="alternative_protein" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                               &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="modification_info" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                                         &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                               &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="search_score" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="analysis_result" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;any processContents='lax'/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="analysis" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="parameter" type="{http://regis-web.systemsbiology.net/pepXML}nameValueType" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="hit_rank" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *                                     &lt;attribute name="peptide" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="peptide_prev_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="peptide_next_aa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="protein" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="num_tot_proteins" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                     &lt;attribute name="num_matched_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="tot_num_ions" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="calc_neutral_pep_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                     &lt;attribute name="massdiff" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="num_tol_term" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="num_missed_cleavages" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="num_matched_peptides" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                                     &lt;attribute name="is_rejected" default="0">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                                           &lt;enumeration value="0"/>
 *                                           &lt;enumeration value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="protein_descr" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="calc_pI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="protein_mw" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="search_id" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" default="1" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="spectrum" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="start_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="end_scan" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                 &lt;attribute name="retention_time_sec" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="collision_energy" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="compensation_voltage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="precursor_intensity" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="activation_method" type="{http://regis-web.systemsbiology.net/pepXML}activationMethodType" />
 *                 &lt;attribute name="precursor_neutral_mass" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="assumed_charge" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="search_specification" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="index" use="required" type="{http://regis-web.systemsbiology.net/pepXML}positiveInt" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="base_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="raw_data_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="raw_data" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msManufacturer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msModel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msIonization" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msMassAnalyzer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="msDetector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="search_engine" type="{http://regis-web.systemsbiology.net/pepXML}engineType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sampleEnzyme",
    "searchSummary",
    "analysisTimestamp",
    "spectrumQuery"
})
public class MsmsRunSummary
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "sample_enzyme", required = true)
    protected SampleEnzyme sampleEnzyme;
    @XmlElement(name = "search_summary", required = true)
    protected List<SearchSummary> searchSummary;
    @XmlElement(name = "analysis_timestamp")
    protected List<AnalysisTimestamp> analysisTimestamp;
    @XmlElement(name = "spectrum_query")
    protected List<SpectrumQuery> spectrumQuery;
    @XmlAttribute(name = "base_name", required = true)
    protected String baseName;
    @XmlAttribute(name = "raw_data_type", required = true)
    protected String rawDataType;
    @XmlAttribute(name = "raw_data", required = true)
    protected String rawData;
    @XmlAttribute
    protected String msManufacturer;
    @XmlAttribute
    protected String msModel;
    @XmlAttribute
    protected String msIonization;
    @XmlAttribute
    protected String msMassAnalyzer;
    @XmlAttribute
    protected String msDetector;
    @XmlAttribute(name = "search_engine")
    protected EngineType searchEngine;

    /**
     * Gets the value of the sampleEnzyme property.
     * 
     * @return
     *     possible object is
     *     {@link SampleEnzyme }
     *     
     */
    public SampleEnzyme getSampleEnzyme() {
        return sampleEnzyme;
    }

    /**
     * Sets the value of the sampleEnzyme property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleEnzyme }
     *     
     */
    public void setSampleEnzyme(SampleEnzyme value) {
        this.sampleEnzyme = value;
    }

    /**
     * Gets the value of the searchSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchSummary }
     * 
     * 
     */
    public List<SearchSummary> getSearchSummary() {
        if (searchSummary == null) {
            searchSummary = new ArrayList<SearchSummary>();
        }
        return this.searchSummary;
    }

    /**
     * Gets the value of the analysisTimestamp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysisTimestamp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysisTimestamp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnalysisTimestamp }
     * 
     * 
     */
    public List<AnalysisTimestamp> getAnalysisTimestamp() {
        if (analysisTimestamp == null) {
            analysisTimestamp = new ArrayList<AnalysisTimestamp>();
        }
        return this.analysisTimestamp;
    }

    /**
     * Gets the value of the spectrumQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spectrumQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpectrumQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpectrumQuery }
     * 
     * 
     */
    public List<SpectrumQuery> getSpectrumQuery() {
        if (spectrumQuery == null) {
            spectrumQuery = new ArrayList<SpectrumQuery>();
        }
        return this.spectrumQuery;
    }

    /**
     * Gets the value of the baseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseName() {
        return baseName;
    }

    /**
     * Sets the value of the baseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseName(String value) {
        this.baseName = value;
    }

    /**
     * Gets the value of the rawDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawDataType() {
        return rawDataType;
    }

    /**
     * Sets the value of the rawDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawDataType(String value) {
        this.rawDataType = value;
    }

    /**
     * Gets the value of the rawData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawData() {
        return rawData;
    }

    /**
     * Sets the value of the rawData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawData(String value) {
        this.rawData = value;
    }

    /**
     * Gets the value of the msManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsManufacturer() {
        return msManufacturer;
    }

    /**
     * Sets the value of the msManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsManufacturer(String value) {
        this.msManufacturer = value;
    }

    /**
     * Gets the value of the msModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsModel() {
        return msModel;
    }

    /**
     * Sets the value of the msModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsModel(String value) {
        this.msModel = value;
    }

    /**
     * Gets the value of the msIonization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsIonization() {
        return msIonization;
    }

    /**
     * Sets the value of the msIonization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsIonization(String value) {
        this.msIonization = value;
    }

    /**
     * Gets the value of the msMassAnalyzer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsMassAnalyzer() {
        return msMassAnalyzer;
    }

    /**
     * Sets the value of the msMassAnalyzer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsMassAnalyzer(String value) {
        this.msMassAnalyzer = value;
    }

    /**
     * Gets the value of the msDetector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsDetector() {
        return msDetector;
    }

    /**
     * Sets the value of the msDetector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsDetector(String value) {
        this.msDetector = value;
    }

    /**
     * Gets the value of the searchEngine property.
     * 
     * @return
     *     possible object is
     *     {@link EngineType }
     *     
     */
    public EngineType getSearchEngine() {
        return searchEngine;
    }

    /**
     * Sets the value of the searchEngine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineType }
     *     
     */
    public void setSearchEngine(EngineType value) {
        this.searchEngine = value;
    }

}
