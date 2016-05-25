package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(name = "NightlyRate")
public class NightlyRate {
    /**
     * Attributes
     */
    private Boolean promo;
    private Double rate;
    private Double baseRate;

    public NightlyRate() {
    }

    public Boolean getPromo() {
        return promo;
    }

    @XmlAttribute
    public void setPromo(Boolean promo) {
        this.promo = promo;
    }

    public Double getRate() {
        return rate;
    }

    @XmlAttribute
    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getBaseRate() {
        return baseRate;
    }

    @XmlAttribute
    public void setBaseRate(Double baseRate) {
        this.baseRate = baseRate;
    }

    @Override
    public String toString() {
        return "NightlyRate{" +
                "promo=" + promo +
                ", rate='" + rate + '\'' +
                ", baseRate='" + baseRate + '\'' +
                '}';
    }
}
