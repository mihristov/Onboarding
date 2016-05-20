package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(propOrder = {
        "hotelId",
        "name",
        "address1",
        "city",
        "stateProvinceCode",
        "postalCode",
        "countryCode",
        "airportCode",
        "supplierType",
        "propertyCategory",
        "hotelRating",
        "hotelRatingDisplay",
        "confidenceRating",
        "amenityMask",
        "locationDescription",
        "shortDescription",
        "highRate",
        "lowRate",
        "rateCurrencyCode",
        "latitude",
        "longitude",
        "proximityDistance",
        "proximityUnit",
        "hotelInDestination",
        "thumbNailUrl",
        "deepLink",
        "roomRateDetailsList"
})
public class HotelSummary {
    /**
     * Attributes
     */
    private Integer order;
    private String ubsScore;

    private Long hotelId;
    private String name;
    private String address1;
    private String city;
    private String stateProvinceCode;
    private String countryCode;
    private String postalCode;
    private String airportCode;
    private String supplierType;
    private String propertyCategory;
    private Float hotelRating;
    private String hotelRatingDisplay;
    private Integer confidenceRating;
    private Long amenityMask;
    private String locationDescription;
    private String shortDescription;
    private String highRate;
    private String lowRate;
    private String rateCurrencyCode;
    private Float latitude;
    private Float longitude;
    private Float proximityDistance;
    private String proximityUnit;
    private Boolean hotelInDestination;
    private String thumbNailUrl;
    private String deepLink;
    private RoomRateDetailsList roomRateDetailsList;

    public HotelSummary() {
    }

    public String getAddress1() {
        return address1;
    }

    @XmlElement
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAirportCode() {
        return airportCode;
    }

    @XmlElement
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
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

    public String getDeepLink() {
        return deepLink;
    }

    @XmlElement
    public void setDeepLink(String deepLink) {
        this.deepLink = deepLink;
    }

    public String getHighRate() {
        return highRate;
    }

    @XmlElement
    public void setHighRate(String highRate) {
        this.highRate = highRate;
    }

    public Long getHotelId() {
        return hotelId;
    }

    @XmlElement
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Boolean getHotelInDestination() {
        return hotelInDestination;
    }

    @XmlElement
    public void setHotelInDestination(Boolean hotelInDestination) {
        this.hotelInDestination = hotelInDestination;
    }

    public Float getHotelRating() {
        return hotelRating;
    }

    @XmlElement
    public void setHotelRating(Float hotelRating) {
        this.hotelRating = hotelRating;
    }

    public String getHotelRatingDisplay() {
        return hotelRatingDisplay;
    }

    @XmlElement
    public void setHotelRatingDisplay(String hotelRatingDisplay) {
        this.hotelRatingDisplay = hotelRatingDisplay;
    }

    public Float getLatitude() {
        return latitude;
    }

    @XmlElement
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    @XmlElement
    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public Float getLongitude() {
        return longitude;
    }

    @XmlElement
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getLowRate() {
        return lowRate;
    }

    @XmlElement
    public void setLowRate(String lowRate) {
        this.lowRate = lowRate;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    @XmlAttribute
    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @XmlElement
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPropertyCategory() {
        return propertyCategory;
    }

    @XmlElement
    public void setPropertyCategory(String propertyCategory) {
        this.propertyCategory = propertyCategory;
    }

    public Float getProximityDistance() {
        return proximityDistance;
    }

    @XmlElement
    public void setProximityDistance(Float proximityDistance) {
        this.proximityDistance = proximityDistance;
    }

    public String getProximityUnit() {
        return proximityUnit;
    }

    @XmlElement
    public void setProximityUnit(String proximityUnit) {
        this.proximityUnit = proximityUnit;
    }

    public String getRateCurrencyCode() {
        return rateCurrencyCode;
    }

    @XmlElement
    public void setRateCurrencyCode(String rateCurrencyCode) {
        this.rateCurrencyCode = rateCurrencyCode;
    }

    public RoomRateDetailsList getRoomRateDetailsList() {
        return roomRateDetailsList;
    }

    @XmlElement(name = "RoomRateDetailsList")
    public void setRoomRateDetailsList(RoomRateDetailsList roomRateDetailsList) {
        this.roomRateDetailsList = roomRateDetailsList;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    @XmlElement
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    @XmlElement
    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public String getSupplierType() {
        return supplierType;
    }

    @XmlElement
    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getThumbNailUrl() {
        return thumbNailUrl;
    }

    @XmlElement
    public void setThumbNailUrl(String thumbNailUrl) {
        this.thumbNailUrl = thumbNailUrl;
    }

    public Integer getConfidenceRating() {
        return confidenceRating;
    }

    @XmlElement
    public void setConfidenceRating(Integer confidenceRating) {
        this.confidenceRating = confidenceRating;
    }

    public Long getAmenityMask() {
        return amenityMask;
    }

    @XmlElement
    public void setAmenityMask(Long amenityMask) {
        this.amenityMask = amenityMask;
    }

    public String getUbsScore() {
        return ubsScore;
    }

    @XmlAttribute
    public void setUbsScore(String ubsScore) {
        this.ubsScore = ubsScore;
    }

    @Override
    public String toString() {
        return name + "\nAddress: " + address1 + "\n" + locationDescription + "\nHotel ID: " + hotelId + "\nAverage nightly price: " +
                roomRateDetailsList.getRoomRateDetails()[0].getRateInfos().getRateInfo()[0].getChargeableRateInfo().getAverageBaseRate() +
                " " + rateCurrencyCode + "\nHotel Rating:"
                + " " +
                hotelRating +
                "\n####################################################################\n\n";
    }
}
