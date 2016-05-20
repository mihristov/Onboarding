package com.ean.main;

import com.ean.res.HotelRoomReservationRequest;
import com.ean.res.HotelRoomReservationResponse;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created by Milen on 5/19/2016.
 */
public class HotelReservationClientResponse {
    public static HotelRoomReservationResponse getHotelAvailResponse(HotelRoomReservationRequest request, String customerSessionId) {
        final Client client = ClientBuilder.newClient();
        WebTarget resource = client.target("https://apiv3.staging.ean/ean-services/rs/hotel/v3/res");

        Form form = new Form();
        form.param("customerSessionId", customerSessionId);
        form.param("cid", "401037");
        form.param("apiKey", "cbrzfta369qwyrm9t5b8y8kf");
        form.param("locale", "en_US");
        form.param("currencyCode", "USD");
        form.param("minorRev", "99");

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(HotelRoomReservationRequest.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            StringWriter sw = new StringWriter();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(request, sw);
            form.param("xml", sw.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        Invocation.Builder builder = resource.request(MediaType.APPLICATION_XML_TYPE);
        Response response = builder.post(Entity.entity(form, "application/x-www-form-urlencoded"));

        HotelRoomReservationResponse reservResponse = response.readEntity(HotelRoomReservationResponse.class);
        return reservResponse;
    }
}
