package SecondHomework;

public class MathOperation {
    public static void main (String[] args) {
        System.out.println("Sum of given array is " + sum());
    }
    static int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int sum() {
        int sum = 0;
        int i;
        for(i = 0; i<array.length; i++)
            sum += array[i];
        return sum;
    }
}
