package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class RoomAmenities {
    /**
     * Attributes
     */
    private Integer size;

    private RoomAmenity[] roomAmenity;

    public RoomAmenities() {
    }

    public RoomAmenity[] getRoomAmenity() {
        return roomAmenity;
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    @XmlElement(name = "RoomAmenity")
    public void setRoomAmenity(RoomAmenity[] roomAmenity) {
        this.roomAmenity = roomAmenity;
    }

    @Override
    public String toString() {
        return "RoomAmenities{" +
                "RoomAmenity=" + Arrays.toString(roomAmenity) +
                ", size=" + size +
                '}';
    }
}
