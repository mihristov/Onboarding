package com.ean.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(name = "SearchRadiusUnit")
@XmlEnum
public enum SearchRadiusUnit {
    MI,
    KM;
}
