package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class BedType {
    /**
     * Attributes
     */
    private String id;

    private String description;

    public BedType() {
    }

    public String getId() {
        return id;
    }

    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "BedType{" +
                "description='" + description + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
