package SecondHomework;
public class MathOperation {
    public static void main (String[] args) {
        /**
        Гуглив як знайти сумму з самого початку, бо чогось туго доходило. Потім усе наробив сам (там з МаксПозітів такий
        якийсь прикол написам - але сам). І СекондМакс теж гуглив, бо довбався з ним години півтори дві в суммі за
        декілька заходів, сам дойшов що треба цикл в цикл вставляти, і що треба робити якусь дію з переприсвоєнням
        значень для елементів массиву через додаткову змінну, але не туди цикл в цикл вставляв, і не там робив
        переприсвоєння - тому нічого не працювало, і після години мук усе вирішилось гуглінням=) */
        System.out.println(sum());
        System.out.println(min());
        System.out.println(minD());
        System.out.println(max());
        System.out.println(maxD());
        System.out.println(multiplication());
        System.out.println(multiplicationD());
        System.out.println(maxPositive());
        System.out.println(modulusFirstAndLast());
        System.out.println(secondMax());
    }
    static int[] array = {18, 2, -3, 4, -5, 6, -7, 8, -9, 36};
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
    static String maxPositive() {
        String maxPositive;
        int maxP = array[0];
        int i;
        for (i = 0; i < array.length; i++) {
            if (maxP < array[i]) {
                maxP = array[i];
            }
        }
        if (maxP > 0) {
            maxPositive = Integer.toString(maxP);
        } else {
            maxPositive = "the array does not have any positive numbers";
        }
        return maxPositive;
    }
    static int modulusFirstAndLast() {
        int a, first, last, result;
        first = array[0];
        a = array.length - 1;
        last = array[a];
        result = first % last;
        return result;
    }
    static int secondMax() {
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
