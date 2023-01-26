package sixthhomework.task3;

import fourthhomework.Currency;
import sixthhomework.task1.Order;
import sixthhomework.task1.User;

import java.util.*;
import java.util.function.Consumer;
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

        Order firstOrder = new Order(1L, 100, Currency.USD, "Dildo", "Strawberry", tenthUser);
        Order secondOrder = new Order(2L, 200, Currency.USD, "Strapon", "Adults", ninthUser);
        Order thirdOrder = new Order(3L, 500, Currency.EUR, "Pocket Pussy", "Night entertainment", eigthUser);
        Order fourthOrder = new Order(4L, 800, Currency.EUR, "Double pocket pussy", "Beside of twos", seventhUser);
        Order fifthOrder = new Order(5L, 140, Currency.USD, "Dildo", "Bonga bonga", sixthUser);
        Order sixthOrder = new Order(6L, 155, Currency.USD, "Dildo", "Strawberry", fifthUser);
        Order seventhOrder = new Order(8L, 190, Currency.EUR, "Strapon", "Adults", fourthUser);
        Order eigthOrder = new Order(9L, 290, Currency.EUR, "Pocket Pussy", "Night entertainment", thirdUser);
        Order ninthOrder = new Order(2L, 200, Currency.USD, "Strapon", "Adults", ninthUser);
        Order tenthOrder = new Order(5L, 140, Currency.USD, "Dildo", "Bonga bonga", sixthUser);

        Set<Order> orderSet = new TreeSet<>();
        orderSet.add(firstOrder);
        orderSet.add(secondOrder);
        orderSet.add(thirdOrder);
        orderSet.add(fourthOrder);
        orderSet.add(fifthOrder);
        orderSet.add(sixthOrder);
        orderSet.add(seventhOrder);
        orderSet.add(eigthOrder);
        orderSet.add(ninthOrder);
        orderSet.add(tenthOrder);

        System.out.println(orderSet);

        System.out.println("------------------------------------");

        String lastNameInOrder = "Ivanov";
            for (Order o1 : orderSet) {
                if (o1.getUser().getLastName().equals(lastNameInOrder)) {
                    System.out.println("Order with LastName Petrov is "+o1);
                }
            }

           List<Order> lastNameOrder;
            lastNameOrder = orderSet.stream().filter(order ->
               order.getUser().getLastName().equals(lastNameInOrder)
           ).collect(Collectors.toList());
        System.out.println("Order with LastName Petrov is "+lastNameOrder);

        System.out.println("------------------------------------");

        List<Order> orderArrayList = new ArrayList<>();
        orderArrayList.addAll(orderSet);
        Order maxPriceOrder = orderArrayList.get(0);
        for (Order o1 : orderArrayList) {
            if (o1.getPrice() > maxPriceOrder.getPrice()) {
                maxPriceOrder = o1;
            }
        }
        System.out.println("Order with max price is "+maxPriceOrder);

        System.out.println("------------------------------------");

        Iterator<Order> iterator = orderSet.iterator();
//        while (iterator.hasNext()) {
//            Order orderOne = iterator.next();
//            if (orderOne.getCurrency().equals(Currency.USD)) {
//                orderSet.remove(orderOne);
//            }
//        }
//        System.out.println(orderSet);

//        iterator.forEachRemaining(element -> {
//            if (element.getCurrency().equals(Currency.USD)) {
//                orderSet.remove(element);
//            }
//        });

        System.out.println("------------------------------------");

        Predicate<Order> pr = order -> order.getCurrency().equals(Currency.USD);
        orderSet.removeIf(pr);
        System.out.println("Orders without USD: "+orderSet);
    }
}
