package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class ChargeableNightlyRates {
    private NightlyRate[] nightlyRate;
    private ConvertedNightlyRates convertedNightlyRates;

    public ChargeableNightlyRates() {
    }

    public NightlyRate[] getNightlyRate() {
        return nightlyRate;
    }

    @XmlElement(name = "NightlyRate")
    public void setNightlyRate(NightlyRate[] nightlyRate) {
        this.nightlyRate = nightlyRate;
    }

    public ConvertedNightlyRates getConvertedNightlyRates() {
        return convertedNightlyRates;
    }

    @XmlElement(name = "ConvertedNightlyRates")
    public void setConvertedNightlyRates(ConvertedNightlyRates convertedNightlyRates) {
        this.convertedNightlyRates = convertedNightlyRates;
    }

    @Override
    public String toString() {
        return "ChargeableNightlyRates{" +
                "nightlyRate=" + Arrays.toString(nightlyRate) +
                ", convertedNightlyRates=" + convertedNightlyRates +
                '}';
    }
}
