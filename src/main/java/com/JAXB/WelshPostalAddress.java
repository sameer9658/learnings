package com.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class WelshPostalAddress {

    UKPostalAddress ukPostalAddress;

    public UKPostalAddress getUkPostalAddress() {
        return ukPostalAddress;
    }
    @XmlElement
    public void setUkPostalAddress(UKPostalAddress ukPostalAddress) {
        this.ukPostalAddress = ukPostalAddress;
    }

    @Override
    public String toString() {
        return "WelshPostalAddress{" +
                "ukPostalAddress=" + ukPostalAddress +
                '}';
    }
}
