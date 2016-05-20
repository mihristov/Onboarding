package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class HotelDetails {
    private String nativeCurrencyCode;
    private Integer numberOfRooms;
    private Integer numberOfFloors;
    private String checkInTime;
    private String checkOutTime;
    private Float extraPersonCharge;
    private String propertyInformation;
    private String areaInformation;
    private String propertyDescription;
    private String hotelPolicy;
    private String depositCreditCardsAccepted;
    private String roomInformation;
    private String drivingDirections;
    private String checkInInstructions;
    private String locationDescription;
    private String diningDescription;
    private String amenitiesDescription;
    private String businessAmenitiesDescription;
    private String roomDetailDescription;
    private String roomFeesDescription;
    private String mandatoryFeesDescription;
    private String nationalRatingsDescription;
    private String knowBeforeYouGoDescription;
    private String renovationsDescription;

    public HotelDetails() {
    }

    public String getAmenitiesDescription() {
        return amenitiesDescription;
    }

    @XmlElement
    public void setAmenitiesDescription(String amenitiesDescription) {
        this.amenitiesDescription = amenitiesDescription;
    }

    public String getAreaInformation() {
        return areaInformation;
    }

    @XmlElement
    public void setAreaInformation(String areaInformation) {
        this.areaInformation = areaInformation;
    }

    public String getBusinessAmenitiesDescription() {
        return businessAmenitiesDescription;
    }

    @XmlElement
    public void setBusinessAmenitiesDescription(String businessAmenitiesDescription) {
        this.businessAmenitiesDescription = businessAmenitiesDescription;
    }

    public String getCheckInInstructions() {
        return checkInInstructions;
    }

    @XmlElement
    public void setCheckInInstructions(String checkInInstructions) {
        this.checkInInstructions = checkInInstructions;
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    @XmlElement
    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime;
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    @XmlElement
    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getDepositCreditCardsAccepted() {
        return depositCreditCardsAccepted;
    }

    @XmlElement
    public void setDepositCreditCardsAccepted(String depositCreditCardsAccepted) {
        this.depositCreditCardsAccepted = depositCreditCardsAccepted;
    }

    public String getDiningDescription() {
        return diningDescription;
    }

    @XmlElement
    public void setDiningDescription(String diningDescription) {
        this.diningDescription = diningDescription;
    }

    public String getDrivingDirections() {
        return drivingDirections;
    }

    @XmlElement
    public void setDrivingDirections(String drivingDirections) {
        this.drivingDirections = drivingDirections;
    }

    public Float getExtraPersonCharge() {
        return extraPersonCharge;
    }

    @XmlElement
    public void setExtraPersonCharge(Float extraPersonCharge) {
        this.extraPersonCharge = extraPersonCharge;
    }

    public String getHotelPolicy() {
        return hotelPolicy;
    }

    @XmlElement
    public void setHotelPolicy(String hotelPolicy) {
        this.hotelPolicy = hotelPolicy;
    }

    public String getKnowBeforeYouGoDescription() {
        return knowBeforeYouGoDescription;
    }

    @XmlElement
    public void setKnowBeforeYouGoDescription(String knowBeforeYouGoDescription) {
        this.knowBeforeYouGoDescription = knowBeforeYouGoDescription;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    @XmlElement
    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getMandatoryFeesDescription() {
        return mandatoryFeesDescription;
    }

    @XmlElement
    public void setMandatoryFeesDescription(String mandatoryFeesDescription) {
        this.mandatoryFeesDescription = mandatoryFeesDescription;
    }

    public String getNationalRatingsDescription() {
        return nationalRatingsDescription;
    }

    @XmlElement
    public void setNationalRatingsDescription(String nationalRatingsDescription) {
        this.nationalRatingsDescription = nationalRatingsDescription;
    }

    public String getNativeCurrencyCode() {
        return nativeCurrencyCode;
    }

    @XmlElement
    public void setNativeCurrencyCode(String nativeCurrencyCode) {
        this.nativeCurrencyCode = nativeCurrencyCode;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    @XmlElement
    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }

    @XmlElement
    public void setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getPropertyDescription() {
        return propertyDescription;
    }

    @XmlElement
    public void setPropertyDescription(String propertyDescription) {
        this.propertyDescription = propertyDescription;
    }

    public String getPropertyInformation() {
        return propertyInformation;
    }

    @XmlElement
    public void setPropertyInformation(String propertyInformation) {
        this.propertyInformation = propertyInformation;
    }

    public String getRenovationsDescription() {
        return renovationsDescription;
    }

    @XmlElement
    public void setRenovationsDescription(String renovationsDescription) {
        this.renovationsDescription = renovationsDescription;
    }

    public String getRoomDetailDescription() {
        return roomDetailDescription;
    }

    @XmlElement
    public void setRoomDetailDescription(String roomDetailDescription) {
        this.roomDetailDescription = roomDetailDescription;
    }

    public String getRoomFeesDescription() {
        return roomFeesDescription;
    }

    @XmlElement
    public void setRoomFeesDescription(String roomFeesDescription) {
        this.roomFeesDescription = roomFeesDescription;
    }

    public String getRoomInformation() {
        return roomInformation;
    }

    @XmlElement
    public void setRoomInformation(String roomInformation) {
        this.roomInformation = roomInformation;
    }

    @Override
    public String toString() {
        return "HotelDetails{" +
                "amenitiesDescription='" + amenitiesDescription + '\'' +
                ", nativeCurrencyCode='" + nativeCurrencyCode + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfFloors=" + numberOfFloors +
                ", checkInTime='" + checkInTime + '\'' +
                ", checkOutTime='" + checkOutTime + '\'' +
                ", extraPersonCharge=" + extraPersonCharge +
                ", propertyInformation='" + propertyInformation + '\'' +
                ", areaInformation='" + areaInformation + '\'' +
                ", propertyDescription='" + propertyDescription + '\'' +
                ", hotelPolicy='" + hotelPolicy + '\'' +
                ", depositCreditCardsAccepted='" + depositCreditCardsAccepted + '\'' +
                ", roomInformation='" + roomInformation + '\'' +
                ", drivingDirections='" + drivingDirections + '\'' +
                ", checkInInstructions='" + checkInInstructions + '\'' +
                ", locationDescription='" + locationDescription + '\'' +
                ", diningDescription='" + diningDescription + '\'' +
                ", businessAmenitiesDescription='" + businessAmenitiesDescription + '\'' +
                ", roomDetailDescription='" + roomDetailDescription + '\'' +
                ", roomFeesDescription='" + roomFeesDescription + '\'' +
                ", mandatoryFeesDescription='" + mandatoryFeesDescription + '\'' +
                ", nationalRatingsDescription='" + nationalRatingsDescription + '\'' +
                ", knowBeforeYouGoDescription='" + knowBeforeYouGoDescription + '\'' +
                ", renovationsDescription='" + renovationsDescription + '\'' +
                '}';
    }
}
