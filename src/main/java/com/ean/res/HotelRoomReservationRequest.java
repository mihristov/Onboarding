package com.ean.res;

import com.ean.common.CommonRequest;
import com.ean.entities.AddressInfo;
import com.ean.entities.ReservationInfo;
import com.ean.entities.RoomGroup;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/16/2016.
 */
@XmlType(propOrder = {
        "hotelId",
        "arrivalDate",
        "departureDate",
        "supplierType",
        "rateKey",
        "roomTypeCode",
        "roomDescription",
        "rateCode",
        "sendReservationEmail",
        "affiliateConfirmationId",
        "affiliateCustomerId",
        "itineraryId",
        "chargeableRate",
        "specialInformation",
        "roomGroup",
        "reservationInfo",
        "addressInfo"
})
@XmlRootElement(name = "HotelRoomReservationRequest")
public class HotelRoomReservationRequest extends CommonRequest {
    private Long hotelId;
    private String arrivalDate;
    private String departureDate;
    private String supplierType;
    private String rateKey;
    private String roomTypeCode;
    private String roomDescription;
    private String rateCode;
    private RoomGroup roomGroup;
    private String affiliateConfirmationId;
    private String affiliateCustomerId;
    private Long itineraryId;
    private Double chargeableRate;
    private String specialInformation;
    private Boolean sendReservationEmail;
    private AddressInfo addressInfo;
    private ReservationInfo reservationInfo;

    public HotelRoomReservationRequest() {
    }

    public Long getHotelId() {
        return hotelId;
    }

    @XmlElement
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
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

    public String getSupplierType() {
        return supplierType;
    }

    @XmlElement
    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getRateKey() {
        return rateKey;
    }

    @XmlElement
    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    @XmlElement
    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public String getRateCode() {
        return rateCode;
    }

    @XmlElement
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public RoomGroup getRoomGroup() {
        return roomGroup;
    }

    @XmlElement(name = "RoomGroup")
    public void setRoomGroup(RoomGroup roomGroup) {
        this.roomGroup = roomGroup;
    }

    public String getAffiliateConfirmationId() {
        return affiliateConfirmationId;
    }

    @XmlElement
    public void setAffiliateConfirmationId(String affiliateConfirmationId) {
        this.affiliateConfirmationId = affiliateConfirmationId;
    }

    public String getAffiliateCustomerId() {
        return affiliateCustomerId;
    }

    @XmlElement
    public void setAffiliateCustomerId(String affiliateCustomerId) {
        this.affiliateCustomerId = affiliateCustomerId;
    }

    public Long getItineraryId() {
        return itineraryId;
    }

    @XmlElement
    public void setItineraryId(Long itineraryId) {
        this.itineraryId = itineraryId;
    }

    public Double getChargeableRate() {
        return chargeableRate;
    }

    @XmlElement
    public void setChargeableRate(Double chargeableRate) {
        this.chargeableRate = chargeableRate;
    }

    public String getSpecialInformation() {
        return specialInformation;
    }

    @XmlElement
    public void setSpecialInformation(String specialInformation) {
        this.specialInformation = specialInformation;
    }

    public Boolean getSendReservationEmail() {
        return sendReservationEmail;
    }

    @XmlElement
    public void setSendReservationEmail(Boolean sendReservationEmail) {
        this.sendReservationEmail = sendReservationEmail;
    }

    public AddressInfo getAddressInfo() {
        return addressInfo;
    }

    @XmlElement(name = "AddressInfo")
    public void setAddressInfo(AddressInfo addressInfo) {
        this.addressInfo = addressInfo;
    }

    public ReservationInfo getReservationInfo() {
        return reservationInfo;
    }

    @XmlElement(name = "ReservationInfo")
    public void setReservationInfo(ReservationInfo reservationInfo) {
        this.reservationInfo = reservationInfo;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    @XmlElement
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    @Override
    public String toString() {
        return "HotelRoomReservationRequest{" +
                "addressInfo=" + addressInfo +
                ", hotelId=" + hotelId +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", supplierType='" + supplierType + '\'' +
                ", rateKey='" + rateKey + '\'' +
                ", roomTypeCode='" + roomTypeCode + '\'' +
                ", roomDescription='" + roomDescription + '\'' +
                ", rateCode='" + rateCode + '\'' +
                ", roomGroup=" + roomGroup +
                ", affiliateConfirmationId='" + affiliateConfirmationId + '\'' +
                ", affiliateCustomerId='" + affiliateCustomerId + '\'' +
                ", itineraryId=" + itineraryId +
                ", chargeableRate=" + chargeableRate +
                ", specialInformation='" + specialInformation + '\'' +
                ", sendReservationEmail=" + sendReservationEmail +
                ", reservationInfo=" + reservationInfo +
                '}';
    }
}




