package com.ean.roomavail;

import com.ean.common.CommonResponse;
import com.ean.entities.HotelRoomResponse;

import javax.xml.bind.annotation.XmlAttribute;
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
        "hotelName",
        "hotelAddress",
        "hotelCity",
        "hotelStateProvince",
        "hotelCountry",
        "numberOfRoomsRequested",
        "checkInInstructions",
        "hotelRoomResponse"
})
@XmlRootElement(name = "HotelRoomAvailabilityResponse")
public class HotelRoomAvailabilityResponse extends CommonResponse {
    /**
     * Attributes
     */
    private Integer size;

    private Long hotelId;
    private String arrivalDate;
    private String departureDate;
    private String hotelName;
    private String hotelAddress;
    private String hotelCity;
    private String hotelStateProvince;
    private String hotelCountry;
    private Integer numberOfRoomsRequested;
    private String checkInInstructions;
    private HotelRoomResponse[] hotelRoomResponse;

    public HotelRoomAvailabilityResponse() {
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    @XmlElement
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getCheckInInstructions() {
        return checkInInstructions;
    }

    @XmlElement
    public void setCheckInInstructions(String checkInInstructions) {
        this.checkInInstructions = checkInInstructions;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    @XmlElement
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    @XmlElement
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    @XmlElement
    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelCountry() {
        return hotelCountry;
    }

    @XmlElement
    public void setHotelCountry(String hotelCountry) {
        this.hotelCountry = hotelCountry;
    }

    public Long getHotelId() {
        return hotelId;
    }

    @XmlElement
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    @XmlElement
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public HotelRoomResponse[] getHotelRoomResponse() {
        return hotelRoomResponse;
    }

    @XmlElement(name = "HotelRoomResponse")
    public void setHotelRoomResponse(HotelRoomResponse[] hotelRoomResponse) {
        this.hotelRoomResponse = hotelRoomResponse;
    }

    public String getHotelStateProvince() {
        return hotelStateProvince;
    }

    @XmlElement
    public void setHotelStateProvince(String hotelStateProvince) {
        this.hotelStateProvince = hotelStateProvince;
    }

    public Integer getNumberOfRoomsRequested() {
        return numberOfRoomsRequested;
    }

    @XmlElement
    public void setNumberOfRoomsRequested(Integer numberOfRoomsRequested) {
        this.numberOfRoomsRequested = numberOfRoomsRequested;
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotel Room Availability Response: \nRooms found: " + size + "\n\n");
        for (int i = 0; i < hotelRoomResponse.length; i++) {
            sb.append(i + 1 + ") " + hotelRoomResponse[i].toString() + "\n");
        }
        return sb.toString();
    }
}
