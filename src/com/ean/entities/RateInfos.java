package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class RateInfos {
    /**
     * Attributes
     */
    private Integer size;

    RateInfo[] rateInfo;

    public RateInfos() {
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    public RateInfo[] getRateInfo() {
        return rateInfo;
    }

    @XmlElement(name = "RateInfo")
    public void setRateInfo(RateInfo[] rateInfo) {
        this.rateInfo = rateInfo;
    }

    @Override
    public String toString() {
        return "RateInfos{" +
                "rateInfo=" + Arrays.toString(rateInfo) +
                '}';
    }
}
