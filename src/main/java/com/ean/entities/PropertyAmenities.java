package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class PropertyAmenities {
    /**
     * Attributes
     */
    private Integer size;

    private PropertyAmenity[] propertyAmenity;

    public PropertyAmenities() {
    }

    public PropertyAmenity[] getPropertyAmenity() {
        return propertyAmenity;
    }

    @XmlElement(name = "PropertyAmenity")
    public void setPropertyAmenity(PropertyAmenity[] propertyAmenity) {
        this.propertyAmenity = propertyAmenity;
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }
}
