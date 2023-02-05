package seventhhomework.task4;

import seventhhomework.task2.Task2Exception;

import java.io.IOException;

public class Task4 {
    void f() throws IOException {
        try {
            g();
            System.out.println("Doing 'f' method");
        } catch (Task2Exception t) {
            System.out.println("Caught "+t+" exception");
        } finally {
            System.out.println("Finally block is done");
        }
    }

    void g () throws Task2Exception {
        System.out.println("Doing 'g' method");
    }
}
