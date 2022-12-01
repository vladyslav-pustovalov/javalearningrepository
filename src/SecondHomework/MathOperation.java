package SecondHomework;

import java.math.BigDecimal;

public class MathOperation {
    public static void main (String[] args) {
        System.out.println(sum());
        System.out.println(min());
        System.out.println(minD());
        System.out.println(max());
        System.out.println(maxD());
        System.out.println(multiplication());
        System.out.println(multiplicationD());
    }
    static int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9, 10};
    static int sum() {
        int sum = 0;
        int i;
        for(i = 0; i<array.length; i++)
            sum += array[i];
        return sum;
    }
    static int min() {
        int min = array[0];
        int i;
        for(i = 0; i<array.length; i++)
            if (min > array[i]) {
                min = array[i];
            }
        return min;
    }
    static double minD() {
        double min = array[0];
        int i;
        for(i = 0; i<array.length; i++)
            if (min > array[i]) {
                min = array[i];
            }
        return min;
    }
    static int max() {
        int max = array[0];
        int i;
        for (i = 0; i < array.length; i++)
            if (max < array[i]) {
                max = array[i];
            }
        return max;
    }
    static double maxD() {
        double max = array[0];
        int i;
        for (i = 0; i < array.length; i++)
            if (max < array[i]) {
                max = array[i];
            }
        return max;
    }
    static long multiplication() {
        int multiplication = array[0];
        int i;
        for(i = 0; i<array.length; i++)
            multiplication *= array[i];
        return multiplication;
    }
    static double multiplicationD() {
        double multiplicationD = array[0];
        int i;
        for(i = 0; i<array.length; i++)
            multiplicationD *= array[i];
        return multiplicationD;
    }
    static int secondMax() {
        int max = array[0];
        int secondMax = array[0];
        int i;
        int j;
        for (i = 0; i < array.length; i++)
            if (max < array[i]) {
                max = array[i];
            }
        return max;
        for (j = 1; j < array.length; j++)
            if (secondMax < array[j]) {
                secondMax = array[j];
            }
        return secondMax;
        if (max > secondMax) {
            return secondMax;
        } else if (secondMax == max) {

        }

    }
}
