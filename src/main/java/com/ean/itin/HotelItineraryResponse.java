package com.ean.itin;

import com.ean.common.CommonResponse;
import com.ean.entities.Itinerary;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Milen on 5/16/2016.
 */
@XmlRootElement(name = "HotelItineraryResponse")
public class HotelItineraryResponse extends CommonResponse {
    private Itinerary[] itinerary;

    public HotelItineraryResponse() {
    }

    public Itinerary[] getItinerary() {
        return itinerary;
    }

    @XmlElement(name = "Itinerary")
    public void setItinerary(Itinerary[] itinerary) {
        this.itinerary = itinerary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HotelItineraryResponse: \n\n");
        for (Itinerary itin : itinerary) {
            sb.append(itin.toString() + "\n####################");
        }
        return sb.toString();
    }
}
