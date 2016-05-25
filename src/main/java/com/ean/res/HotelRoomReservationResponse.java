package com.ean.res;

import com.ean.common.CommonResponse;
import com.ean.entities.ConvertedRateInfo;
import com.ean.entities.RateInfos;
import com.ean.entities.RoomGroup;
import com.ean.entities.ValueAdds;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;

/**
 * Created by Milen on 5/16/2016.
 */
@XmlType(propOrder = {
        "itineraryId",
        "confirmationNumbers",
        "processedWithConfirmation",
        "errorText",
        "hotelReplyText",
        "supplierType",
        "reservationStatusCode",
        "existingItinerary",
        "numberOfRoomsBooked",
        "roomGroup",
        "drivingDirections",
        "checkInInstructions",
        "arrivalDate",
        "departureDate",
        "hotelName",
        "hotelAddress",
        "hotelCity",
        "hotelStateProvinceCode",
        "hotelPostalCode",
        "hotelCountryCode",
        "roomDescription",
        "rateOccupancyPerRoom",
        "rateInfos",
        "valueAdds",
        "convertedRateInfo"
})
@XmlRootElement(name = "HotelRoomReservationResponse")
public class HotelRoomReservationResponse extends CommonResponse {
    private Long itineraryId;
    private String[] confirmationNumbers;
    private Boolean processedWithConfirmation;
    private String errorText;
    private String hotelReplyText;
    private String supplierType;
    private String reservationStatusCode;
    private Boolean existingItinerary;
    private Integer numberOfRoomsBooked;
    private String drivingDirections;
    private String checkInInstructions;
    private String arrivalDate;
    private String departureDate;
    private String hotelName;
    private String hotelAddress;
    private String hotelCity;
    private String hotelStateProvinceCode;
    private String hotelCountryCode;
    private String hotelPostalCode;
    private String roomDescription;
    private Integer rateOccupancyPerRoom;
    private RoomGroup roomGroup;
    private RateInfos rateInfos;
    private ValueAdds valueAdds;
    private ConvertedRateInfo convertedRateInfo;

    public HotelRoomReservationResponse() {
    }

    public Long getItineraryId() {
        return itineraryId;
    }

    @XmlElement
    public void setItineraryId(Long itineraryId) {
        this.itineraryId = itineraryId;
    }

    public String[] getConfirmationNumbers() {
        return confirmationNumbers;
    }

    @XmlElement
    public void setConfirmationNumbers(String[] confirmationNumbers) {
        this.confirmationNumbers = confirmationNumbers;
    }

    public Boolean getProcessedWithConfirmation() {
        return processedWithConfirmation;
    }

    @XmlElement
    public void setProcessedWithConfirmation(Boolean processedWithConfirmation) {
        this.processedWithConfirmation = processedWithConfirmation;
    }

    public String getErrorText() {
        return errorText;
    }

    @XmlElement
    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public String getHotelReplyText() {
        return hotelReplyText;
    }

    @XmlElement
    public void setHotelReplyText(String hotelReplyText) {
        this.hotelReplyText = hotelReplyText;
    }

    public String getSupplierType() {
        return supplierType;
    }

    @XmlElement
    public void setSupplierType(String supplierType) {
        this.supplierType = supplierType;
    }

    public String getReservationStatusCode() {
        return reservationStatusCode;
    }

    @XmlElement
    public void setReservationStatusCode(String reservationStatusCode) {
        this.reservationStatusCode = reservationStatusCode;
    }

    public Boolean getExistingItinerary() {
        return existingItinerary;
    }

    @XmlElement
    public void setExistingItinerary(Boolean existingItinerary) {
        this.existingItinerary = existingItinerary;
    }

    public Integer getNumberOfRoomsBooked() {
        return numberOfRoomsBooked;
    }

    @XmlElement
    public void setNumberOfRoomsBooked(Integer numberOfRoomsBooked) {
        this.numberOfRoomsBooked = numberOfRoomsBooked;
    }

