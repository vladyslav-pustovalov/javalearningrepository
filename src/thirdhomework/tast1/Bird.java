package thirdhomework.tast1;

import java.util.Objects;

public class Bird {

    public static String walk = "walk";
    public static String fly = "fly";
    public static String sing = "sing";
    public static String amI = "amI";

    public static void sing() {
        System.out.println("I am singing");
    }

    public static void sing(String action) {
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
