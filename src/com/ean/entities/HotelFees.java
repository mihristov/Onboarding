package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class HotelFees {
    /**
     * Attributes
     */
    private Integer size;

    private HotelFee[] hotelFee;

    public HotelFees() {
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    public HotelFee[] getHotelFee() {
        return hotelFee;
    }

    @XmlElement(name = "HotelFee")
    public void setHotelFee(HotelFee[] hotelFee) {
        this.hotelFee = hotelFee;
    }

    @Override
    public String toString() {
        return "HotelFees{" +
                "size=" + size +
                ", hotelFee=" + Arrays.toString(hotelFee) +
                '}';
    }
}
