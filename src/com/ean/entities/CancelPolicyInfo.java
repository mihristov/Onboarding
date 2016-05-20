package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class CancelPolicyInfo {
    private Integer versionId;
    private String cancelTime;
    private String startWindowHours;
    private String nightCount;
    private String percent;
    private String amount;
    private String currencyCode;
    private String timeZoneDescription;

    public CancelPolicyInfo() {
    }

    public String getAmount() {
        return amount;
    }

    @XmlElement
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCancelTime() {
        return cancelTime;
    }

    @XmlElement
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    @XmlElement
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getNightCount() {
        return nightCount;
    }

    @XmlElement
    public void setNightCount(String nightCount) {
        this.nightCount = nightCount;
    }

    public String getPercent() {
        return percent;
    }

    @XmlElement
    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getStartWindowHours() {
        return startWindowHours;
    }

    @XmlElement
    public void setStartWindowHours(String startWindowHours) {
        this.startWindowHours = startWindowHours;
    }

    public String getTimeZoneDescription() {
        return timeZoneDescription;
    }

    @XmlElement
    public void setTimeZoneDescription(String timeZoneDescription) {
        this.timeZoneDescription = timeZoneDescription;
    }

    public Integer getVersionId() {
        return versionId;
    }

    @XmlElement
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        return "CancelPolicyInfo{" +
                "amount='" + amount + '\'' +
                ", versionId=" + versionId +
                ", cancelTime='" + cancelTime + '\'' +
                ", startWindowHours='" + startWindowHours + '\'' +
                ", nightCount='" + nightCount + '\'' +
                ", percent='" + percent + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", timeZoneDescription='" + timeZoneDescription + '\'' +
                '}';
    }
}
