
package com.bakki.test.tshirt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Size.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Size">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="XL"/>
 *     &lt;enumeration value="XXL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Size")
@XmlEnum
public enum Size {

    S,
    M,
    L,
    XL,
    XXL;

    public String value() {
        return name();
    }

    public static Size fromValue(String v) {
        return valueOf(v);
    }

}
