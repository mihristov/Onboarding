package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Milen on 5/17/2016.
 */
public class ItineraryQuery {
    private String creationDateStart;
    private String creationDateEnd;
    private String departureDateStart;
    private String departureDateEnd;
    private String includeChildAffiliates;

    public ItineraryQuery() {
    }

    public String getCreationDateEnd() {
        return creationDateEnd;
    }

    @XmlElement
    public void setCreationDateEnd(String creationDateEnd) {
        this.creationDateEnd = creationDateEnd;
    }

    public String getCreationDateStart() {
        return creationDateStart;
    }

    @XmlElement
    public void setCreationDateStart(String creationDateStart) {
        this.creationDateStart = creationDateStart;
    }

    public String getDepartureDateEnd() {
        return departureDateEnd;
    }

    @XmlElement
    public void setDepartureDateEnd(String departureDateEnd) {
        this.departureDateEnd = departureDateEnd;
    }

    public String getDepartureDateStart() {
        return departureDateStart;
    }

    @XmlElement
    public void setDepartureDateStart(String departureDateStart) {
        this.departureDateStart = departureDateStart;
    }

    public String getIncludeChildAffiliates() {
        return includeChildAffiliates;
    }

    @XmlElement
    public void setIncludeChildAffiliates(String includeChildAffiliates) {
        this.includeChildAffiliates = includeChildAffiliates;
    }

    @Override
    public String toString() {
        return "ItineraryQuery{" +
                "creationDateEnd='" + creationDateEnd + '\'' +
                ", creationDateStart='" + creationDateStart + '\'' +
                ", departureDateStart='" + departureDateStart + '\'' +
                ", departureDateEnd='" + departureDateEnd + '\'' +
                ", includeChildAffiliates='" + includeChildAffiliates + '\'' +
                '}';
    }
}
