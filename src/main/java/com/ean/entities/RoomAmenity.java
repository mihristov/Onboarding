package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class RoomAmenity {
    /**
     * Attributes
     */
    private String amenityId;

    private String amenity;

    public RoomAmenity() {
    }

    public String getAmenity() {
        return amenity;
    }

    @XmlElement
    public void setAmenity(String amenity) {
        this.amenity = amenity;
    }

    public String getAmenityId() {
        return amenityId;
    }

    @XmlAttribute
    public void setAmenityId(String amenityId) {
        this.amenityId = amenityId;
    }

    @Override
    public String toString() {
        return "RoomAmenity{" +
                "amenity='" + amenity + '\'' +
                ", amenityId='" + amenityId + '\'' +
                '}';
    }
}
