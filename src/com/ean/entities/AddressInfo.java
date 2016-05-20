package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class AddressInfo {
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateProvinceCode;
    private String countryCode;
    private String postalCode;

    public AddressInfo() {
    }

    public String getAddress1() {
        return address1;
    }

    @XmlElement
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    @XmlElement
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    @XmlElement
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    @XmlElement
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    @XmlElement
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @XmlElement
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    @XmlElement
    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    @Override
    public String toString() {
        return "AddressInfo{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", city='" + city + '\'' +
                ", stateProvinceCode='" + stateProvinceCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
