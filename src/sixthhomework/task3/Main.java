package sixthhomework.task3;

import sixthhomework.task1.Order;
import sixthhomework.task1.OrderDB;

import java.util.*;
import java.util.stream.Collectors;

import static fourthhomework.Currency.USD;

public class Main {

    public static void main(String[] args) {

        OrderDB orderDB = new OrderDB();

        Set<Order> orderSet = new TreeSet<>();
        orderSet.add(orderDB.firstOrder);
        orderSet.add(orderDB.secondOrder);
        orderSet.add(orderDB.thirdOrder);
        orderSet.add(orderDB.fourthOrder);
        orderSet.add(orderDB.fifthOrder);
        orderSet.add(orderDB.sixthOrder);
        orderSet.add(orderDB.seventhOrder);
        orderSet.add(orderDB.eigthOrder);
        orderSet.add(orderDB.ninthOrder);
        orderSet.add(orderDB.tenthOrder);

//        checkLastName(orderSet, "Ivanov");
//        showOrderWithLargestPrice(orderSet);
//        deleteOrdersUSD(orderSet);
//        System.out.println("Orders without USD: "+orderSet);

    }

    static void checkLastName(Set<Order> orderSet, String lastName) {
        List<Order> lastNameOrder;
        lastNameOrder = orderSet.stream().filter(order ->
                order.getUser().getLastName().equals(lastName)
        ).collect(Collectors.toList());
        System.out.println("Order with LastName " + lastName + " is " + lastNameOrder);
    }

    static void showOrderWithLargestPrice(Set<Order> orderSet) {
        List<Order> orderArrayList = new ArrayList<>();
        orderArrayList.addAll(orderSet);
        Order maxPriceOrder = orderArrayList.get(0);
        for (Order o1 : orderArrayList) {
            if (o1.getPrice() > maxPriceOrder.getPrice()) {
                maxPriceOrder = o1;
            }
        }
        System.out.println("Order with max price is " + maxPriceOrder);
    }

    static void deleteOrdersUSD(Set<Order> orderSet) {
        List<Order> orderList = new ArrayList<>(orderSet);
        Iterator<Order> iterator = orderList.iterator();
        while (iterator.hasNext()) {
            Order orderOne = iterator.next();
            if (orderOne.getCurrency().equals(USD)) {
                orderSet.remove(orderOne);
            }
        }

        for (Order order : orderSet) {
            System.out.println("Order with nonUSD is " + order);
        }
    }
}
