package com.ean.entities;

import javax.xml.bind.annotation.XmlEnum;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlEnum
public enum SmokingPreference {
    S("Smoking"),
    NS("Non-smoking"),
    E("Smoking & Non-smoking");

    private String value;

    SmokingPreference(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
