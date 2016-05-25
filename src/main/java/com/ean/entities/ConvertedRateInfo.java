package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by Milen on 5/17/2016.
 */
public class ConvertedRateInfo {
    /**
     * Attributes
     */
    private String total;
    private String surchargeTotal;
    private String nightlyRateTotal;
    private String maxNightlyRate;
    private String currencyCode;
    private String commissionableUsdTotal;
    private String averageRate;
    private String averageBaseRate;

    public ConvertedRateInfo() {
    }

    public String getTotal() {
        return total;
    }

    @XmlAttribute
    public void setTotal(String total) {
        this.total = total;
    }

    public String getSurchargeTotal() {
        return surchargeTotal;
    }

    @XmlAttribute
    public void setSurchargeTotal(String surchargeTotal) {
        this.surchargeTotal = surchargeTotal;
    }

    public String getNightlyRateTotal() {
        return nightlyRateTotal;
    }

    @XmlAttribute
    public void setNightlyRateTotal(String nightlyRateTotal) {
        this.nightlyRateTotal = nightlyRateTotal;
    }

    public String getMaxNightlyRate() {
        return maxNightlyRate;
    }

    @XmlAttribute
    public void setMaxNightlyRate(String maxNightlyRate) {
        this.maxNightlyRate = maxNightlyRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    @XmlAttribute
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCommissionableUsdTotal() {
        return commissionableUsdTotal;
    }

    @XmlAttribute
    public void setCommissionableUsdTotal(String commissionableUsdTotal) {
        this.commissionableUsdTotal = commissionableUsdTotal;
    }

    public String getAverageRate() {
        return averageRate;
    }

    @XmlAttribute
    public void setAverageRate(String averageRate) {
        this.averageRate = averageRate;
    }

    public String getAverageBaseRate() {
        return averageBaseRate;
    }

    @XmlAttribute
    public void setAverageBaseRate(String averageBaseRate) {
        this.averageBaseRate = averageBaseRate;
    }

    @Override
    public String toString() {
        return "ConvertedRateInfo{" +
                "total='" + total + '\'' +
                ", surchargeTotal='" + surchargeTotal + '\'' +
                ", nightlyRateTotal='" + nightlyRateTotal + '\'' +
                ", maxNightlyRate='" + maxNightlyRate + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", commissionableUsdTotal='" + commissionableUsdTotal + '\'' +
                ", averageRate='" + averageRate + '\'' +
                ", averageBaseRate='" + averageBaseRate + '\'' +
                '}';
    }
}
