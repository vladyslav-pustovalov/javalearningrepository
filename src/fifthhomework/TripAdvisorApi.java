package fifthhomework;

import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorApi implements API{

    private static ArrayList<Room> tripRooms;

    static {
        tripRooms.add(new Room(211111111L, 300, 2, new Date(123, 1,20), "Kremen", "Kremenchuk"));
        tripRooms.add(new Room(222222222L, 200, 3, new Date(123, 1,24), "Hilton", "Kyiv"));
        tripRooms.add(new Room(233333333L, 200, 3, new Date(123, 1,23), "Hilton", "Kyiv"));
        tripRooms.add(new Room(244444444L, 300, 3, new Date(123, 1,23), "Redisson", "Kyiv"));
        tripRooms.add(new Room(255555555L, 300, 2, new Date(123, 1,20), "Redisson", "Lviv"));
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
