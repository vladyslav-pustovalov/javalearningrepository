package fifthhomework;

import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;

public class BookingComApi  implements API{

    private static ArrayList<Room> bookingRooms;

    static {
        bookingRooms.add(new Room(111111111L, 100, 2, new Date(123, 1,20), "Kremen", "Kremenchuk"));
        bookingRooms.add(new Room(122222222L, 200, 1, new Date(123, 1,25), "Kremen", "Kremenchuk"));
        bookingRooms.add(new Room(133333333L, 300, 3, new Date(123, 1,24), "Hilton", "Kremenchuk"));
        bookingRooms.add(new Room(144444444L, 100, 1, new Date(123, 1,22), "Hilton", "Kyiv"));
        bookingRooms.add(new Room(155555555L, 200, 2, new Date(123, 1,25), "Redisson", "Lviv"));
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
