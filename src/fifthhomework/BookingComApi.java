package fifthhomework;

import java.util.Date;

public class BookingComApi  implements API{

    public Room[] rooms = new Room[5];

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
