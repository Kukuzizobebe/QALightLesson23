package ua.QALightCourse.Lesson6.Task;

public final class OrderManager {

    public static double calculateTotalOrder(Order[] orders) {
        double totalPrice = 0;
        for (Order order : orders) {
            totalPrice += order.getPrice();
        }
        return totalPrice;
    }

}
