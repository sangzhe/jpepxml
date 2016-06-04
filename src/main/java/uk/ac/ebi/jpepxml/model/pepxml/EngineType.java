
package uk.ac.ebi.jpepxml.model.pepxml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for engineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="engineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SEQUEST"/>
 *     &lt;enumeration value="MASCOT"/>
 *     &lt;enumeration value="Comet"/>
 *     &lt;enumeration value="PROBID"/>
 *     &lt;enumeration value="OMSSA"/>
 *     &lt;enumeration value="MS-GFDB"/>
 *     &lt;enumeration value="MyriMatch"/>
 *     &lt;enumeration value="X! Tandem (k-score)"/>
 *     &lt;enumeration value="X! Tandem"/>
 *     &lt;enumeration value="InsPecT"/>
 *     &lt;enumeration value="ProteinPilot"/>
 *     &lt;enumeration value="ProteinLynx"/>
 *     &lt;enumeration value="Spectrum Mill"/>
 *     &lt;enumeration value="greylag"/>
 *     &lt;enumeration value="Phenyx"/>
 *     &lt;enumeration value="Proteios"/>
 *     &lt;enumeration value="Crux"/>
 *     &lt;enumeration value="Tide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "engineType")
@XmlEnum
public enum EngineType {

    SEQUEST("SEQUEST"),
    MASCOT("MASCOT"),
    @XmlEnumValue("Comet")
    COMET("Comet"),
    PROBID("PROBID"),
    OMSSA("OMSSA"),
    @XmlEnumValue("MS-GFDB")
    MS_GFDB("MS-GFDB"),
    @XmlEnumValue("MyriMatch")
    MYRI_MATCH("MyriMatch"),
    @XmlEnumValue("X! Tandem (k-score)")
    X_TANDEM_K_SCORE("X! Tandem (k-score)"),
    @XmlEnumValue("X! Tandem")
    X_TANDEM("X! Tandem"),
    @XmlEnumValue("InsPecT")
    INS_PEC_T("InsPecT"),
    @XmlEnumValue("ProteinPilot")
    PROTEIN_PILOT("ProteinPilot"),
    @XmlEnumValue("ProteinLynx")
    PROTEIN_LYNX("ProteinLynx"),
    @XmlEnumValue("Spectrum Mill")
    SPECTRUM_MILL("Spectrum Mill"),
    @XmlEnumValue("greylag")
    GREYLAG("greylag"),
    @XmlEnumValue("Phenyx")
    PHENYX("Phenyx"),
    @XmlEnumValue("Proteios")
    PROTEIOS("Proteios"),
    @XmlEnumValue("Crux")
    CRUX("Crux"),
    @XmlEnumValue("Tide")
    TIDE("Tide");
    private final String value;

    EngineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EngineType fromValue(String v) {
        for (EngineType c: EngineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
