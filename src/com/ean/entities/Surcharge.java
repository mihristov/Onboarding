package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(name = "Surcharge")
public class Surcharge {
    /**
     * Attributes
     */
    private Float amount;
    private String type;

    public Surcharge() {
    }

    public Float getAmount() {
        return amount;
    }

    @XmlAttribute
    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    @XmlAttribute
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Surcharge{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
