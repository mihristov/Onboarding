package com.ean.main;

import com.ean.roomavail.HotelRoomAvailabilityRequest;
import com.ean.roomavail.HotelRoomAvailabilityResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created by Milen on 5/17/2016.
 */
public class HotelAvailClientResponse {
    public static HotelRoomAvailabilityResponse getHotelAvailResponse(HotelRoomAvailabilityRequest request, String customerSessionId) {
        final Client client = ClientBuilder.newClient();
        WebTarget resource = client.target("http://apiv3.staging.ean/ean-services/rs/hotel/v3/avail?");

        resource = resource.queryParam("customerSessionId", customerSessionId);
        resource = resource.queryParam("cid", "401037");
        resource = resource.queryParam("apiKey", "cbrzfta369qwyrm9t5b8y8kf");
        resource = resource.queryParam("locale", "en_US");
        resource = resource.queryParam("currencyCode", "USD");
        resource = resource.queryParam("minorRev", "99");

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(HotelRoomAvailabilityRequest.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            StringWriter sw = new StringWriter();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(request, sw);

            resource = resource.queryParam("xml", sw.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        Invocation.Builder builder = resource.request();
        Response response = resource.request(MediaType.APPLICATION_XML_TYPE).get();

        HotelRoomAvailabilityResponse availResponse = response.readEntity(HotelRoomAvailabilityResponse.class);
        return availResponse;
    }
}
