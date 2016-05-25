package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class NightlyRatesPerRoom {
    /**
     * Attributes
     */
    private Integer size;

    private NightlyRate[] nightlyRate;

    public NightlyRatesPerRoom() {
    }

    public Integer getSize() {
        return size;
    }

    @XmlAttribute
    public void setSize(Integer size) {
        this.size = size;
    }

    public NightlyRate[] getNightlyRate() {
        return nightlyRate;
    }

    @XmlElement(name = "NightlyRate")
    public void setNightlyRate(NightlyRate[] nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    @Override
    public String toString() {
        return "NightlyRatesPerRoom{" +
                "size=" + size +
                ", nightlyRate=" + Arrays.toString(nightlyRate) +
                '}';
    }
}
