package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class GenericRefund {
    private Integer refundAmount;
    private String currencyCode;

    public GenericRefund() {
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    @XmlElement
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    @XmlElement
    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    @Override
    public String toString() {
        return "GenericRefund{" +
                "currencyCode='" + currencyCode + '\'' +
                ", refundAmount=" + refundAmount +
                '}';
    }
}
