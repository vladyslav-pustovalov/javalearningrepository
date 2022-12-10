package thirdhomework;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println(add(new int[]{1,2,3,4}));
        System.out.println(add(new int[]{5,6,7,8,9,10}));
    }
    static int add(int... args) {
        int i, sum;
        sum = 0;
        for (i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
