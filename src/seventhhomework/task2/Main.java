package seventhhomework.task2;

public class Main {

    public static void main(String[] args) {
        Task2Exception task2Exception = new Task2Exception(null);
        try {
            task2Exception.print();
        } catch (Task2Exception t) {
            System.out.println("Its caught "+t+" exception");
        } finally {
            System.out.println("Finally block is done");
        }
    }
}
