package ua.QALightCourse.Lesson8.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderManager {

    private final List<Order> ordersList;

    public OrderManager(List<Order> orders) {
        this.ordersList = orders;
    }

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public void removeOrderByNumber(int orderNumber) {
        ordersList.removeIf(o -> o.getOrderNumber() == orderNumber);
    }

    public Order findOrderByNumber(int orderNumber) {
        return ordersList.stream()
                .filter(o -> o.getOrderNumber() == orderNumber)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(orderNumber + " isn`t exist!"));
    }

    public List<Order> getOrdersByStatus(Status status) {
        List<Order> orderStatusList = new ArrayList<>();
        ordersList.stream()
                .filter(o -> Objects.equals(o.getStatus().getStatusName(), status.getStatusName()))
                .forEach(orderStatusList::add);
        return orderStatusList;
    }

    public double calculateTotalOrder() {
        return ordersList.stream()
                .filter(o -> o.getStatus() == Status.NEW).mapToDouble(Priceable::getPrice).sum();
    }

}
