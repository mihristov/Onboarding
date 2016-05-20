package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class Surcharges {
    /**
     * Attributes
     */
    private Integer size;

    private Surcharge[] surcharge;

    public Surcharges() {
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    public Surcharge[] getSurcharge() {
        return surcharge;
    }

    @XmlElement(name = "Surcharge")
    public void setSurcharge(Surcharge[] surcharge) {
        this.surcharge = surcharge;
    }

    @Override
    public String toString() {
        return "Surcharges{" +
                "size=" + size +
                ", surcharge=" + Arrays.toString(surcharge) +
                '}';
    }
}
