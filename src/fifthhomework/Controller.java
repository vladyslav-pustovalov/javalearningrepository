package fifthhomework;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    static API bookingComApi = new BookingComApi() {
    };
    static API tripAdvisorApi = new TripAdvisorApi() {
    };
    static API googleApi = new GoogleApi() {
    };

    static List<API> apiList = new ArrayList<>();

    static {
        apiList.add(bookingComApi);
        apiList.add(tripAdvisorApi);
        apiList.add(googleApi);
    }

    public ArrayList<Room> requestRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> result = new ArrayList<>();
        result.addAll(bookingComApi.findRooms(price, persons, city, hotel));
        result.addAll(tripAdvisorApi.findRooms(price, persons, city, hotel));
        result.addAll(googleApi.findRooms(price, persons, city, hotel));
        if (result.isEmpty()) {
            System.out.println("There is no any rooms according to your request");
        } else {
            System.out.println(result);
        }
        return result;
    }

    public ArrayList<Room> check(API api1, API api2) {

        return new ArrayList<>();
    }

}
