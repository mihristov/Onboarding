package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class RoomRateDetailsList {
    RoomRateDetails[] roomRateDetails;

    public RoomRateDetailsList() {
    }

    public RoomRateDetails[] getRoomRateDetails() {
        return roomRateDetails;
    }

    @XmlElement(name = "RoomRateDetails")
    public void setRoomRateDetails(RoomRateDetails[] roomRateDetails) {
        this.roomRateDetails = roomRateDetails;
    }

    @Override
    public String toString() {
        return "RoomRateDetailsList{" +
                "roomRateDetails=" + Arrays.toString(roomRateDetails) +
                '}';
    }
}
