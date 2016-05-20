package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class RoomImage {
    private String roomTypeCode;
    private String url;

    public RoomImage() {
    }

    public String getRoomTypeCode() {
        return roomTypeCode;
    }

    @XmlElement
    public void setRoomTypeCode(String roomTypeCode) {
        this.roomTypeCode = roomTypeCode;
    }

    public String getUrl() {
        return url;
    }

    @XmlElement
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "RoomImage{" +
                "roomTypeCode='" + roomTypeCode + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
