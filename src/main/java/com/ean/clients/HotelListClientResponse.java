package com.ean.clients;

import com.ean.hotellist.HotelListRequest;
import com.ean.hotellist.HotelListResponse;

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
 * Created by Milen on 5/19/2016.
 */
public class HotelListClientResponse {
    public static HotelListResponse getHotelListResponse(HotelListRequest request) {
        final Client client = ClientBuilder.newClient();
        WebTarget resource = client.target("http://apiv3.staging.ean/ean-services/rs/hotel/v3/list?");

        resource = resource.queryParam("cid", "401037");
        resource = resource.queryParam("apiKey", "cbrzfta369qwyrm9t5b8y8kf");
        resource = resource.queryParam("locale", "en_US");
        resource = resource.queryParam("currencyCode", "USD");
        resource = resource.queryParam("minorRev", "99");

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(HotelListRequest.class);
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

        HotelListResponse listResponse = response.readEntity(HotelListResponse.class);
        return listResponse;
    }
}
