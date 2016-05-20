package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class RoomImages {
    /**
     * Attributes
     */
    private Integer size;

    private RoomImage[] roomImage;

    public RoomImages() {
    }

    public RoomImage[] getRoomImage() {
        return roomImage;
    }

    @XmlElement(name = "RoomImage")
    public void setRoomImage(RoomImage[] roomImage) {
        this.roomImage = roomImage;
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
        return "RoomImages{" +
                "roomImage=" + Arrays.toString(roomImage) +
                ", size=" + size +
                '}';
    }
}
