package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class BedTypes {
    /**
     * Attributes
     */
    private Integer size;

    private BedType[] bedType;

    public BedTypes() {
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    public BedType[] getBedType() {
        return bedType;
    }

    @XmlElement(name = "BedType")
    public void setBedType(BedType[] bedType) {
        this.bedType = bedType;
    }

    @Override
    public String toString() {
        return "BedTypes{" +
                "bedType=" + Arrays.toString(bedType) +
                ", size=" + size +
                '}';
    }
}
