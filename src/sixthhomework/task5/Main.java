package sixthhomework.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        List<Integer> oneIntArrayList = new ArrayList<>(1000);
        //Filling ArrayList with 1000 random integers
        for (int i = 0; i < 1000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            oneIntArrayList.add(randomInt);
        }

        List<Integer> tenIntArrayList = new ArrayList<>(10000);
        //Filling ArrayList with 10000 random integers
        for (int i = 0; i < 10000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            tenIntArrayList.add(randomInt);
        }

        List<Integer> oneIntLinkedList = new LinkedList<>();
        //Filling LinkedList with 1000 random integers
        for (int i = 0; i < 1000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            oneIntLinkedList.add(randomInt);
        }

        List<Integer> tenIntLinkedList = new LinkedList<>();
        //Filling LinkedList with 10000 random integers
        for (int i = 0; i < 10000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            tenIntLinkedList.add(randomInt);
        }



        List<String> oneStrArrayList = new ArrayList<>(1000);
        //Filling ArrayList with 1000 random strings
        for (int i = 0; i < 1000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            String randomString = String.valueOf(randomInt);
            oneStrArrayList.add(randomString);
        }

        List<String> tenStrArrayList = new ArrayList<>(10000);
        //Filling ArrayList with 10000 random strings
        for (int i = 0; i < 10000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            String randomString = String.valueOf(randomInt);
            tenStrArrayList.add(randomString);
        }

        List<String> oneStrLinkedList = new LinkedList<>();
        //Filling LinkedList with 1000 random strings
        for (int i = 0; i < 1000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            String randomString = String.valueOf(randomInt);
            oneStrLinkedList.add(randomString);
        }

        List<String> tenStrLinkedList = new LinkedList<>();
        //Filling LinkedList with 10000 random strings
        for (int i = 0; i < 10000; i++) {
            int randomInt = ThreadLocalRandom.current().nextInt();
            String randomString = String.valueOf(randomInt);
            tenStrLinkedList.add(randomString);
        }
    }
}
