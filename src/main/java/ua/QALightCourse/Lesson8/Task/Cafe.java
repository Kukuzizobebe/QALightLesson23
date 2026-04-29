package ua.QALightCourse.Lesson8.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Cafe {

    static void main(String[] args) {

        List<Order> orders = new ArrayList<>(Arrays.asList(
                new CoffeeOrder(1, "Small"),
                new CoffeeOrder(2, "Medium"),
                new TeaOrder(3, "Herbal"),
                new DessertOrder(4, "Pancakes")
        ));
        OrderManager orderManager = new OrderManager(orders);

        orders.forEach(Printable::printOrderInfo);

        int randomOrderNumberValueForCanceled = ThreadLocalRandom.current().nextInt(1, 4);
        orders.stream()
                .filter(o -> o.getOrderNumber() == randomOrderNumberValueForCanceled)
                .forEach(o -> o.setStatus(Status.CANCELED));

        int randomOrderNumberValueForGetInfo = ThreadLocalRandom.current().nextInt(1, 4);
        System.out.println("\nGet information about order OCN-" + randomOrderNumberValueForGetInfo + ":");
        orderManager.findOrderByNumber(randomOrderNumberValueForGetInfo).printOrderInfo();

        int randomOrderNumberValueForDelete = ThreadLocalRandom.current().nextInt(1, 4);
        orderManager.removeOrderByNumber(randomOrderNumberValueForDelete);

        System.out.println("Orders with status NEW:");
        orderManager.getOrdersByStatus(Status.NEW)
                .forEach(Printable::printOrderInfo);

        System.out.println("\nList of orders after CANCELED and DELETED: ");

        orders.forEach(Printable::printOrderInfo);

        System.out.println("\n(OCN-" + randomOrderNumberValueForDelete + " is DELETED)");
        System.out.println("(OCN-" + randomOrderNumberValueForCanceled + " is CANCELED)");
        System.out.println("Total price is " + orderManager.calculateTotalOrder() + " UAH.");
    }
}