    public String getDrivingDirections() {
        return drivingDirections;
    }

    @XmlElement
    public void setDrivingDirections(String drivingDirections) {
        this.drivingDirections = drivingDirections;
    }

    public String getCheckInInstructions() {
        return checkInInstructions;
    }

    @XmlElement
    public void setCheckInInstructions(String checkInInstructions) {
        this.checkInInstructions = checkInInstructions;
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

    public String getHotelName() {
        return hotelName;
    }

    @XmlElement
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
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

    public String getHotelStateProvinceCode() {
        return hotelStateProvinceCode;
    }

    @XmlElement
    public void setHotelStateProvinceCode(String hotelStateProvinceCode) {
        this.hotelStateProvinceCode = hotelStateProvinceCode;
    }

    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    @XmlElement
    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    public String getHotelPostalCode() {
        return hotelPostalCode;
    }

    @XmlElement
    public void setHotelPostalCode(String hotelPostalCode) {
        this.hotelPostalCode = hotelPostalCode;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    @XmlElement
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public Integer getRateOccupancyPerRoom() {
        return rateOccupancyPerRoom;
    }

    @XmlElement
    public void setRateOccupancyPerRoom(Integer rateOccupancyPerRoom) {
        this.rateOccupancyPerRoom = rateOccupancyPerRoom;
    }

    public RoomGroup getRoomGroup() {
        return roomGroup;
    }

    @XmlElement(name = "RoomGroup")
    public void setRoomGroup(RoomGroup roomGroup) {
        this.roomGroup = roomGroup;
    }

    public RateInfos getRateInfos() {
        return rateInfos;
    }

    @XmlElement(name = "RateInfos")
    public void setRateInfos(RateInfos rateInfos) {
        this.rateInfos = rateInfos;
    }

    public ValueAdds getValueAdds() {
        return valueAdds;
    }

    @XmlElement(name = "ValueAdds")
    public void setValueAdds(ValueAdds valueAdds) {
        this.valueAdds = valueAdds;
    }

    public ConvertedRateInfo getConvertedRateInfo() {
        return convertedRateInfo;
    }

    @XmlElement(name = "ConvertedRateInfo")
    public void setConvertedRateInfo(ConvertedRateInfo convertedRateInfo) {
        this.convertedRateInfo = convertedRateInfo;
    }

    @Override
    public String toString() {
        return "HotelRoomReservationResponse{" +
                "itineraryId=" + itineraryId +
                ", confirmationNumbers=" + Arrays.toString(confirmationNumbers) +
                ", processedWithConfirmation=" + processedWithConfirmation +
                ", errorText='" + errorText + '\'' +
                ", hotelReplyText='" + hotelReplyText + '\'' +
                ", supplierType='" + supplierType + '\'' +
                ", reservationStatusCode='" + reservationStatusCode + '\'' +
                ", existingItinerary=" + existingItinerary +
                ", numberOfRoomsBooked=" + numberOfRoomsBooked +
                ", drivingDirections='" + drivingDirections + '\'' +
                ", checkInInstructions='" + checkInInstructions + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", hotelName='" + hotelName + '\'' +
                ", hotelAddress='" + hotelAddress + '\'' +
                ", hotelCity='" + hotelCity + '\'' +
                ", hotelStateProvinceCode='" + hotelStateProvinceCode + '\'' +
                ", hotelCountryCode='" + hotelCountryCode + '\'' +
                ", hotelPostalCode='" + hotelPostalCode + '\'' +
                ", roomDescription='" + roomDescription + '\'' +
                ", rateOccupancyPerRoom=" + rateOccupancyPerRoom +
                ", roomGroup=" + roomGroup +
                ", rateInfos=" + rateInfos +
                ", valueAdds=" + valueAdds +
                ", convertedRateInfo=" + convertedRateInfo +
                '}';
    }
}
