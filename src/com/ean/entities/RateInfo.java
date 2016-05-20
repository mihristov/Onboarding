package com.ean.entities;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(propOrder = {
        "roomGroup",
        "chargeableRateInfo",
        "cancellationPolicy",
        "cancelPolicyInfoList",
        "nonRefundable",
        "online",
        "hotelFees",
        "rateType",
        "promoId",
        "promoDescription",
        "promoDetailText",
        "promoType",
        "currentAllotment",
        "guaranteeRequired",
        "depositRequired",
        "taxRate"
})
public class RateInfo {
    /**
     * Attributes
     */
    private Boolean priceBreakdown;
    private Boolean promo;
    private Boolean rateChange;

    private String promoId;
    private String promoDescription;
    private String promoDetailText;
    private Integer currentAllotment;
    private Boolean guaranteeRequired;
    private Boolean depositRequired;
    private String cancellationPolicy;
    private CancelPolicyInfoList cancelPolicyInfoList;
    private String rateType;
    private Boolean nonRefundable;
    private Boolean online;
    private String promoType;
    private String taxRate;
    private ChargeableRateInfo chargeableRateInfo;
    private HotelFees hotelFees;

    private RoomGroup roomGroup;

    public RateInfo() {
    }

    public Boolean getPriceBreakdown() {
        return priceBreakdown;
    }

    @XmlAttribute
    public void setPriceBreakdown(Boolean priceBreakdown) {
        this.priceBreakdown = priceBreakdown;
    }

    public Boolean getPromo() {
        return promo;
    }

    @XmlAttribute
    public void setPromo(Boolean promo) {
        this.promo = promo;
    }

    public Boolean getRateChange() {
        return rateChange;
    }

    @XmlAttribute
    public void setRateChange(Boolean rateChange) {
        this.rateChange = rateChange;
    }

    public String getPromoId() {
        return promoId;
    }

    @XmlElement
    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    @XmlElement
    public void setPromoDescription(String promoDescription) {
        this.promoDescription = promoDescription;
    }

    public String getPromoDetailText() {
        return promoDetailText;
    }

    @XmlElement
    public void setPromoDetailText(String promoDetailText) {
        this.promoDetailText = promoDetailText;
    }

    public Integer getCurrentAllotment() {
        return currentAllotment;
    }

    @XmlElement
    public void setCurrentAllotment(Integer currentAllotment) {
        this.currentAllotment = currentAllotment;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    @XmlElement
    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public CancelPolicyInfoList getCancelPolicyInfoList() {
        return cancelPolicyInfoList;
    }

    @XmlElement(name = "CancelPolicyInfoList")
    public void setCancelPolicyInfoList(CancelPolicyInfoList cancelPolicyInfoList) {
        this.cancelPolicyInfoList = cancelPolicyInfoList;
    }

    public String getRateType() {
        return rateType;
    }

    @XmlElement
    public void setRateType(String rateType) {
        this.rateType = rateType;
    }

    public Boolean getNonRefundable() {
        return nonRefundable;
    }

    @XmlElement
    public void setNonRefundable(Boolean nonRefundable) {
        this.nonRefundable = nonRefundable;
    }

    public String getPromoType() {
        return promoType;
    }

    @XmlElement
    public void setPromoType(String promoType) {
        this.promoType = promoType;
    }

    public ChargeableRateInfo getChargeableRateInfo() {
        return chargeableRateInfo;
    }

    @XmlElement(name = "ChargeableRateInfo")
    public void setChargeableRateInfo(ChargeableRateInfo chargeableRateInfo) {
        this.chargeableRateInfo = chargeableRateInfo;
    }

    public HotelFees getHotelFees() {
        return hotelFees;
    }

    @XmlElement(name = "HotelFees")
    public void setHotelFees(HotelFees hotelFees) {
        this.hotelFees = hotelFees;
    }

    public RoomGroup getRoomGroup() {
        return roomGroup;
    }

    @XmlElement(name = "RoomGroup")
    public void setRoomGroup(RoomGroup roomGroup) {
        this.roomGroup = roomGroup;
    }

    public Boolean getGuaranteeRequired() {
        return guaranteeRequired;
    }

    @XmlElement
    public void setGuaranteeRequired(Boolean guaranteeRequired) {
        this.guaranteeRequired = guaranteeRequired;
    }

    public Boolean getDepositRequired() {
        return depositRequired;
    }

    @XmlElement
    public void setDepositRequired(Boolean depositRequired) {
        this.depositRequired = depositRequired;
    }

    public String getTaxRate() {
        return taxRate;
    }

    @XmlElement
    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public Boolean getOnline() {
        return online;
    }

    @XmlElement
    public void setOnline(Boolean online) {
        this.online = online;
    }

    @Override
    public String toString() {
        return "RateInfo{" +
                "cancellationPolicy='" + cancellationPolicy + '\'' +
                ", priceBreakdown=" + priceBreakdown +
                ", promo=" + promo +
                ", rateChange=" + rateChange +
                ", promoId='" + promoId + '\'' +
                ", promoDescription='" + promoDescription + '\'' +
                ", promoDetailText='" + promoDetailText + '\'' +
                ", currentAllotment=" + currentAllotment +
                ", guaranteeRequired=" + guaranteeRequired +
                ", depositRequired=" + depositRequired +
                ", cancelPolicyInfoList=" + cancelPolicyInfoList +
                ", rateType='" + rateType + '\'' +
                ", nonRefundable=" + nonRefundable +
                ", online=" + online +
                ", promoType='" + promoType + '\'' +
                ", taxRate='" + taxRate + '\'' +
                ", chargeableRateInfo=" + chargeableRateInfo +
                ", hotelFees=" + hotelFees +
                ", roomGroup=" + roomGroup +
                '}';
    }
}
