package com.JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UKPostalAddress {

    private String thoroughfareNumber;
    private String thoroughfareName;
    private String dependentThoroughfareName;
    private String dependentLocality;
    private String subPremise;
    private String organization;
    private String postTown;
    private String buildingName;
    private String county;
    private String poBox;
    private String postCode;

    @XmlElement
    public void setThoroughfareNumber(String thoroughfareNumber) {
        this.thoroughfareNumber = thoroughfareNumber;
    }
    @XmlElement
    public void setThoroughfareName(String thoroughfareName) {
        this.thoroughfareName = thoroughfareName;
    }

    @XmlElement
    public void setDependentThoroughfareName(String dependentThoroughfareName) {
        this.dependentThoroughfareName = dependentThoroughfareName;
    }
    @XmlElement
    public void setDependentLocality(String dependentLocality) {
        this.dependentLocality = dependentLocality;
    }
    @XmlElement
    public void setSubPremise(String subPremise) {
        this.subPremise = subPremise;
    }
    @XmlElement
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    @XmlElement
    public void setPostTown(String postTown) {
        this.postTown = postTown;
    }
    @XmlElement
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
    @XmlElement
    public void setCounty(String county) {
        this.county = county;
    }
    @XmlElement
    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }
    @XmlElement
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getThoroughfareNumber() {

        return thoroughfareNumber;
    }

    public String getThoroughfareName() {
        return thoroughfareName;
    }

    public String getDependentThoroughfareName() {
        return dependentThoroughfareName;
    }

    public String getDependentLocality() {
        return dependentLocality;
    }

    public String getSubPremise() {
        return subPremise;
    }

    public String getOrganization() {
        return organization;
    }

    public String getPostTown() {
        return postTown;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public String getCounty() {
        return county;
    }

    public String getPoBox() {
        return poBox;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public String toString() {
        return "UKPostalAddress{" +
                "thoroughfareNumber='" + thoroughfareNumber + '\'' +
                ", thoroughfareName='" + thoroughfareName + '\'' +
                ", dependentThoroughfareName='" + dependentThoroughfareName + '\'' +
                ", dependentLocality='" + dependentLocality + '\'' +
                ", subPremise='" + subPremise + '\'' +
                ", organization='" + organization + '\'' +
                ", postTown='" + postTown + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", county='" + county + '\'' +
                ", poBox='" + poBox + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
