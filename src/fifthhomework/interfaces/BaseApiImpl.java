package fifthhomework.interfaces;

import fifthhomework.model.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaseApiImpl implements API {

    private List<Room> rooms;

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }

    protected void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<>();
        rooms.stream()
                .filter(room -> room.getPrice() <= price && room.getPersons() <= persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel))
                .collect(Collectors.toList());
        return result;
    }
}
