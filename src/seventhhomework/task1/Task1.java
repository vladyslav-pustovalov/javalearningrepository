package seventhhomework.task1;

public class Task1 {

    public static void main(String[] args) {

        try {
            throw new Exception("This is my first exception");
        } catch (Exception e) {
            System.out.println("It is my first caught exception");
        } finally {
            System.out.println("Finally block is run");
        }
    }
}
