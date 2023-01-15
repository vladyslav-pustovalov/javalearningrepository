package fifthhomework;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class GoogleApi implements API {

    private static ArrayList<Room> googleRooms;

    static {
        googleRooms.add(new Room(311111111L, 100, 1, new Date(123, 1, 21), "Kremen", "Kyiv"));
        googleRooms.add(new Room(322222222L, 100, 1, new Date(123, 1, 22), "Kremen", "Kyiv"));
        googleRooms.add(new Room(333333333L, 100, 3, new Date(123, 1, 25), "Kremen", "Lviv"));
        googleRooms.add(new Room(344444444L, 300, 3, new Date(123, 1, 22), "Redisson", "Lviv"));
        googleRooms.add(new Room(355555555L, 200, 1, new Date(123, 1, 22), "Redisson", "Lviv"));
    }

    @Override
    public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> result = new ArrayList<>();
        googleRooms.stream().filter(room -> room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel))
                .collect(Collectors.toList());
        return result;
    }
}
