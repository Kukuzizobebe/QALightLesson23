package ua.QALightCourse.Lesson6.Task;

public class Cafe {

    static void main(String[] args) {
        Order[] orders = {
                new CoffeeOrder(1,"Small"),
                new CoffeeOrder(1,"Medium"),
                new TeaOrder(2,"Herbal"),
                new DessertOrder(3,"Pancakes")
        };
        for (Order order : orders) {
            order.printOrderInfo();
        }
        System.out.println("Total price is " + OrderManager.calculateTotalOrder(orders) + " UAH.\n");}

}
