package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class HotelImages {
    /**
     * Attributes
     */
    private Integer size;

    private HotelImage[] hotelImage;

    public HotelImages() {
    }

    public HotelImage[] getHotelImage() {
        return hotelImage;
    }

    @XmlElement(name = "HotelImage")
    public void setHotelImage(HotelImage[] hotelImage) {
        this.hotelImage = hotelImage;
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
        return "HotelImages{" +
                "hotelImage=" + Arrays.toString(hotelImage) +
                ", size=" + size +
                '}';
    }
}
