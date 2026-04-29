package ua.QALightCourse.Lesson7.Task;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cafe {

    static void main(String[] args) {
        Order[] orders = {
                new CoffeeOrder(1, "Small"),
                new CoffeeOrder(2, "Medium"),
                new TeaOrder(3, "Herbal"),
                new DessertOrder(4, "Pancakes")
        };
        for (Order order : orders) {
            order.printOrderInfo();
        }
        int randomValue = ThreadLocalRandom.current().nextInt(0, 4);
        orders[randomValue].setStatus(Status.CANCELED);
        System.out.println("(OCN-" + orders[randomValue].getOrderNumber() + " is CANCELED)");
        System.out.println("Total price is " + OrderManager.calculateTotalOrder(orders) + " UAH.");
    }
}
