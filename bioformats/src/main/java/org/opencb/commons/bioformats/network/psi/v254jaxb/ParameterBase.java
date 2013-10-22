//
// This path was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this path will be lost upon recompilation of the source schema.
// Generated on: 2012.05.04 at 12:38:29 AM CEST 
//


package org.opencb.commons.bioformats.network.psi.v254jaxb;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * A numeric parameter, e.g. for a kinetic value
 * <p/>
 * <p>Java class for parameterBase complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="parameterBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="term" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="termAc">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="unit">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="unitAc">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="base" type="{http://www.w3.org/2001/XMLSchema}short" default="10" />
 *       &lt;attribute name="exponent" type="{http://www.w3.org/2001/XMLSchema}short" default="0" />
 *       &lt;attribute name="factor" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameterBase")
@XmlSeeAlso({
        Parameter.class
})
public class ParameterBase {

    @XmlAttribute(required = true)
    protected String term;
    @XmlAttribute
    protected String termAc;
    @XmlAttribute
    protected String unit;
    @XmlAttribute
    protected String unitAc;
    @XmlAttribute
    protected Short base;
    @XmlAttribute
    protected Short exponent;
    @XmlAttribute(required = true)
    protected BigDecimal factor;

    /**
     * Gets the value of the term property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTerm(String value) {
        this.term = value;
    }

    /**
     * Gets the value of the termAc property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTermAc() {
        return termAc;
    }

    /**
     * Sets the value of the termAc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTermAc(String value) {
        this.termAc = value;
    }

    /**
     * Gets the value of the unit property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the unitAc property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUnitAc() {
        return unitAc;
    }

    /**
     * Sets the value of the unitAc property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUnitAc(String value) {
        this.unitAc = value;
    }

    /**
     * Gets the value of the base property.
     *
     * @return possible object is
     *         {@link Short }
     */
    public short getBase() {
        if (base == null) {
            return ((short) 10);
        } else {
            return base;
        }
    }

    /**
     * Sets the value of the base property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setBase(Short value) {
        this.base = value;
    }

    /**
     * Gets the value of the exponent property.
     *
     * @return possible object is
     *         {@link Short }
     */
    public short getExponent() {
        if (exponent == null) {
            return ((short) 0);
        } else {
            return exponent;
        }
    }

    /**
     * Sets the value of the exponent property.
     *
     * @param value allowed object is
     *              {@link Short }
     */
    public void setExponent(Short value) {
        this.exponent = value;
    }

    /**
     * Gets the value of the factor property.
     *
     * @return possible object is
     *         {@link java.math.BigDecimal }
     */
    public BigDecimal getFactor() {
        return factor;
    }

    /**
     * Sets the value of the factor property.
     *
     * @param value allowed object is
     *              {@link java.math.BigDecimal }
     */
    public void setFactor(BigDecimal value) {
        this.factor = value;
    }

}