package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(propOrder = {
        "supplierId",
        "chainCode",
        "creditCardType",
        "arrivalDate",
        "departureDate",
        "confirmationNumber",
        "cancellationNumber",
        "rateInfos",
        "numberOfAdults",
        "numberOfChildren",
        "affiliateConfirmationId",
        "smokingPreference",
        "supplierPropertyId",
        "roomTypeCode",
        "roomType",
        "rateCode",
        "rateType",
        "rateDescription",
        "roomDescription",
        "status",
        "locale",
        "genericRefund",
        "reservationGuest",
        "hotel",
        "confirmationExtras",
        "nights",
        "valueAdds"
})
public class HotelConfirmation {
    private Long supplierId;
    private String chainCode;
    private String creditCardType;
    private String arrivalDate;
    private String departureDate;
    private String confirmationNumber;
    private String cancellationNumber;
    private Integer numberOfAdults;
    private String numberOfChildren;
    private String affiliateConfirmationId;
    private SmokingPreference smokingPreference;
    private String supplierPropertyId;
    private String roomType;
    private String rateType;
    private String rateDescription;
    private String roomTypeCode;
    private String rateCode;
    private String roomDescription;
    private String status;
    private String locale;
    private Integer nights;
    private GenericRefund genericRefund;
    private RateInfos rateInfos;
    private ReservationGuest reservationGuest;
    private Hotel hotel;
    private ConfirmationExtras confirmationExtras;
    private ValueAdds valueAdds;

    public HotelConfirmation() {
    }

    public String getAffiliateConfirmationId() {
        return affiliateConfirmationId;
    }

    @XmlElement
    public void setAffiliateConfirmationId(String affiliateConfirmationId) {
        this.affiliateConfirmationId = affiliateConfirmationId;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    @XmlElement
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getCancellationNumber() {
        return cancellationNumber;
    }

    @XmlElement
    public void setCancellationNumber(String cancellationNumber) {
        this.cancellationNumber = cancellationNumber;
    }

    public String getChainCode() {
        return chainCode;
    }

    @XmlElement
    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    public ConfirmationExtras getConfirmationExtras() {
        return confirmationExtras;
    }

    @XmlElement(name = "ConfirmationExtras")
    public void setConfirmationExtras(ConfirmationExtras confirmationExtras) {
        this.confirmationExtras = confirmationExtras;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    @XmlElement
    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getCreditCardType() {
        return creditCardType;
    }

    @XmlElement
    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    @XmlElement
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public GenericRefund getGenericRefund() {
        return genericRefund;
    }

    @XmlElement(name = "GenericRefund")
    public void setGenericRefund(GenericRefund genericRefund) {
        this.genericRefund = genericRefund;
    }

    public Hotel getHotel() {
        return hotel;
    }

    @XmlElement(name = "Hotel")
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getLocale() {
        return locale;
    }

    @XmlElement
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Integer getNights() {
        return nights;
    }

    @XmlElement
    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }

    @XmlElement
    public void setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public String getNumberOfChildren() {
        return numberOfChildren;
    }

    @XmlElement
    public void setNumberOfChildren(String numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public String getRateDescription() {
        return rateDescription;
    }

    @XmlElement
    public void setRateDescription(String rateDescription) {
        this.rateDescription = rateDescription;
    }

    public RateInfos getRateInfos() {
        return rateInfos;
    }

    @XmlElement(name = "RateInfos")
    public void setRateInfos(RateInfos rateInfos) {
        this.rateInfos = rateInfos;
    }

    public String getRateType() {
        return rateType;
    }

    @XmlElement
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public ReservationGuest getReservationGuest() {
        return reservationGuest;
    }

    @XmlElement(name = "ReservationGuest")
    public void setReservationGuest(ReservationGuest reservationGuest) {
        this.reservationGuest = reservationGuest;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    @XmlElement
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRoomType() {
        return roomType;
    }

    @XmlElement
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public SmokingPreference getSmokingPreference() {
        return smokingPreference;
    }

    @XmlElement
    public void setSmokingPreference(SmokingPreference smokingPreference) {
        this.smokingPreference = smokingPreference;
    }

    public String getStatus() {
        return status;
    }

    @XmlElement
    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    @XmlElement
    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierPropertyId() {
        return supplierPropertyId;
    }

    @XmlElement
    public void setSupplierPropertyId(String supplierPropertyId) {
        this.supplierPropertyId = supplierPropertyId;
    }

    public ValueAdds getValueAdds() {
        return valueAdds;
    }

    @XmlElement(name = "ValueAdds")
    public void setValueAdds(ValueAdds valueAdds) {
        this.valueAdds = valueAdds;
    }

    public String getRateCode() {
        return rateCode;
    }

    @XmlElement
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    @XmlElement
    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    @Override
    public String toString() {
        return "HotelConfirmation: \nNights: " + nights + "\nArrival Date: " + arrivalDate + "\nDeparture Date: " + departureDate +
                "\nConfirmation Number: " + confirmationNumber + "\nSmoking preferences: " + smokingPreference.getValue() + "\nNightly "
                + "price: " + rateInfos.getRateInfo()[0].getChargeableRateInfo().getAverageRate() + "\nNumber of adults: " +
                numberOfAdults + "\nNumber of children: " + numberOfChildren + "\n" + hotel;
    }
}
