package com.ean.main;

import com.ean.entities.AddressInfo;
import com.ean.entities.HotelRoomResponse;
import com.ean.entities.ReservationInfo;
import com.ean.entities.Room;
import com.ean.entities.RoomGroup;
import com.ean.entities.SmokingPreference;
import com.ean.hotellist.HotelListRequest;
import com.ean.hotellist.HotelListResponse;
import com.ean.itin.HotelItineraryRequest;
import com.ean.itin.HotelItineraryResponse;
import com.ean.res.HotelRoomReservationRequest;
import com.ean.res.HotelRoomReservationResponse;
import com.ean.roomavail.HotelRoomAvailabilityRequest;
import com.ean.roomavail.HotelRoomAvailabilityResponse;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Milen on 5/19/2016.
 */
public class MainDemo {
    private static final String DATE_FORMAT = "MM/dd/yyyy";
    private static final DateTimeFormatter dtf = DateTimeFormat.forPattern(DATE_FORMAT);
    private final static Scanner in = new Scanner(System.in);

    private static String destination = null;
    private static Integer rooms = 1;
    private static Integer adults = 2;
    private static Integer children = 0;
    private static DateTime checkIn = new DateTime();
    private static DateTime checkOut = new DateTime();

    public static void main(String[] args) {
        String input = null;

        askForInput();
        HotelListRequest hlRequest = populateHotelListRequest();
        HotelListResponse hlResponse = HotelListClientResponse.getHotelListResponse(hlRequest);
        System.out.println(hlResponse);

        System.out.println("Please enter hotel ID: ");
        while (hlResponse.getMoreResultsAvailable()) {
            System.out.println("Press M to show next page with hotels: ");
            input = in.nextLine();
            if (input.trim().toUpperCase().equals("M")) {
                hlRequest = new HotelListRequest();
                hlRequest.setCustomerSessionId(hlResponse.getCustomerSessionId());
                hlRequest.setSupplierType("E");
                hlRequest.setCacheKey(hlResponse.getCacheKey());
                hlRequest.setCacheLocation(hlResponse.getCacheLocation());
                hlResponse = HotelListClientResponse.getHotelListResponse(hlRequest);
                System.out.println(hlResponse);
            } else {
                break;
            }
        }
        HotelRoomAvailabilityRequest availRequest = populateHotelAvailRequest(input);
        HotelRoomAvailabilityResponse hraResponse = HotelAvailClientResponse
                .getHotelAvailResponse(availRequest, hlResponse.getCustomerSessionId());
        System.out.println(hraResponse);

        System.out.print("Select number of room to proceed: ");
        Integer roomInput = in.nextInt();
        HotelRoomResponse hotelRoom = hraResponse.getHotelRoomResponse()[roomInput - 1];

        System.out.println("Reservation in progress...");
        HotelRoomReservationRequest reservationRequest = populateHotelReservationRequest(availRequest, hotelRoom);
        HotelRoomReservationResponse reservationResponse = HotelReservationClientResponse
                .getHotelAvailResponse(reservationRequest, hlResponse.getCustomerSessionId());

        if (reservationResponse.getItineraryId() != null && reservationResponse.getItineraryId() != -1L && reservationResponse
                .getProcessedWithConfirmation() && reservationResponse.getReservationStatusCode().equals("CF")) {
            System.out.println("Reservation confirmed!\nItinerary ID: " + reservationResponse.getItineraryId() + "\nConfirmation Numbers "
                    + ":" + Arrays.toString(reservationResponse.getConfirmationNumbers()));
        } else {
            System.out.println("Reservation failed!");
        }

        System.out.println();
        System.out.println("Itinerary request pending...");
        HotelItineraryRequest itineraryRequest = new HotelItineraryRequest();
        itineraryRequest.setItineraryId(reservationResponse.getItineraryId());
        itineraryRequest.setEmail("test@travelnow.com");

        HotelItineraryResponse itinResponse = HotelItinClientResponse
                .getHotelListResponse(itineraryRequest, hlResponse.getCustomerSessionId());
        System.out.println(itinResponse.toString());

        in.close();
    }

