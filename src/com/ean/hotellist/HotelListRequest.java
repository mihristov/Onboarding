package com.ean.hotellist;

import com.ean.common.CommonRequest;
import com.ean.entities.RoomGroup;
import com.ean.entities.SearchRadiusUnit;
import com.ean.entities.Sort;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/16/2016.
 */
@XmlRootElement(name = "HotelListRequest")
public class HotelListRequest extends CommonRequest {
    private String city;
    private String address;
    private String stateProvinceCode;
    private String postalCode;
    private String countryCode;
    private String destinationId;
    private String destinationString;
    private Long[] hotelIdList;
    private Double latitude;
    private Double longitude;
    private Integer searchRadius;
    private SearchRadiusUnit searchRadiusUnit;
    private Sort sort;
    private String propertyName;
    private Integer[] amenities;
    private Double minStarRating;
    private Double maxStarRating;
    private Double minTripAdvisorRating;
    private Double maxTripAdvisorRating;
    private Integer minRate;
    private Integer maxRate;
    private String[] propertyCategory;
    private String supplierType;
    private Integer numberOfBedRooms;
    private Integer maxRatePlanCount;
    private String arrivalDate;
    private String departureDate;
    private Integer numberOfResults;
    private RoomGroup roomGroup;
    private Boolean includeDetails;
    private Boolean includeHotelFeeBreakdown;
    private String cacheKey;
    private String cacheLocation;

    public HotelListRequest() {
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

    public Integer getNumberOfResults() {
        return numberOfResults;
    }

    @XmlElement
    public void setNumberOfResults(Integer numberOfResults) {
        this.numberOfResults = numberOfResults;
    }

    public RoomGroup getRoomGroup() {
        return roomGroup;
    }

    @XmlElement(name = "RoomGroup")
    public void setRoomGroup(RoomGroup roomGroup) {
        this.roomGroup = roomGroup;
    }

    public String getAddress() {
        return address;
    }

    @XmlElement
    public void setAddress(String address) {
        this.address = address;
    }

    public Integer[] getAmenities() {
        return amenities;
    }

    @XmlElement
    public void setAmenities(Integer[] amenities) {
        this.amenities = amenities;
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

    public String getDestinationId() {
        return destinationId;
    }

    @XmlElement
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestinationString() {
        return destinationString;
    }

    @XmlElement
    public void setDestinationString(String destinationString) {
        this.destinationString = destinationString;
    }

    public Long[] getHotelIdList() {
        return hotelIdList;
    }

    @XmlElement
    public void setHotelIdList(Long[] hotelIdList) {
        this.hotelIdList = hotelIdList;
    }

    public Double getLatitude() {
        return latitude;
    }

    @XmlElement
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @XmlElement
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getMaxRate() {
        return maxRate;
    }

    @XmlElement
    public void setMaxRate(Integer maxRate) {
        this.maxRate = maxRate;
    }

    public Integer getMaxRatePlanCount() {
        return maxRatePlanCount;
    }

    @XmlElement
    public void setMaxRatePlanCount(Integer maxRatePlanCount) {
        this.maxRatePlanCount = maxRatePlanCount;
    }

    public Double getMaxStarRating() {
        return maxStarRating;
    }

    @XmlElement
    public void setMaxStarRating(Double maxStarRating) {
        this.maxStarRating = maxStarRating;
    }

    public Double getMaxTripAdvisorRating() {
        return maxTripAdvisorRating;
    }

    @XmlElement
    public void setMaxTripAdvisorRating(Double maxTripAdvisorRating) {
        this.maxTripAdvisorRating = maxTripAdvisorRating;
    }

    public Integer getMinRate() {
        return minRate;
    }

    @XmlElement
    public void setMinRate(Integer minRate) {
        this.minRate = minRate;
    }

    public Double getMinStarRating() {
        return minStarRating;
    }

    @XmlElement
    public void setMinStarRating(Double minStarRating) {
        this.minStarRating = minStarRating;
    }

    public Double getMinTripAdvisorRating() {
        return minTripAdvisorRating;
    }

    @XmlElement
    public void setMinTripAdvisorRating(Double minTripAdvisorRating) {
        this.minTripAdvisorRating = minTripAdvisorRating;
    }

    public Integer getNumberOfBedRooms() {
        return numberOfBedRooms;
    }

    @XmlElement
    public void setNumberOfBedRooms(Integer numberOfBedRooms) {
        this.numberOfBedRooms = numberOfBedRooms;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @XmlElement
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String[] getPropertyCategory() {
        return propertyCategory;
    }

    @XmlElement
    public void setPropertyCategory(String[] propertyCategory) {
        this.propertyCategory = propertyCategory;
    }

    public String getPropertyName() {
        return propertyName;
    }

    @XmlElement
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Integer getSearchRadius() {
        return searchRadius;
    }

    @XmlElement
    public void setSearchRadius(Integer searchRadius) {
        this.searchRadius = searchRadius;
    }

    public SearchRadiusUnit getSearchRadiusUnit() {
        return searchRadiusUnit;
    }

    @XmlElement
    public void setSearchRadiusUnit(SearchRadiusUnit searchRadiusUnit) {
        this.searchRadiusUnit = searchRadiusUnit;
    }

    public Sort getSort() {
        return sort;
    }

    @XmlElement(name = "Sort")
    public void setSort(Sort sort) {
        this.sort = sort;
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

    public String getCacheKey() {
        return cacheKey;
    }

    @XmlElement
    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

    public String getCacheLocation() {
        return cacheLocation;
    }

    @XmlElement
    public void setCacheLocation(String cacheLocation) {
        this.cacheLocation = cacheLocation;
    }

    @Override
    public String toString() {
        return "HotelListRequest{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", stateProvinceCode='" + stateProvinceCode + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", destinationId='" + destinationId + '\'' +
                ", destinationString='" + destinationString + '\'' +
                ", hotelIdList=" + Arrays.toString(hotelIdList) +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", searchRadius=" + searchRadius +
                ", searchRadiusUnit=" + searchRadiusUnit +
                ", sort=" + sort +
                ", propertyName='" + propertyName + '\'' +
                ", amenities=" + Arrays.toString(amenities) +
                ", minStarRating=" + minStarRating +
                ", maxStarRating=" + maxStarRating +
                ", minTripAdvisorRating=" + minTripAdvisorRating +
                ", maxTripAdvisorRating=" + maxTripAdvisorRating +
                ", minRate=" + minRate +
                ", maxRate=" + maxRate +
                ", propertyCategory=" + Arrays.toString(propertyCategory) +
                ", supplierType='" + supplierType + '\'' +
                ", numberOfBedRooms=" + numberOfBedRooms +
                ", maxRatePlanCount=" + maxRatePlanCount +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", numberOfResults=" + numberOfResults +
                ", roomGroup=" + roomGroup +
                ", includeDetails=" + includeDetails +
                ", includeHotelFeeBreakdown=" + includeHotelFeeBreakdown +
                ", cacheKey='" + cacheKey + '\'' +
                ", cacheLocation='" + cacheLocation + '\'' +
                '}';
    }
}
