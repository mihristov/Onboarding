package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class PropertyAmenity {
    /**
     * Attributes
     */
    private Integer amenityId;

    private String amenity;

    public PropertyAmenity() {
    }

    public String getAmenity() {
        return amenity;
    }

    @XmlElement
    public void setAmenity(String amenity) {
        this.amenity = amenity;
    }

    public Integer getAmenityId() {
        return amenityId;
    }

    @XmlAttribute
    public void setAmenityId(Integer amenityId) {
        this.amenityId = amenityId;
    }

    @Override
    public String toString() {
        return "PropertyAmenity{" +
                "amenity='" + amenity + '\'' +
                ", amenityId=" + amenityId +
                '}';
    }
}
