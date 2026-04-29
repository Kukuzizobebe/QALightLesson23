package ua.QALightCourse.Lesson7.Task;

public final class OrderManager {

    public static double calculateTotalOrder(Order[] orders) {
        double totalPrice = 0;
        for (Order order : orders) {
            if (order.getStatus() == Status.NEW) {
                totalPrice += order.getPrice();
            }
        }
        return totalPrice;
    }

}
