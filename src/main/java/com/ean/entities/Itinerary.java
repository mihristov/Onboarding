package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Milen on 5/17/2016.
 */
@XmlType(propOrder = {
        "itineraryId",
        "affiliateId",
        "creationDate",
        "creationTime",
        "itineraryStartDate",
        "itineraryEndDate",
        "affiliateCustomerId",
        "customer",
        "hotelConfirmation"
})
public class Itinerary {
    private Long itineraryId;
    private Long affiliateId;
    private String creationDate;
    private String creationTime;
    private String itineraryStartDate;
    private String itineraryEndDate;
    private String affiliateCustomerId;
    private Customer customer;
    private HotelConfirmation hotelConfirmation;

    public Itinerary() {
    }

    public String getAffiliateCustomerId() {
        return affiliateCustomerId;
    }

    @XmlElement
    public void setAffiliateCustomerId(String affiliateCustomerId) {
        this.affiliateCustomerId = affiliateCustomerId;
    }

    public Long getAffiliateId() {
        return affiliateId;
    }

    @XmlElement
    public void setAffiliateId(Long affiliateId) {
        this.affiliateId = affiliateId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    @XmlElement
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    @XmlElement(name = "Customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public HotelConfirmation getHotelConfirmation() {
        return hotelConfirmation;
    }

    @XmlElement(name = "HotelConfirmation")
    public void setHotelConfirmation(HotelConfirmation hotelConfirmation) {
        this.hotelConfirmation = hotelConfirmation;
    }

    public String getItineraryEndDate() {
        return itineraryEndDate;
    }

    @XmlElement
    public void setItineraryEndDate(String itineraryEndDate) {
        this.itineraryEndDate = itineraryEndDate;
    }

    public Long getItineraryId() {
        return itineraryId;
    }

    @XmlElement
    public void setItineraryId(Long itineraryId) {
        this.itineraryId = itineraryId;
    }

    public String getItineraryStartDate() {
        return itineraryStartDate;
    }

    @XmlElement
    public void setItineraryStartDate(String itineraryStartDate) {
        this.itineraryStartDate = itineraryStartDate;
    }

    public String getCreationTime() {
        return creationTime;
    }

    @XmlElement
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Itinerary:\nCustomer:\n" + customer + hotelConfirmation + "\n";
    }
}
