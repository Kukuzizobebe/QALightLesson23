package ua.QALightCourse.Lesson10.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Cafe {

    static void main(String[] args) {

        List<Order> ordersList = new ArrayList<>(Arrays.asList(
                new CoffeeOrder(1, "Small"),
                new CoffeeOrder(2, "Medium"),
                new TeaOrder(3, "Herbal"),
                new DessertOrder(4, "Pancakes")
        ));
        OrderManager orderManager = new OrderManager(ordersList);

        int orderNumberForExRemove = 1488;
        int orderNumberForExFind = 111;
        Status statusForExSet = Status.NULL;
        Order orderForAddEx = new CoffeeOrder(1, "Small");
        List<Order> orderListWithoutOrders = new ArrayList<>();
        OrderManager orderManagerForNull = new OrderManager(orderListWithoutOrders);


        try {
            orderManager.removeOrderByNumber(orderNumberForExRemove);
        } catch (OrderNotFoundException e) {
            System.err.println(e.getMessage() + " For order number: " + orderNumberForExRemove);
        }

        try {
            orderManager.findOrderByNumber(orderNumberForExFind);
        } catch (OrderNotFoundException e) {
            System.err.println(e.getMessage() + " For order number: " + orderNumberForExFind);
        }

        try {
            orderManager.addOrder(orderForAddEx);
        } catch (DuplicateOrderException e) {
            System.err.println(e.getMessage() + " For order: " + orderForAddEx.toString());
        }

        try {
            ordersList.get(1).setStatus(statusForExSet);
        } catch (InvalidOrderStatusException e) {
            System.err.println(e.getMessage() + " For status: " + statusForExSet.getStatusName());
        }

        try {
            orderManagerForNull.calculateTotalOrder();
        } catch (NoOrdersException e) {
            System.err.println(e.getMessage() + " For order list size: " + orderListWithoutOrders.size());
        }


    }
}
