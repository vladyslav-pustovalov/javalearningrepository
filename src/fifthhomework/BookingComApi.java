package fifthhomework;

import java.util.Date;

public class BookingComApi  implements API{

    public Room[] rooms = new Room[5];
    Room roomOne = new Room(111111111L, 100, 2, aaa, "Hilton", "Kyiv");
    Room roomTwo = new Room(222222222L, 200, 3, aaa, "Redisson", "Yaremche");
    Room roomThree = new Room(3333333L, 300, 1, aaa, "Kremen", "Kremenchuk");
    Room roomFour = new Room(44444444L, 400, 3, aaa, "Zori", "Kremenchuk");
    Room roomFive = new Room(55555555L, 500, 2, aaa, "Burdg Khalifa", "Abu Dabi");

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
