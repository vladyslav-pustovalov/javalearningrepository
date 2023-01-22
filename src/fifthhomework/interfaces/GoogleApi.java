package fifthhomework.interfaces;

import fifthhomework.model.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class GoogleApi extends BaseApiImpl {

    public GoogleApi() {
        List<Room> googleRooms = new ArrayList<>();
        googleRooms.add(new Room(311111111L, 100, 1, new Date(123, 1, 21), "Kremen", "Kyiv"));
        googleRooms.add(new Room(322222222L, 100, 1, new Date(123, 1, 22), "Kremen", "Kyiv"));
        googleRooms.add(new Room(333333333L, 100, 3, new Date(123, 1, 25), "Kremen", "Lviv"));
        googleRooms.add(new Room(344444444L, 300, 3, new Date(123, 1, 22), "Redisson", "Lviv"));
        googleRooms.add(new Room(355555555L, 200, 1, new Date(123, 1, 22), "Redisson", "Lviv"));
        setRooms(googleRooms);
    }
}
