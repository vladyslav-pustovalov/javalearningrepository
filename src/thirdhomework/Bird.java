package thirdhomework;

import java.util.Objects;

public class Bird {

    static String walk = "walk";
    static String fly = "fly";
    static String sing = "sing";
    static String amI = "amI";

    public static void main(String[] args) {
        sing();
        sing("amI");
    }

    static void sing() {
        System.out.println("I am singing");
    }

    static void sing(String action) {
        if (Objects.equals(action, walk)) {
            System.out.println("I am walking");
        }
        if (Objects.equals(action, fly)) {
                System.out.println("I am flying");
        }
        if (Objects.equals(action, sing)) {
            System.out.println("I am singing");
        }
        if (Objects.equals(action, amI)) {
            System.out.println("I am Bird");
        }
    }
}
