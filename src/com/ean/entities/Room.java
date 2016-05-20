package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(propOrder = {
        "numberOfAdults",
        "numberOfChildren",
        "childAges",
        "firstName",
        "lastName",
        "bedTypeId",
        "bedTypeDescription",
        "numberOfBeds",
        "smokingPreference",
        "roomTypeCode",
        "rateCode",
        "rateKey",
        "roomDescription",
        "chargeableRate",
        "chargeableNightlyRates"
})
public class Room {
    private String firstName;
    private String lastName;
    private String bedTypeId;
    private SmokingPreference smokingPreference;
    private Integer numberOfAdults;
    private Integer numberOfChildren;
    private Integer[] childAges;
    private String rateKey;
    private String bedTypeDescription;
    private Integer numberOfBeds;
    private String roomTypeCode;
    private Double chargeableRate;
    private String roomDescription;
    private String rateCode;
    private ChargeableNightlyRates chargeableNightlyRates;

    public Room() {
    }

    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    @XmlElement
    public void setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public Integer getNumberOfChildren() {
        return numberOfChildren;
    }

    @XmlElement
    public void setNumberOfChildren(Integer numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public Integer[] getChildAges() {
        return childAges;
    }

    @XmlElement
    public void setChildAges(Integer[] childAges) {
        this.childAges = childAges;
    }

    public String getRateKey() {
        return rateKey;
    }

    @XmlElement
    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    public ChargeableNightlyRates getChargeableNightlyRates() {
        return chargeableNightlyRates;
    }

    @XmlElement(name = "ChargeableNightlyRates")
    public void setChargeableNightlyRates(ChargeableNightlyRates chargeableNightlyRates) {
        this.chargeableNightlyRates = chargeableNightlyRates;
    }

    public String getBedTypeId() {
        return bedTypeId;
    }

    @XmlElement
    public void setBedTypeId(String bedTypeId) {
        this.bedTypeId = bedTypeId;
    }

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SmokingPreference getSmokingPreference() {
        return smokingPreference;
    }

    @XmlElement
    public void setSmokingPreference(SmokingPreference smokingPreference) {
        this.smokingPreference = smokingPreference;
    }

    public String getBedTypeDescription() {
        return bedTypeDescription;
    }

    @XmlElement
    public void setBedTypeDescription(String bedTypeDescription) {
        this.bedTypeDescription = bedTypeDescription;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    @XmlElement
    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    @XmlElement
    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public Double getChargeableRate() {
        return chargeableRate;
    }

    @XmlElement
    public void setChargeableRate(Double chargeableRate) {
        this.chargeableRate = chargeableRate;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    @XmlElement
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRateCode() {
        return rateCode;
    }

    @XmlElement
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }
}
