package fifthhomework.controller;

import fifthhomework.interfaces.API;
import fifthhomework.interfaces.BaseApiImpl;
import fifthhomework.interfaces.BookingComApi;
import fifthhomework.interfaces.GoogleApi;
import fifthhomework.interfaces.TripAdvisorApi;
import fifthhomework.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Controller.
 */
public class Controller {

    private List<BaseApiImpl> apiList;

    public Controller() {
        this.apiList = new ArrayList<>();
        apiList.add(new BookingComApi());
        apiList.add(new TripAdvisorApi());
        apiList.add(new GoogleApi());
    }


    /**
     * This method returns all requested rooms from all APIs
     *
     * @param price   the price
     * @param persons the persons
     * @param city    the city
     * @param hotel   the hotel
     * @return the list of Room
     */
    public List<Room> requestRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new ArrayList<>();
        apiList.forEach((BaseApiImpl api) -> {
            List<Room> foundedRooms = api.findRooms(price, persons, city, hotel);
            result.addAll(foundedRooms);
        });
        if (result.isEmpty()) {
            System.out.println("There is no any rooms according to your request");
        } else {
            System.out.println(result);
        }
        return result;
    }

    /**
     * Check list.
     *
     * @param api1 the api 1
     * @param api2 the api 2
     * @return the list
     */
    public List<Room> check(API api1, API api2) {
//TODO: implement this
        List<Room> api1AllRooms = api1.getAllRooms();
        List<Room> api2AllRooms = api2.getAllRooms();
        List<Room> result = api1AllRooms.stream()
                .filter(api2AllRooms::contains)
                .collect(Collectors.toList());
        List<Room> commonRooms = new ArrayList<>(Arrays.asList());
        return result;
    }

}
