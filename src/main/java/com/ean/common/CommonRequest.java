package com.ean.common;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/16/2016.
 */
public class CommonRequest {
    private String apiExperience;
    private Long cid;
    private String apiKey;
    private Integer minorRev;
    private String locale;
    private String currencyCode;
    private String customerSessionId;
    private String customerIpAddress;
    private String customerUserAgent;
    private String sig;

    public CommonRequest() {
    }

    public String getApiExperience() {
        return apiExperience;
    }

    @XmlElement
    public void setApiExperience(String apiExperience) {
        this.apiExperience = apiExperience;
    }

    public String getApiKey() {
        return apiKey;
    }

    @XmlElement
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public Long getCid() {
        return cid;
    }

    @XmlElement
    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    @XmlElement
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCustomerIpAddress() {
        return customerIpAddress;
    }

    @XmlElement
    public void setCustomerIpAddress(String customerIpAddress) {
        this.customerIpAddress = customerIpAddress;
    }

    public String getCustomerSessionId() {
        return customerSessionId;
    }

    @XmlElement
    public void setCustomerSessionId(String customerSessionId) {
        this.customerSessionId = customerSessionId;
    }

    public String getCustomerUserAgent() {
        return customerUserAgent;
    }

    @XmlElement
    public void setCustomerUserAgent(String customerUserAgent) {
        this.customerUserAgent = customerUserAgent;
    }

    public String getLocale() {
        return locale;
    }

    @XmlElement
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Integer getMinorRev() {
        return minorRev;
    }

    @XmlElement
    public void setMinorRev(Integer minorRev) {
        this.minorRev = minorRev;
    }

    public String getSig() {
        return sig;
    }

    @XmlElement
    public void setSig(String sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "CommonRequest{" +
                "apiExperience='" + apiExperience + '\'' +
                ", cid=" + cid +
                ", apiKey='" + apiKey + '\'' +
                ", minorRev=" + minorRev +
                ", locale='" + locale + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", customerSessionId='" + customerSessionId + '\'' +
                ", customerIpAddress='" + customerIpAddress + '\'' +
                ", customerUserAgent='" + customerUserAgent + '\'' +
                ", sig='" + sig + '\'' +
                '}';
    }
}
