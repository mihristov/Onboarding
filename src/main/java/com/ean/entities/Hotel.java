package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(propOrder = {
        "hotelId",
        "statusCode",
        "name",
        "address1",
        "address2",
        "address3",
        "city",
        "stateProvinceCode",
        "countryCode",
        "postalCode",
        "phone",
        "fax",
        "latitude",
        "longitude",
        "coordinateAccuracyCode",
        "lowRate",
        "highRate",
        "confidence",
        "hotelRating",
        "tripAdvisorRating",
        "market",
        "region",
        "superRegion",
        "theme"
})
public class Hotel {
    private Long hotelId;
    private String statusCode;
    private String name;
    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String stateProvinceCode;
    private String countryCode;
    private String postalCode;
    private String phone;
    private String fax;
    private Float latitude;
    private Float longitude;
    private Long confidence;
    private String coordinateAccuracyCode;
    private Double tripAdvisorRating;
    private Float lowRate;
    private Float highRate;
    private Float hotelRating;
    private String market;
    private String region;
    private String superRegion;
    private String theme;

    public Hotel() {
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

    public String getCoordinateAccuracyCode() {
        return coordinateAccuracyCode;
    }

    @XmlElement
    public void setCoordinateAccuracyCode(String coordinateAccuracyCode) {
        this.coordinateAccuracyCode = coordinateAccuracyCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    @XmlElement
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFax() {
        return fax;
    }

    @XmlElement
    public void setFax(String fax) {
        this.fax = fax;
    }

    public Float getHighRate() {
        return highRate;
    }

    @XmlElement
    public void setHighRate(Float highRate) {
        this.highRate = highRate;
    }

    public Long getHotelId() {
        return hotelId;
    }

    @XmlElement
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Float getHotelRating() {
        return hotelRating;
    }

    @XmlElement
    public void setHotelRating(Float hotelRating) {
        this.hotelRating = hotelRating;
    }

    public Float getLatitude() {
        return latitude;
    }

    @XmlElement
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    @XmlElement
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLowRate() {
        return lowRate;
    }

    @XmlElement
    public void setLowRate(Float lowRate) {
        this.lowRate = lowRate;
    }

    public String getMarket() {
        return market;
    }

    @XmlElement
    public void setMarket(String market) {
        this.market = market;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    @XmlElement
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @XmlElement
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    @XmlElement
    public void setRegion(String region) {
        this.region = region;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    @XmlElement
    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    @XmlElement
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getSuperRegion() {
        return superRegion;
    }

    @XmlElement
    public void setSuperRegion(String superRegion) {
        this.superRegion = superRegion;
    }

    public String getTheme() {
        return theme;
    }

    @XmlElement
    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Long getConfidence() {
        return confidence;
    }

    @XmlElement
    public void setConfidence(Long confidence) {
        this.confidence = confidence;
    }

    public Double getTripAdvisorRating() {
        return tripAdvisorRating;
    }

    @XmlElement
    public void setTripAdvisorRating(Double tripAdvisorRating) {
        this.tripAdvisorRating = tripAdvisorRating;
    }

    @Override
    public String toString() {
        return "Hotel:\nName: " + name + "\nAddress: " + address1 + "\nCity: " + city + "\nPostal code: " + postalCode;
    }
}
