package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(propOrder = {
        "address1",
        "address2",
        "address3",
        "city",
        "stateProvinceCode",
        "countryCode",
        "postalCode",
        "isPrimary",
        "type"
})
public class CustomerAddresses {
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateProvinceCode;
    private String countryCode;
    private String postalCode;
    private Boolean isPrimary;
    private Integer type;

    public CustomerAddresses() {
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

    public Boolean isIsPrimary() {
        return isPrimary;
    }

    @XmlElement
    public void setIsPrimary(Boolean primary) {
        isPrimary = primary;
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

    public Integer getType() {
        return type;
    }

    @XmlElement
    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CustomerAddresses{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", city='" + city + '\'' +
                ", stateProvinceCode='" + stateProvinceCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", isPrimary=" + isPrimary +
                ", type=" + type +
                '}';
    }
}
