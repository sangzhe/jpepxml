
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
 *         &lt;element name="mod_aminoacid_mass" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="position" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="mass" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="mod_nterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="mod_cterm_mass" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="modified_peptide" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "modAminoacidMass"
})
public class ModificationInfo
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "mod_aminoacid_mass")
    protected List<ModAminoacidMass> modAminoacidMass;
    @XmlAttribute(name = "mod_nterm_mass")
    protected Double modNtermMass;
    @XmlAttribute(name = "mod_cterm_mass")
    protected Double modCtermMass;
    @XmlAttribute(name = "modified_peptide")
    protected String modifiedPeptide;

    /**
     * Gets the value of the modAminoacidMass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modAminoacidMass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModAminoacidMass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModAminoacidMass }
     * 
     * 
     */
    public List<ModAminoacidMass> getModAminoacidMass() {
        if (modAminoacidMass == null) {
            modAminoacidMass = new ArrayList<ModAminoacidMass>();
        }
        return this.modAminoacidMass;
    }

    /**
     * Gets the value of the modNtermMass property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getModNtermMass() {
        return modNtermMass;
    }

    /**
     * Sets the value of the modNtermMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setModNtermMass(Double value) {
        this.modNtermMass = value;
    }

    /**
     * Gets the value of the modCtermMass property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getModCtermMass() {
        return modCtermMass;
    }

    /**
     * Sets the value of the modCtermMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setModCtermMass(Double value) {
        this.modCtermMass = value;
    }

    /**
     * Gets the value of the modifiedPeptide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedPeptide() {
        return modifiedPeptide;
    }

    /**
     * Sets the value of the modifiedPeptide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedPeptide(String value) {
        this.modifiedPeptide = value;
    }

}
