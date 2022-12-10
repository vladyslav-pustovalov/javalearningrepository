package thirdhomework;

public class Adder extends Arithmetic{
    public static void main(String[] args) {
        System.out.println(check(3,2));
    }
    static boolean check (int a, int b) {
        boolean result;
        result = a >= b;
        return result;
    }
}
