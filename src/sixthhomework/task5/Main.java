package sixthhomework.task5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        List<Integer> oneIntArrayList = new ArrayList<>(1000);
        //Filling ArrayList with 1000 random integers
        for (int i = 0; i < 1000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            oneIntArrayList.add(randomInt);
        }
        System.out.println("Operations with One thousand Integers ArrayList");
        addIntToList(oneIntArrayList, 14567);
        setIntToList(oneIntArrayList, 14567);
        getIntToList(oneIntArrayList);
        removeIntToList(oneIntArrayList, 567);
        System.out.println("----------------------------------------------------");

        List<Integer> tenIntArrayList = new ArrayList<>(10000);
        //Filling ArrayList with 10000 random integers
        for (int i = 0; i < 10000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            tenIntArrayList.add(randomInt);
        }
        System.out.println("Operations with Ten thousand Integers ArrayList");
        addIntToList(tenIntArrayList, 14567);
        setIntToList(tenIntArrayList, 14567);
        getIntToList(tenIntArrayList);
        removeIntToList(tenIntArrayList, 567);
        System.out.println("----------------------------------------------------");

        List<Integer> oneIntLinkedList = new LinkedList<>();
        //Filling LinkedList with 1000 random integers
        for (int i = 0; i < 1000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            oneIntLinkedList.add(randomInt);
        }
        System.out.println("Operations with One thousand Integers LinkedList");
        addIntToList(oneIntLinkedList, 14567);
        setIntToList(oneIntLinkedList, 14567);
        getIntToList(oneIntLinkedList);
        removeIntToList(oneIntLinkedList, 567);
        System.out.println("----------------------------------------------------");

        List<Integer> tenIntLinkedList = new LinkedList<>();
        //Filling LinkedList with 10000 random integers
        for (int i = 0; i < 10000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            tenIntLinkedList.add(randomInt);
        }
        System.out.println("Operations with Ten thousand Integers LinkedList");
        addIntToList(tenIntLinkedList, 14567);
        setIntToList(tenIntLinkedList, 14567);
        getIntToList(tenIntLinkedList);
        removeIntToList(tenIntLinkedList, 567);
        System.out.println("----------------------------------------------------");


        List<String> oneStrArrayList = new ArrayList<>(1000);
        //Filling ArrayList with 1000 random strings
        for (int i = 0; i < 1000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            String randomString = String.valueOf(randomInt);
            oneStrArrayList.add(randomString);
        }
        System.out.println("Operations with One thousand Strings ArrayList");
        addStringToList(oneStrArrayList, "Who is on duty today?");
        setStringToList(oneStrArrayList, "Who is on duty today?");
        getIntToList(oneStrArrayList);
        removeStringToList(oneStrArrayList, "Who is on duty today?");
        System.out.println("----------------------------------------------------");

        List<String> tenStrArrayList = new ArrayList<>(10000);
        //Filling ArrayList with 10000 random strings
        for (int i = 0; i < 10000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            String randomString = String.valueOf(randomInt);
            tenStrArrayList.add(randomString);
        }
        System.out.println("Operations with Ten thousand Strings ArrayList");
        addStringToList(tenStrArrayList, "Who is on duty today?");
        setStringToList(tenStrArrayList, "Who is on duty today?");
        getIntToList(tenStrArrayList);
        removeStringToList(tenStrArrayList, "Who is on duty today?");
        System.out.println("----------------------------------------------------");

        List<String> oneStrLinkedList = new LinkedList<>();
        //Filling LinkedList with 1000 random strings
        for (int i = 0; i < 1000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            String randomString = String.valueOf(randomInt);
            oneStrLinkedList.add(randomString);
        }
        System.out.println("Operations with One thousand Strings LinkedList");
        addStringToList(oneStrLinkedList, "Who is on duty today?");
        setStringToList(oneStrLinkedList, "Who is on duty today?");
        getIntToList(oneStrLinkedList);
        removeStringToList(oneStrLinkedList, "Who is on duty today?");
        System.out.println("----------------------------------------------------");

        List<String> tenStrLinkedList = new LinkedList<>();
        //Filling LinkedList with 10000 random strings
        for (int i = 0; i < 10000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            String randomString = String.valueOf(randomInt);
            tenStrLinkedList.add(randomString);
        }
        System.out.println("Operations with Ten thousand Strings LinkedList");
        addStringToList(tenStrLinkedList, "Who is on duty today?");
        setStringToList(tenStrLinkedList, "Who is on duty today?");
        getIntToList(tenStrLinkedList);
        removeStringToList(tenStrLinkedList, "Who is on duty today?");
        System.out.println("----------------------------------------------------");
    }

    static void addIntToList(List list, int number) {
        LocalDateTime t0 = LocalDateTime.now();
        long start = t0.getNano();
        list.add(number);
        LocalDateTime t1 = LocalDateTime.now();
        long finish = t1.getNano();
        System.out.println(String.format("The time of required operation: %s", finish - start));
    }

    static void setIntToList(List list, int number) {
        long t0 = System.nanoTime();
        list.set(567, number);
        long t1 = System.nanoTime();
        long millis = t1 - t0;
        double result = (double) millis / 100000;
        System.out.println(String.format("The time of required operation: %f", result));
    }

    static void getIntToList(List list) {
        long t0 = System.nanoTime();
        list.get(567);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("The time of required operation: %d", millis));
    }

    static void removeIntToList(List list, int number) {
        long t0 = System.nanoTime();
        list.remove(number);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("The time of required operation: %d", millis));
    }

    static void addStringToList(List list, String str) {
        long t0 = System.nanoTime();
        list.add(str);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("The time of required operation: %d", millis));
    }

    static void setStringToList(List list, String str) {
        long t0 = System.nanoTime();
        list.set(567, str);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("The time of required operation: %d", millis));
    }

    static void getStringToList(List list) {
        long t0 = System.nanoTime();
        list.get(567);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("The time of required operation: %d", millis));
    }

    static void removeStringToList(List list, String str) {
        long t0 = System.nanoTime();
        list.remove(str);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("The time of required operation: %d", millis));
    }
}
