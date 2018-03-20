package com.JAXB.framework;

/**

 *

 */

 import javax.xml.bind.annotation.XmlAccessType;
 import javax.xml.bind.annotation.XmlAccessorType;
 import javax.xml.bind.annotation.XmlElement;
 import javax.xml.bind.annotation.XmlRootElement;

/**

 * @author Biplab Ray

 *

 */

@XmlRootElement(name="Child")

@XmlAccessorType(XmlAccessType.FIELD)

public class Child {

    @XmlElement(nillable=true)

    private String string_StreetName;

    @XmlElement(nillable=true)

    private String string_PINCODE;

    @XmlElement(nillable=true)

    private String string_State;

    @XmlElement(nillable=true)

    private String string_Country;

    /**

     * @return the string_StreetName

     */

    public String getString_StreetName() {

        return string_StreetName;

    }

    /**

     * @param stringStreetName the string_StreetName to set

     */

    public void setString_StreetName(String stringStreetName) {

        string_StreetName = stringStreetName;

    }

    /**

     * @return the string_PINCODE

     */

    public String getString_PINCODE() {

        return string_PINCODE;

    }

    /**

     * @param stringPINCODE the string_PINCODE to set

     */

    public void setString_PINCODE(String stringPINCODE) {

        string_PINCODE = stringPINCODE;

    }

    /**

     * @return the string_State

     */

    public String getString_State() {

        return string_State;

    }

    /**

     * @param stringState the string_State to set

     */

    public void setString_State(String stringState) {

        string_State = stringState;

    }

    /**

     * @return the string_Country

     */

    public String getString_Country() {

        return string_Country;

    }

    /**

     * @param stringCountry the string_Country to set

     */

    public void setString_Country(String stringCountry) {

        string_Country = stringCountry;

    }

}