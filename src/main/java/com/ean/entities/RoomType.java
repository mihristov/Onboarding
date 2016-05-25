package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class RoomType {
    /**
     * Attributes
     */
    private String roomCode;
    private String roomTypeId;

    private String description;
    private String descriptionLong;
    private RoomAmenities roomAmenities;
    private HotelDetails hotelDetails;
    private PropertyAmenities propertyAmenities;
    private HotelImages hotelImages;
    private RateInfos rateInfos;

    public RoomType() {
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionLong() {
        return descriptionLong;
    }

    @XmlElement
    public void setDescriptionLong(String descriptionLong) {
        this.descriptionLong = descriptionLong;
    }

    public HotelDetails getHotelDetails() {
        return hotelDetails;
    }

    @XmlElement(name = "HotelDetails")
    public void setHotelDetails(HotelDetails hotelDetails) {
        this.hotelDetails = hotelDetails;
    }

    public HotelImages getHotelImages() {
        return hotelImages;
    }

    @XmlElement(name = "HotelImages")
    public void setHotelImages(HotelImages hotelImages) {
        this.hotelImages = hotelImages;
    }

    public PropertyAmenities getPropertyAmenities() {
        return propertyAmenities;
    }

    @XmlElement(name = "PropertyAmenities")
    public void setPropertyAmenities(PropertyAmenities propertyAmenities) {
        this.propertyAmenities = propertyAmenities;
    }

    public RateInfos getRateInfos() {
        return rateInfos;
    }

    @XmlElement(name = "RateInfos")
    public void setRateInfos(RateInfos rateInfos) {
        this.rateInfos = rateInfos;
    }

    public RoomAmenities getRoomAmenities() {
        return roomAmenities;
    }

    @XmlElement
    public void setRoomAmenities(RoomAmenities roomAmenities) {
        this.roomAmenities = roomAmenities;
    }

    public String getRoomCode() {
        return roomCode;
    }

    @XmlAttribute
    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    @XmlAttribute
    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "description='" + description + '\'' +
                ", roomCode='" + roomCode + '\'' +
                ", roomTypeId='" + roomTypeId + '\'' +
                ", descriptionLong='" + descriptionLong + '\'' +
                ", roomAmenities=" + roomAmenities +
                ", hotelDetails=" + hotelDetails +
                ", propertyAmenities=" + propertyAmenities +
                ", hotelImages=" + hotelImages +
                ", rateInfos=" + rateInfos +
                '}';
    }
}
