package com.ean.hotellist;

import com.ean.common.CommonResponse;
import com.ean.entities.CachedSupplierResponse;
import com.ean.entities.ConvertedRateInfo;
import com.ean.entities.HotelList;
import com.ean.entities.RoomGroup;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/16/2016.
 */
@XmlType(propOrder = {
        "numberOfRoomsRequested",
        "moreResultsAvailable",
        "cacheKey",
        "cacheLocation",
        "cachedSupplierResponse",
        "hotelList",
        "convertedRateInfo",
        "roomGroup"

})
@XmlRootElement(name = "HotelListResponse")
public class HotelListResponse extends CommonResponse {
    private Boolean moreResultsAvailable;
    private Integer numberOfRoomsRequested;
    private String cacheKey;
    private String cacheLocation;
    private CachedSupplierResponse cachedSupplierResponse;
    private HotelList hotelList;
    private ConvertedRateInfo convertedRateInfo;
    private RoomGroup roomGroup;

    public HotelListResponse() {
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

    public ConvertedRateInfo getConvertedRateInfo() {
        return convertedRateInfo;
    }

    @XmlElement(name = "ConvertedRateInfo")
    public void setConvertedRateInfo(ConvertedRateInfo convertedRateInfo) {
        this.convertedRateInfo = convertedRateInfo;
    }

    public HotelList getHotelList() {
        return hotelList;
    }

    @XmlElement(name = "HotelList")
    public void setHotelList(HotelList hotelList) {
        this.hotelList = hotelList;
    }

    public Boolean getMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    @XmlElement
    public void setMoreResultsAvailable(Boolean moreResultsAvailable) {
        this.moreResultsAvailable = moreResultsAvailable;
    }

    public Integer getNumberOfRoomsRequested() {
        return numberOfRoomsRequested;
    }

    @XmlElement
    public void setNumberOfRoomsRequested(Integer numberOfRoomsRequested) {
        this.numberOfRoomsRequested = numberOfRoomsRequested;
    }

    public RoomGroup getRoomGroup() {
        return roomGroup;
    }

    @XmlElement(name = "RoomGroup")
    public void setRoomGroup(RoomGroup roomGroup) {
        this.roomGroup = roomGroup;
    }

    public CachedSupplierResponse getCachedSupplierResponse() {
        return cachedSupplierResponse;
    }

    public void setCachedSupplierResponse(CachedSupplierResponse cachedSupplierResponse) {
        this.cachedSupplierResponse = cachedSupplierResponse;
    }

    @Override
    public String toString() {
        return "Hotel List Response:\n\n" + hotelList;

    }
}
