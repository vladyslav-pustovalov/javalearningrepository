package fifthhomework;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    static API api = new API() {
        @Override
        public ArrayList<Room> findRooms(int price, int persons, String city, String hotel) {
            return new ArrayList<Room>();
        }
    };
    static BookingComApi bookingComApi = new BookingComApi();
    static TripAdvisorApi tripAdvisorApi = new TripAdvisorApi();
    static GoogleApi googleApi = new GoogleApi();

    static List<API> apiList;

    static {
        apiList.add(bookingComApi);
        apiList.add(tripAdvisorApi);
        apiList.add(googleApi);
    }

    public ArrayList<Room> requestRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> result = new ArrayList<>();

        return result;
    }

    public ArrayList<Room> check(API api1, API api2) {

        return new ArrayList<>();
    }

}
