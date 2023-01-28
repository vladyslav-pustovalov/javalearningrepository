package sixthhomework.tast2;

import fourthhomework.Currency;
import sixthhomework.task1.Order;
import sixthhomework.task1.User;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        User firstUser = new User(1L, "Ivan", "Kovalenko", "Kremenchuk", 100);
        User secondUser = new User(2L, "Danylo", "Glushko", "Kremenchuk", 150);
        User thirdUser = new User(3L, "Oleg", "Sydorenko", "Kremenchuk", 200);
        User fourthUser = new User(4L, "Igor", "Valylenko", "Kyiv", 175);
        User fifthUser = new User(5L, "Vasyl", "Vasylenko", "Kyiv", 250);
        User sixthUser = new User(6L, "Petro", "Danylenko", "Lviv", 150);
        User seventhUser = new User(7L, "Ivan", "Givno", "Lviv", 300);
        User eigthUser = new User(8L, "Igor", "Kusub", "Lviv", 0);
        User ninthUser = new User(9L, "Vasyl", "Ivanov", "Odessa", 180);
        User tenthUser = new User(10L, "Artem", "Andriiv", "Dnipro", 600);

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

        Order firstOrder = new Order(1L, 100, Currency.USD, "Dildo", "Strawberry", tenthUser);
        Order secondOrder = new Order(2L, 200, Currency.USD, "Strapon", "Adults", ninthUser);
        Order thirdOrder = new Order(3L, 500, Currency.EUR, "Pocket Pussy", "Night entertainment", eigthUser);
        Order fourthOrder = new Order(4L, 800, Currency.EUR, "Double pocket pussy", "Beside of twos", seventhUser);
        Order fifthOrder = new Order(5L, 140, Currency.USD, "Dildo", "Bonga bonga", sixthUser);
        Order sixthOrder = new Order(6L, 155, Currency.USD, "Dildo", "Strawberry", fifthUser);
        Order seventhOrder = new Order(7L, 190, Currency.EUR, "Strapon", "Adults", fourthUser);
        Order eigthOrder = new Order(8L, 290, Currency.EUR, "Pocket Pussy", "Night entertainment", thirdUser);
        Order ninthOrder = new Order(2L, 200, Currency.USD, "Strapon", "Adults", ninthUser);
        Order tenthOrder = new Order(5L, 140, Currency.USD, "Dildo", "Bonga bonga", sixthUser);

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

//        orderList.sort(new Comparator<Order>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                int x = o1.getPrice() - o2.getPrice();
//                return -x;
//            }
//        });
//
//        for (Order order : orderList) {
//            System.out.println("Decrease price sorted order is " + order);
//        }
//
//        System.out.println("----------------------------------");
//
//        orderList.sort(new Comparator<Order>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                int x = o1.getPrice() - o2.getPrice();
//                if (x != 0) {
//                    return x;
//                }
//                x = o1.getUser().getCity().compareTo(o2.getUser().getCity());
//                return x;
//            }
//        });
//
//        for (Order order : orderList) {
//            System.out.println("Increase price and city sorted order is " + order);
//        }
//
//        System.out.println("----------------------------");
//
//        orderList.sort(new Comparator<Order>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                int x = o1.getItemName().compareTo(o2.getItemName());
//                if (x != 0) {
//                    return x;
//                }
//                x = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
//                if (x != 0) {
//                    return x;
//                }
//                x = o1.getUser().getCity().compareTo(o2.getUser().getCity());
//                return x;
//            }
//        });
//
//        for (Order order : orderList) {
//            System.out.println("Item name, Shop identificator, city sorted order is " + order);
//        }
//
//        System.out.println("--------------------------");
//
//        Set<Order> uniqueOrders = new HashSet<>();
//        uniqueOrders.addAll(orderList);
//
//        /* Another method)))
//        List<Order> uniqueOrders;
//        uniqueOrders = orderList.stream().distinct().collect(Collectors.toList());
//         */
//
//        for (Order order : uniqueOrders) {
//            System.out.println("Unique order is " + order);
//        }
//
//        System.out.println("---------------------------");

//        Predicate<Order> pr = order -> order.getPrice() < 1500;
//        orderList.removeIf(order -> order.getPrice() < 1500);
//        orderList.removeIf(pr);
//
//        for (Order order : orderList) {
//            System.out.println("Order that costs less than 1500 is " + order);
//        }
//
//        System.out.println("----------------------------");
////      it works if all above methods are commented
//
//        List<Order> ordersUSD = new ArrayList<>();
//        List<Order> ordersEUR = new ArrayList<>();
//
//        for (Order order : orderList) {
//            if (order.getCurrency() == Currency.USD) {
//                ordersUSD.add(order);
//            } else if (order.getCurrency() == Currency.EUR) {
//                ordersEUR.add(order);
//            }
//        }
//
//        for (Order order : ordersUSD) {
//            System.out.println("USD " + order);
//        }
//        for (Order order : ordersEUR) {
//            System.out.println("EUR " + order);
//        }
        System.out.println("------------------------");

        List<Order> uniqueCityOrders = new ArrayList<>();
        orderList = orderList.stream().distinct().collect(Collectors.toList());
        uniqueCityOrders.add(orderList.get(0));
        int orderListSize = orderList.size()-1;
        int uniqueCityOrdersSize = uniqueCityOrders.size();
        for (int i = 1; i < orderListSize; i++) {
            for (int j = 0; j < uniqueCityOrdersSize; j++) {
                if (!orderList.get(i).getUser().getCity().equalsIgnoreCase(uniqueCityOrders.get(j).getUser().getCity())) {
                    uniqueCityOrders.add(orderList.get(i));
                }
            }
        }

        for (Order order : uniqueCityOrders) {
            System.out.println("Order with unique city is "+order);
        }
    }
}
