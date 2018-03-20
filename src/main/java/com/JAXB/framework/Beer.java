package com.JAXB.framework;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="beer")

@XmlAccessorType(XmlAccessType.FIELD)
public class Beer {

    @XmlElement(nillable=true)
   private String strong;
    @XmlElement(nillable=true)
    private String premium;
    @XmlElement(nillable=true)
    private String brewery;

    public String getStrong() {
        return strong;
    }

    public void setStrong(String strong) {
        this.strong = strong;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getBrewery() {
        return brewery;
    }

    public void setBrewery(String brewery) {
        this.brewery = brewery;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "strong='" + strong + '\'' +
                ", premium='" + premium + '\'' +
                ", brewery='" + brewery + '\'' +
                '}';
    }
}
