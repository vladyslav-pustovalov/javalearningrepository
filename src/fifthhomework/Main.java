package fifthhomework;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.requestRooms(100, 2, "Lviv", "Kremen");
        controller.requestRooms(200, 1, "Kyiv", "Hilton");
        controller.requestRooms(150, 3, "Kremenchuk", "Redisson");
    }
}
