package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class HotelFee {
    /**
     * Attributes
     */
    private String description;
    private String amount;

    private HotelFeeBreakdown hotelFeeBreakdown;

    public HotelFee() {
    }

    public String getDescription() {
        return description;
    }

    @XmlAttribute
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    @XmlAttribute
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public HotelFeeBreakdown getHotelFeeBreakdown() {
        return hotelFeeBreakdown;
    }

    @XmlElement
    public void setHotelFeeBreakdown(HotelFeeBreakdown hotelFeeBreakdown) {
        this.hotelFeeBreakdown = hotelFeeBreakdown;
    }

    @Override
    public String toString() {
        return "HotelFee{" +
                "description='" + description + '\'' +
                ", amount='" + amount + '\'' +
                ", hotelFeeBreakdown=" + hotelFeeBreakdown +
                '}';
    }
}
