package fifthhomework.view;

import fifthhomework.controller.Controller;
import fifthhomework.interfaces.GoogleApi;
import fifthhomework.interfaces.TripAdvisorApi;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.requestRooms(100, 3, "Lviv", "Kremen");
        controller.requestRooms(200, 1, "Kyiv", "Hilton");
        controller.requestRooms(100, 2, "Kremenchuk", "Kremen");

        GoogleApi api1 = new GoogleApi();
        TripAdvisorApi api2 = new TripAdvisorApi();
        System.out.println(controller.check(api1, api2).size());
    }
}
