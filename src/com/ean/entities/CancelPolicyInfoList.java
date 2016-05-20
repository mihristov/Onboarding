package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class CancelPolicyInfoList {
    private CancelPolicyInfo[] cancelPolicyInfo;

    public CancelPolicyInfoList() {
    }

    public CancelPolicyInfo[] getCancelPolicyInfo() {
        return cancelPolicyInfo;
    }

    @XmlElement(name = "CancelPolicyInfo")
    public void setCancelPolicyInfo(CancelPolicyInfo[] cancelPolicyInfo) {
        this.cancelPolicyInfo = cancelPolicyInfo;
    }

    @Override
    public String toString() {
        return "CancelPolicyInfoList{" +
                "cancelPolicyInfo=" + Arrays.toString(cancelPolicyInfo) +
                '}';
    }
}
