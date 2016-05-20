package com.ean.entities;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlEnum
public enum Sort {

    NO_SORT,
    DEFAULT,
    CITY_VALUE,
    OVERALL_VALUE,
    PRICE,
    QUALITY,
    ALPHA,
    SPECIAL_VALUE,
    PROXIMITY,
    POSTAL_CODE,
    PROMO,
    PRICE_AVERAGE,
    TRIP_ADVISOR,
    PRICE_REVERSE,
    QUALITY_REVERSE,
    CONFIDENCE,
    MARKETING_CONFIDENCE;

}
