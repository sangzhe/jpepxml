
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
 *         &lt;element name="data_filter" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="number" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="parent_file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="windows_parent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="description" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="generation_no" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataFilter"
})
public class DatasetDerivation
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "data_filter")
    protected List<DataFilter> dataFilter;
    @XmlAttribute(name = "generation_no", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger generationNo;

    /**
     * Gets the value of the dataFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataFilter }
     * 
     * 
     */
    public List<DataFilter> getDataFilter() {
        if (dataFilter == null) {
            dataFilter = new ArrayList<DataFilter>();
        }
        return this.dataFilter;
    }

    /**
     * Gets the value of the generationNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGenerationNo() {
        return generationNo;
    }

    /**
     * Sets the value of the generationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGenerationNo(BigInteger value) {
        this.generationNo = value;
    }

}
