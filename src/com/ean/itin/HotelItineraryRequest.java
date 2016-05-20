package com.ean.itin;

import com.ean.common.CommonRequest;
import com.ean.entities.ItineraryQuery;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/16/2016.
 */
@XmlRootElement(name = "HotelItineraryRequest")
public class HotelItineraryRequest extends CommonRequest {
    private Long itineraryId;
    private String affiliateConfirmationId;
    private String email;
    private String lastName;
    private String creditCardNumber;
    private String[] confirmationExtras; // not sure
    private ItineraryQuery itineraryQuery;

    public HotelItineraryRequest() {
    }

    public String getAffiliateConfirmationId() {
        return affiliateConfirmationId;
    }

    @XmlElement
    public void setAffiliateConfirmationId(String affiliateConfirmationId) {
        this.affiliateConfirmationId = affiliateConfirmationId;
    }

    public String[] getConfirmationExtras() {
        return confirmationExtras;
    }

    @XmlElement
    public void setConfirmationExtras(String[] confirmationExtras) {
        this.confirmationExtras = confirmationExtras;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @XmlElement
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getItineraryId() {
        return itineraryId;
    }

    @XmlElement
    public void setItineraryId(Long itineraryId) {
        this.itineraryId = itineraryId;
    }

    public ItineraryQuery getItineraryQuery() {
        return itineraryQuery;
    }

    @XmlElement(name = "ItineraryQuery")
    public void setItineraryQuery(ItineraryQuery itineraryQuery) {
        this.itineraryQuery = itineraryQuery;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "HotelItineraryRequest{" +
                "affiliateConfirmationId='" + affiliateConfirmationId + '\'' +
                ", itineraryId=" + itineraryId +
                ", email='" + email + '\'' +
                ", lastName='" + lastName + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                ", confirmationExtras=" + Arrays.toString(confirmationExtras) +
                ", itineraryQuery=" + itineraryQuery +
                '}';
    }
}
