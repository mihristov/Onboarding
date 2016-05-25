package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by Milen on 5/17/2016.
 */
public class HotelFeeBreakdown {
    /**
     * Attributes
     */
    private String unit;
    private String frequency;

    public HotelFeeBreakdown() {
    }

    public String getUnit() {
        return unit;
    }

    @XmlAttribute
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getFrequency() {
        return frequency;
    }

    @XmlAttribute
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "HotelFeeBreakdown{" +
                "unit='" + unit + '\'' +
                ", frequency='" + frequency + '\'' +
                '}';
    }
}
