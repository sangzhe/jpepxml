
package uk.ac.ebi.jpepxml.model.pepxml;

import java.io.Serializable;
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
 *       &lt;attribute name="min_prob" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="sensitivity" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="error" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="num_corr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="num_incorr" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class RocDataPoint
    extends pepXMLObject
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    @XmlAttribute(name = "min_prob", required = true)
    protected float minProb;
    @XmlAttribute(required = true)
    protected float sensitivity;
    @XmlAttribute(required = true)
    protected float error;
    @XmlAttribute(name = "num_corr", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long numCorr;
    @XmlAttribute(name = "num_incorr", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long numIncorr;

    /**
     * Gets the value of the minProb property.
     * 
     */
    public float getMinProb() {
        return minProb;
    }

    /**
     * Sets the value of the minProb property.
     * 
     */
    public void setMinProb(float value) {
        this.minProb = value;
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     */
    public float getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     */
    public void setSensitivity(float value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the error property.
     * 
     */
    public float getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     */
    public void setError(float value) {
        this.error = value;
    }

    /**
     * Gets the value of the numCorr property.
     * 
     */
    public long getNumCorr() {
        return numCorr;
    }

    /**
     * Sets the value of the numCorr property.
     * 
     */
    public void setNumCorr(long value) {
        this.numCorr = value;
    }

    /**
     * Gets the value of the numIncorr property.
     * 
     */
    public long getNumIncorr() {
        return numIncorr;
    }

    /**
     * Sets the value of the numIncorr property.
     * 
     */
    public void setNumIncorr(long value) {
        this.numIncorr = value;
    }

}
