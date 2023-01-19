package fifthhomework.interfaces;

import fifthhomework.model.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorApi extends BaseApiImpl {

    public TripAdvisorApi () {
        List<Room> tripRooms = new ArrayList<>();
        tripRooms.add(new Room(211111111L, 300, 2, new Date(123, 1, 20), "Kremen", "Kremenchuk"));
        tripRooms.add(new Room(222222222L, 200, 3, new Date(123, 1, 24), "Hilton", "Kyiv"));
        tripRooms.add(new Room(233333333L, 200, 3, new Date(123, 1, 23), "Hilton", "Kyiv"));
        tripRooms.add(new Room(244444444L, 300, 3, new Date(123, 1, 23), "Redisson", "Kyiv"));
        tripRooms.add(new Room(255555555L, 300, 2, new Date(123, 1, 20), "Redisson", "Lviv"));
        setRooms(tripRooms);
    }
}
