package secondhomework;

public class MathOperation {
    public static void main (String[] args) {
        int[] array = {-18, 2, -3, 4, -5, 6, -7, 8, -9, 36};
        System.out.println(sum(array));
        System.out.println(min(array));
        System.out.println(max(array));
        System.out.println(multiplication(array));
        System.out.println(maxPositive(array));
        System.out.println(modulusFirstAndLast(array));
        System.out.println(secondMax(array));
    }

    static int sum(int[] array) {
        int sum = 0;
        int i;
        for(i = 0; i<array.length; i++)
            sum += array[i];
        return sum;
    }

    static int min(int[] array) {
        int min = array[0];
        int i;
        for(i = 0; i<array.length; i++)
            if (min > array[i]) {
                min = array[i];
            }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];
        int i;
        for (i = 0; i < array.length; i++)
            if (max < array[i]) {
                max = array[i];
            }
        return max;
    }

    static long multiplication(int[] array) {
        int multiplication = array[0];
        int i;
        for(i = 0; i<array.length; i++)
            multiplication *= array[i];
        return multiplication;
    }

    static int maxPositive(int[] array) {
        int maxP = array[0];
        int i;
        for (i = 0; i < array.length; i++) {
            if (maxP < array[i]) {
                maxP = array[i];
            }
        }
        if (maxP > 0) {
            maxP = maxP;
        } else {
            System.out.println("there are no any positive numbers");
        }
        return maxP;
    }

    static int modulusFirstAndLast(int[]array) {
        int a, first, last, result;
        first = array[0];
        a = array.length - 1;
        last = array[a];
        result = first % last;
        return result;
    }

    static int secondMax(int[] array) {
        int i,j,f;
        for (i = 0; i < 2; i++) {
            for (j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    f = array[i];
                    array[i] = array[j];
                    array[j] = f;
                }
            }
        }
        return array[1];
    }
}