    private static HotelRoomReservationRequest populateHotelReservationRequest(HotelRoomAvailabilityRequest availRequest,
            HotelRoomResponse hotelRoom) {
        HotelRoomReservationRequest preq = new HotelRoomReservationRequest();
        preq.setHotelId(availRequest.getHotelId());
        preq.setArrivalDate(dtf.print(checkIn));
        preq.setDepartureDate(dtf.print(checkOut));
        preq.setSupplierType(hotelRoom.getSupplierType());
        preq.setRateKey(hotelRoom.getRateInfos().getRateInfo()[0].getRoomGroup().getRoom()[0].getRateKey());
        preq.setRoomTypeCode(hotelRoom.getRoomTypeCode());
        preq.setRateCode(hotelRoom.getRateCode());
        preq.setChargeableRate(hotelRoom.getRateInfos().getRateInfo()[0].getChargeableRateInfo().getTotal());
        RoomGroup rg = new RoomGroup();
        Room room = new Room();
        rg.setRoom(new Room[] {room});
        room.setNumberOfAdults(adults);
        room.setFirstName("test");
        room.setLastName("tester");
        room.setBedTypeId(hotelRoom.getBedTypes()[0].getBedType()[0].getId());
        String[] smokingPreferences = hotelRoom.getSmokingPreferences().split("[,]");
        room.setSmokingPreference(SmokingPreference.valueOf(smokingPreferences[0]));

        preq.setRoomGroup(rg);
        ReservationInfo ri = new ReservationInfo();
        ri.setEmail("test@travelnow.com");
        ri.setFirstName("test");
        ri.setLastName("tester");
        ri.setHomePhone("2145370159");
        ri.setWorkPhone("2145370159");
        ri.setCreditCardType("CA");
        ri.setCreditCardNumber("5401999999999999");
        ri.setCreditCardIdentifier("123");
        ri.setCreditCardExpirationMonth("11");
        ri.setCreditCardExpirationYear("2018");

        preq.setReservationInfo(ri);

        AddressInfo ai = new AddressInfo();
        ai.setAddress1("travelnow");
        ai.setCity("Seattle");
        ai.setStateProvinceCode("WA");
        ai.setCountryCode("US");
        ai.setPostalCode("98004");
        preq.setAddressInfo(ai);
        return preq;
    }

    private static HotelRoomAvailabilityRequest populateHotelAvailRequest(String input) {
        HotelRoomAvailabilityRequest availRequest = new HotelRoomAvailabilityRequest();
        availRequest.setHotelId(Long.valueOf(input));
        availRequest.setArrivalDate(dtf.print(checkIn));
        availRequest.setDepartureDate(dtf.print(checkOut));
        availRequest.setRoomGroup(getRoomGroup());
        return availRequest;
    }

    private static void askForInput() {
        checkIn = checkIn.plusDays(2);
        checkOut = checkOut.plusDays(3);

        StringBuilder sb = new StringBuilder();
        sb.append("Hotel Search\n1) Destination, hotel, landmark or address\n2) Check in (default: ");
        sb.append(dtf.print(checkIn));
        sb.append(")\n3) Check out (default: ");
        sb.append(dtf.print(checkOut));
        sb.append(")\n4) Rooms");
        sb.append(" (default: 1 room 2 adults)\n\n");

        sb.append("Please enter your data...\n1) Destination, hotel, landmark or address: ");
        System.out.print(sb.toString());
        String input = in.nextLine();
        destination = input;
        System.out.print("2) Check in (leave blank for default): ");
        input = in.nextLine();
        if (!input.isEmpty()) {
            checkIn = dtf.parseDateTime(input);
        }
        System.out.print("3) Check out (leave blank for default): ");
        input = in.nextLine();
        if (!input.trim().isEmpty()) {
            checkOut = dtf.parseDateTime(input);
        }
        System.out.print("4) Rooms (leave blank for default / press M for more options): ");
        input = in.nextLine();
        if (input.trim().toUpperCase().equals("M")) {
            System.out.print("Please enter rooms: ");
            input = in.nextLine();
            rooms = Integer.valueOf(input);
            for (Integer i = 1; i <= rooms; i++) {
                System.out.print("Please enter adults for room " + i + ": ");
                input = in.nextLine();
                adults = Integer.valueOf(input);
                System.out.print("Please enter children for room " + i + ": ");
                input = in.nextLine();
                children = Integer.valueOf(input);
            }
        }
    }

    private static HotelListRequest populateHotelListRequest() {
        final HotelListRequest hotelListReq = new HotelListRequest();
        hotelListReq.setDestinationString(destination);
        hotelListReq.setArrivalDate(dtf.print(checkIn));
        hotelListReq.setDepartureDate(dtf.print(checkOut));
        hotelListReq.setRoomGroup(getRoomGroup());
        return hotelListReq;
    }

    private static RoomGroup getRoomGroup() {
        RoomGroup roomGroup = new RoomGroup();
        Room[] roomsGroup = new Room[rooms];
        for (int i = 0; i < rooms; i++) {
            roomsGroup[i] = new Room();
            roomsGroup[i].setNumberOfAdults(adults);
            roomsGroup[i].setNumberOfChildren(children);
        }
        roomGroup.setRoom(roomsGroup);
        return roomGroup;
    }
}
