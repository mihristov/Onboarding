package com.ean.entities;

import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;

/**
 * Created by Milen on 5/17/2016.
 */
public class RoomGroup {
    private Room[] room;

    public RoomGroup() {
    }

    public Room[] getRoom() {
        return room;
    }

    @XmlElement(name = "Room")
    public void setRoom(Room[] room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "RoomGroup{" +
                "room=" + Arrays.toString(room) +
                '}';
    }
}
