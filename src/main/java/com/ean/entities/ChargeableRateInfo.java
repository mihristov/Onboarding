package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class ChargeableRateInfo {
    /**
     * Attributes
     */
    private Double total;
    private Double surchargeTotal;
    private Double nightlyRateTotal;
    private Double maxNightlyRate;
    private String currencyCode;
    private Double commissionableUsdTotal;
    private Double grossProfitOffline;
    private Double grossProfitOnline;
    private Double averageRate;
    private Double averageBaseRate;

    private NightlyRatesPerRoom nightlyRatesPerRoom;
    private Surcharges surcharges;

    public ChargeableRateInfo() {
    }

    public Double getTotal() {
        return total;
    }

    @XmlAttribute
    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getSurchargeTotal() {
        return surchargeTotal;
    }

    @XmlAttribute
    public void setSurchargeTotal(Double surchargeTotal) {
        this.surchargeTotal = surchargeTotal;
    }

    public Double getNightlyRateTotal() {
        return nightlyRateTotal;
    }

    @XmlAttribute
    public void setNightlyRateTotal(Double nightlyRateTotal) {
        this.nightlyRateTotal = nightlyRateTotal;
    }

    public Double getMaxNightlyRate() {
        return maxNightlyRate;
    }

    @XmlAttribute
    public void setMaxNightlyRate(Double maxNightlyRate) {
        this.maxNightlyRate = maxNightlyRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    @XmlAttribute
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getCommissionableUsdTotal() {
        return commissionableUsdTotal;
    }

    @XmlAttribute
    public void setCommissionableUsdTotal(Double commissionableUsdTotal) {
        this.commissionableUsdTotal = commissionableUsdTotal;
    }

    public Double getAverageRate() {
        return averageRate;
    }

    @XmlAttribute
    public void setAverageRate(Double averageRate) {
        this.averageRate = averageRate;
    }

    public Double getAverageBaseRate() {
        return averageBaseRate;
    }

    @XmlAttribute
    public void setAverageBaseRate(Double averageBaseRate) {
        this.averageBaseRate = averageBaseRate;
    }

    public NightlyRatesPerRoom getNightlyRatesPerRoom() {
        return nightlyRatesPerRoom;
    }

    @XmlElement(name = "NightlyRatesPerRoom")
    public void setNightlyRatesPerRoom(NightlyRatesPerRoom nightlyRatesPerRoom) {
        this.nightlyRatesPerRoom = nightlyRatesPerRoom;
    }

    public Surcharges getSurcharges() {
        return surcharges;
    }

    @XmlElement(name = "Surcharges")
    public void setSurcharges(Surcharges surcharges) {
        this.surcharges = surcharges;
    }

    public Double getGrossProfitOffline() {
        return grossProfitOffline;
    }

    @XmlElement
    public void setGrossProfitOffline(Double grossProfitOffline) {
        this.grossProfitOffline = grossProfitOffline;
    }

    public Double getGrossProfitOnline() {
        return grossProfitOnline;
    }

    @XmlElement
    public void setGrossProfitOnline(Double grossProfitOnline) {
        this.grossProfitOnline = grossProfitOnline;
    }

    @Override
    public String toString() {
        return "ChargeableRateInfo{" +
                "total='" + total + '\'' +
                ", surchargeTotal='" + surchargeTotal + '\'' +
                ", nightlyRateTotal='" + nightlyRateTotal + '\'' +
                ", maxNightlyRate='" + maxNightlyRate + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", commissionableUsdTotal='" + commissionableUsdTotal + '\'' +
                ", averageRate='" + averageRate + '\'' +
                ", averageBaseRate='" + averageBaseRate + '\'' +
                ", nightlyRatesPerRoom=" + nightlyRatesPerRoom +
                ", surcharges=" + surcharges +
                '}';
    }
}
