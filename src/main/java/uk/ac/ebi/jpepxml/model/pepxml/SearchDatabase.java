
package uk.ac.ebi.jpepxml.model.pepxml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import uk.ac.ebi.jpepxml.xml.jaxb.adapter.CalendarAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="local_path" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="database_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="orig_database_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="database_release_date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="database_release_identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="size_in_db_entries" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="size_of_residues" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="AA"/>
 *             &lt;enumeration value="NA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class SearchDatabase
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlAttribute(name = "local_path", required = true)
    protected String localPath;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "database_name")
    protected String databaseName;
    @XmlAttribute(name = "orig_database_url")
    protected String origDatabaseUrl;
    @XmlAttribute(name = "database_release_date")
    @XmlJavaTypeAdapter(CalendarAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar databaseReleaseDate;
    @XmlAttribute(name = "database_release_identifier")
    protected String databaseReleaseIdentifier;
    @XmlAttribute(name = "size_in_db_entries")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sizeInDbEntries;
    @XmlAttribute(name = "size_of_residues")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sizeOfResidues;
    @XmlAttribute(required = true)
    protected String type;

    /**
     * Gets the value of the localPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPath() {
        return localPath;
    }

    /**
     * Sets the value of the localPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPath(String value) {
        this.localPath = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the databaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Sets the value of the databaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Gets the value of the origDatabaseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigDatabaseUrl() {
        return origDatabaseUrl;
    }

    /**
     * Sets the value of the origDatabaseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigDatabaseUrl(String value) {
        this.origDatabaseUrl = value;
    }

    /**
     * Gets the value of the databaseReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDatabaseReleaseDate() {
        return databaseReleaseDate;
    }

    /**
     * Sets the value of the databaseReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseReleaseDate(Calendar value) {
        this.databaseReleaseDate = value;
    }

    /**
     * Gets the value of the databaseReleaseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseReleaseIdentifier() {
        return databaseReleaseIdentifier;
    }

    /**
     * Sets the value of the databaseReleaseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseReleaseIdentifier(String value) {
        this.databaseReleaseIdentifier = value;
    }

    /**
     * Gets the value of the sizeInDbEntries property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSizeInDbEntries() {
        return sizeInDbEntries;
    }

    /**
     * Sets the value of the sizeInDbEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSizeInDbEntries(BigInteger value) {
        this.sizeInDbEntries = value;
    }

    /**
     * Gets the value of the sizeOfResidues property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSizeOfResidues() {
        return sizeOfResidues;
    }

    /**
     * Sets the value of the sizeOfResidues property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSizeOfResidues(BigInteger value) {
        this.sizeOfResidues = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
