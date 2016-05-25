package com.ean.roomavail;

import com.ean.common.CommonRequest;
import com.ean.entities.RoomGroup;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Milen on 5/16/2016.
 */
@XmlRootElement(name = "HotelRoomAvailabilityRequest")
public class HotelRoomAvailabilityRequest extends CommonRequest {
    private Long hotelId;
    private String arrivalDate;
    private String departureDate;
    private RoomGroup roomGroup;
    private String roomTypeCode;
    private String rateCode;
    private Boolean includeDetails;
    private Boolean includeRoomImages;
    private Boolean includeHotelFeeBreakdown;
    private String options; // csv
    private Integer numberOfBedRooms;
    private String supplierType;
    private String rateKey;

    public HotelRoomAvailabilityRequest() {
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    @XmlElement
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    @XmlElement
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public Long getHotelId() {
        return hotelId;
    }

    @XmlElement
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Boolean getIncludeDetails() {
        return includeDetails;
    }

    @XmlElement
    public void setIncludeDetails(Boolean includeDetails) {
        this.includeDetails = includeDetails;
    }

    public Boolean getIncludeHotelFeeBreakdown() {
        return includeHotelFeeBreakdown;
    }

    @XmlElement
    public void setIncludeHotelFeeBreakdown(Boolean includeHotelFeeBreakdown) {
        this.includeHotelFeeBreakdown = includeHotelFeeBreakdown;
    }

    public Boolean getIncludeRoomImages() {
        return includeRoomImages;
    }

    @XmlElement
    public void setIncludeRoomImages(Boolean includeRoomImages) {
        this.includeRoomImages = includeRoomImages;
    }

    public Integer getNumberOfBedRooms() {
        return numberOfBedRooms;
    }

    @XmlElement
    public void setNumberOfBedRooms(Integer numberOfBedRooms) {
        this.numberOfBedRooms = numberOfBedRooms;
    }

    public String getOptions() {
        return options;
    }

    @XmlElement
    public void setOptions(String options) {
        this.options = options;
    }

    public String getRateCode() {
        return rateCode;
    }

    @XmlElement
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getRateKey() {
        return rateKey;
    }

    @XmlElement
    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    public RoomGroup getRoomGroup() {
        return roomGroup;
    }

    @XmlElement(name = "RoomGroup")
    public void setRoomGroup(RoomGroup roomGroup) {
        this.roomGroup = roomGroup;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    @XmlElement
    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public String getSupplierType() {
        return supplierType;
    }

    @XmlElement
    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    @Override
    public String toString() {
        return "HotelRoomAvailabilityRequest{" +
                "arrivalDate='" + arrivalDate + '\'' +
                ", hotelId=" + hotelId +
                ", departureDate='" + departureDate + '\'' +
                ", roomGroup=" + roomGroup +
                ", roomTypeCode='" + roomTypeCode + '\'' +
                ", rateCode='" + rateCode + '\'' +
                ", includeDetails=" + includeDetails +
                ", includeRoomImages=" + includeRoomImages +
                ", includeHotelFeeBreakdown=" + includeHotelFeeBreakdown +
                ", options='" + options + '\'' +
                ", numberOfBedRooms=" + numberOfBedRooms +
                ", supplierType='" + supplierType + '\'' +
                ", rateKey='" + rateKey + '\'' +
                '}';
    }
}
