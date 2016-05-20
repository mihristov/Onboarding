package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class ValueAdd {
    /**
     * Attributes
     */
    private Integer id;

    private String description;

    public ValueAdd() {
    }

    public String getDescription() {
        return description;
    }

    @XmlElement
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    @XmlAttribute
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return description;
    }
}
