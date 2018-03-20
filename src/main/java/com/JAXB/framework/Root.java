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

@XmlRootElement(name = "Root")

@XmlAccessorType(XmlAccessType.FIELD)

public class Root {

    @XmlElement(nillable=true)

    private String string_FirstName;

    @XmlElement(nillable=true)

    private String string_LastName;

    @XmlElement(nillable=true)

    private Child child;

    @XmlElement(nillable=true)
    private  Beer beer;

    /**

     * @return the string_FirstName

     */

    public String getString_FirstName() {

        return string_FirstName;

    }

    /**

     * @param stringFirstName the string_FirstName to set

     */

    public void setString_FirstName(String stringFirstName) {

        string_FirstName = stringFirstName;

    }

    /**

     * @return the string_LastName

     */

    public String getString_LastName() {

        return string_LastName;

    }

    /**

     * @param stringLastName the string_LastName to set

     */

    public void setString_LastName(String stringLastName) {

        string_LastName = stringLastName;

    }

    /**

     * @return the child

     */

    public Child getChild() {

        return child;

    }

    /**

     * @param child the child to set

     */

    public void setChild(Child child) {

        this.child = child;

    }

    public Beer getBeer() {
        return beer;
    }

    public void setBeer(Beer beer) {
        this.beer = beer;
    }
}
