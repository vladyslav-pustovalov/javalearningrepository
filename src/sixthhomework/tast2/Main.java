package sixthhomework.tast2;

import sixthhomework.task1.Order;
import sixthhomework.task1.OrderDB;
import sixthhomework.task1.User;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static fourthhomework.Currency.EUR;
import static fourthhomework.Currency.USD;

public class Main {

    public static void main(String[] args) {

        OrderDB orderDB = new OrderDB();

        List<Order> orderList = new ArrayList<>();
        orderList.add(orderDB.firstOrder);
        orderList.add(orderDB.secondOrder);
        orderList.add(orderDB.thirdOrder);
        orderList.add(orderDB.fourthOrder);
        orderList.add(orderDB.fifthOrder);
        orderList.add(orderDB.sixthOrder);
        orderList.add(orderDB.seventhOrder);
        orderList.add(orderDB.eigthOrder);
        orderList.add(orderDB.ninthOrder);
        orderList.add(orderDB.tenthOrder);

//        sortByPriceDSC(orderList);
//        sortByPriceAndCity(orderList);
//        sortByItemNameAndShopIdentificator(orderList);
//        deleteDuplicatesBySet(orderList);
//        deleteDuplicatesByStream(orderList);
//        lessThan1500ByPredicate(orderList);
//        lessThan1500ByLambda(orderList);
//        separateForTwoCurrencies(orderList);
//        separateByUniqueCity(orderList);

    }

    static void sortByPriceDSC (List<Order> list){
        list.sort(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                int x = o1.getPrice() - o2.getPrice();
                return -x;
            }
        });

        for (Order order : list) {
            System.out.println("Decrease price sorted order is " + order);
        }
    }

    static void sortByPriceAndCity (List<Order> list) {
        list.sort(new Comparator<Order>() {
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

        for (Order order : list) {
            System.out.println("Increase price and city sorted order is " + order);
        }
    }

    static void sortByItemNameAndShopIdentificator (List<Order> list) {
        list.sort(new Comparator<Order>() {
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

        for (Order order : list) {
            System.out.println("Item name, Shop identificator, city sorted order is " + order);
        }
    }

    static void deleteDuplicatesBySet (List<Order> list) {
        Set<Order> uniqueOrders = new HashSet<>();
        uniqueOrders.addAll(list);

        for (Order order : uniqueOrders) {
            System.out.println("Unique order is " + order);
        }
    }

    static void deleteDuplicatesByStream (List<Order> list) {
        List<Order> uniqueOrders;
        uniqueOrders = list.stream().distinct().collect(Collectors.toList());

        for (Order order : uniqueOrders) {
            System.out.println("Unique order is " + order);
        }
    }

    static void lessThan1500ByPredicate (List<Order> list) {
        Predicate<Order> pr = order -> order.getPrice() < 1500;
        list.removeIf(pr);

        for (Order order : list) {
            System.out.println("Order that costs less than 1500 is " + order);
        }
    }

    static void lessThan1500ByLambda (List<Order> list) {
            list.removeIf(order -> order.getPrice() < 1500);

        for (Order order : list) {
            System.out.println("Order that costs less than 1500 is " + order);
        }
    }

    static void separateForTwoCurrencies (List<Order> list) {
        List<Order> ordersUSD = new ArrayList<>();
        List<Order> ordersEUR = new ArrayList<>();

        for (Order order : list) {
            if (order.getCurrency() == USD) {
                ordersUSD.add(order);
            } else if (order.getCurrency() == EUR) {
                ordersEUR.add(order);
            }
        }

        for (Order order : ordersUSD) {
            System.out.println("USD " + order);
        }
        for (Order order : ordersEUR) {
            System.out.println("EUR " + order);
        }
    }

    static void separateByUniqueCity (List<Order> list) {
        List<List<Order>> splitOrdersByCities = new ArrayList<>();
        Set<String> cities = new HashSet<>();
        cities = list.stream()
                .map(Order::getUser)
                .map(User::getCity)
                .collect(Collectors.toSet());
        List<Order> temp = list;
        cities.forEach(city -> {
            List<Order> orders = temp.stream()
                    .filter(order -> order.getUser().getCity().equalsIgnoreCase(city))
                    .toList();
            splitOrdersByCities.add(orders);
        });

        for (List<Order> sepList: splitOrdersByCities) {
            System.out.println("List with unique user's city in the order "+sepList);
        }
    }
}
