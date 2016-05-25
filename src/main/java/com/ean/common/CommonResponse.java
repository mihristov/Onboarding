package com.ean.common;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/16/2016.
 */
public class CommonResponse {
    private String customerSessionId;
    private Object EanWSError;

    public CommonResponse() {
    }

    public String getCustomerSessionId() {
        return customerSessionId;
    }

    @XmlElement
    public void setCustomerSessionId(String customerSessionId) {
        this.customerSessionId = customerSessionId;
    }

    public Object getEanWSError() {
        return EanWSError;
    }

    @XmlElement
    public void setEanWSError(Object eanWSError) {
        EanWSError = eanWSError;
    }

    @Override
    public String toString() {
        return "CommonResponse{" +
                "customerSessionId='" + customerSessionId + '\'' +
                ", EanWSError=" + EanWSError +
                '}';
    }
}
