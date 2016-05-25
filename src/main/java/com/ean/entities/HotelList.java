package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class HotelList {
    /**
     * Attributes
     */
    private Integer size;
    private Integer activePropertyCount;

    private HotelSummary[] hotelSummary;

    public HotelList() {
    }

    public Integer getActivePropertyCount() {
        return activePropertyCount;
    }

    @XmlAttribute
    public void setActivePropertyCount(Integer activePropertyCount) {
        this.activePropertyCount = activePropertyCount;
    }

    public HotelSummary[] getHotelSummary() {
        return hotelSummary;
    }

    @XmlElement(name = "HotelSummary")
    public void setHotelSummary(HotelSummary[] hotelSummary) {
        this.hotelSummary = hotelSummary;
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Showing ");
        sb.append(size);
        sb.append(" hotels:\n");
        for (HotelSummary hotel : hotelSummary
                ) {
            sb.append(hotel.toString());

        }
        return sb.toString();

    }
}
