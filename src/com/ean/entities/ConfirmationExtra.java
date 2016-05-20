package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class ConfirmationExtra {
    private String name;
    private String value;

    public ConfirmationExtra() {
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    @XmlElement
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConfirmationExtra{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
