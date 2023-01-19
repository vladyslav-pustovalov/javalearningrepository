package fifthhomework.interfaces;

import fifthhomework.model.Room;

import java.util.ArrayList;
import java.util.List;

public interface API {
    List<Room> findRooms(int price, int persons, String city, String hotel);
    List<Room> getAllRooms();
}
