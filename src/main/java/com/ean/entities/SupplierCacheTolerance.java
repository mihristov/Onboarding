package com.ean.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlEnum
public enum SupplierCacheTolerance {
    NOT_SUPPORTED,
    MIN,
    MIN_ENHANCED,
    MED,
    MED_ENHANCED,
    MAX,
    MAX_ENHANCED;
}
