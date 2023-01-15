package sixthhomework.tast2;

import fourthhomework.Currency;
import sixthhomework.task1.Order;
import sixthhomework.task1.User;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        User firstUser = new User(0000000001L, "Ivan", "Kovalenko", "Kremenchuk", 100);
        User secondUser = new User(0000000002L, "Danylo", "Glushko", "Kremenchuk", 150);
        User thirdUser = new User(0000000003L, "Oleg", "Sydorenko", "Kremenchuk", 200);
        User fourthUser = new User(0000000004L, "Igor", "Valylenko", "Kyiv", 175);
        User fifthUser = new User(0000000005L, "Vasyl", "Vasylenko", "Kyiv", 250);
        User sixthUser = new User(0000000006L, "Petro", "Danylenko", "Lviv", 150);
        User seventhUser = new User(0000000007L, "Ivan", "Givno", "Lviv", 300);
        User eigthUser = new User(0000000011L, "Igor", "Kusub", "Lviv", 0);
        User ninthUser = new User(0000000012L, "Vasyl", "Ivanov", "Odessa", 180);
        User tenthUser = new User(0000000010L, "Artem", "Andriiv", "Dnipro", 600);

        List<User> userList = new ArrayList<>();
        userList.add(firstUser);
        userList.add(secondUser);
        userList.add(thirdUser);
        userList.add(fourthUser);
        userList.add(fifthUser);
        userList.add(sixthUser);
        userList.add(seventhUser);
        userList.add(eigthUser);
        userList.add(ninthUser);
        userList.add(tenthUser);

        Order firstOrder = new Order(0000000001L, 100, Currency.USD, "Dildo", "Strawberry", tenthUser);
        Order secondOrder = new Order(0000000002L, 200, Currency.USD, "Strapon", "Adults", ninthUser);
        Order thirdOrder = new Order(0000000003L, 500, Currency.EUR, "Pocket Pussy", "Night entertainment", eigthUser);
        Order fourthOrder = new Order(0000000004L, 800, Currency.EUR, "Double pocket pussy", "Beside of twos", seventhUser);
        Order fifthOrder = new Order(0000000005L, 140, Currency.USD, "Dildo", "Bonga bonga", sixthUser);
        Order sixthOrder = new Order(0000000006L, 155, Currency.USD, "Dildo", "Strawberry", fifthUser);
        Order seventhOrder = new Order(0000000007L, 190, Currency.EUR, "Strapon", "Adults", fourthUser);
        Order eigthOrder = new Order(00000000011L, 290, Currency.EUR, "Pocket Pussy", "Night entertainment", thirdUser);
        Order ninthOrder = new Order(00000000012L, 400, Currency.USD, "Pocket Pussy", "Beside of twos", secondUser);
        Order tenthOrder = new Order(00000000013L, 155, Currency.USD, "Dildo", "Bonga bonga", fifthUser);

        List<Order> orderList = new ArrayList<>();
        orderList.add(firstOrder);
        orderList.add(secondOrder);
        orderList.add(thirdOrder);
        orderList.add(fourthOrder);
        orderList.add(fifthOrder);
        orderList.add(sixthOrder);
        orderList.add(seventhOrder);
        orderList.add(eigthOrder);
        orderList.add(ninthOrder);
        orderList.add(tenthOrder);

        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int x = o1.getPrice() - o2.getPrice();
                return -x;
            }
        });

        for (Order order : orderList) {
            System.out.println("Decrease price sorted order is "+order);
        }

        System.out.println("----------------------------------");

        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int x = o1.getPrice() - o2.getPrice();
                if (x != 0) {
                    return x;
                }
                x = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                return x;
            }
        });

        for (Order order : orderList) {
            System.out.println("Increase price and city sorted order is "+order);
        }

        System.out.println("----------------------------");

        orderList.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int x = o1.getItemName().compareTo(o2.getItemName());
                if (x != 0) {
                    return x;
                }
                x = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (x != 0) {
                    return x;
                }
                x = o1.getUser().getCity().compareTo(o2.getUser().getCity());
                return x;
            }
        });

        for (Order order : orderList) {
            System.out.println("Item name, Shop identificator, city sorted order is "+order);
        }

        System.out.println("--------------------");

        Set<Order> uniqueOrders = new HashSet<>();
        uniqueOrders.addAll(orderList);

        /* Another mathod)))
        List<Order> uniqueOrders = new ArrayList<>();
        uniqueOrders = orderList.stream().distinct().collect(Collectors.toList());
         */

        for (Order order: uniqueOrders) {
            System.out.println("Unique order is "+order);
        }

        System.out.println("---------------------------");

        Predicate<Order> pr = order -> order.getPrice() < 1500;
        orderList.removeIf(pr);

        for (Order order: uniqueOrders) {
            System.out.println("Order that costs less than 1500 is "+order);
        }

        System.out.println("----------------------------");

        List<Order> ordersUSD = new ArrayList<>();


        for (Order order : ordersUSD) {
            System.out.println("USD order is "+order);
        }

        List<Order> ordersEUR = new ArrayList<>();


        for (Order order : ordersEUR) {
            System.out.println("EUR order is "+order);
        }

        System.out.println("------------------------");
    }
}
