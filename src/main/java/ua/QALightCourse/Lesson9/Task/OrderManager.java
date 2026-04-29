package ua.QALightCourse.Lesson9.Task;

import java.util.*;

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

    public Map<String, Integer> getOrderTypeCounts() {
        Map<String, Integer> mapOfOrderTypeCounts = new HashMap<>();
        for (int i = 0; i < ordersList.size(); i++) {
            switch (ordersList.get(i)) {
                case CoffeeOrder coffeeOrder -> mapOfOrderTypeCounts.merge("Coffee", 1, Integer::sum);
                case TeaOrder teaOrder -> mapOfOrderTypeCounts.merge("Tea", 1, Integer::sum);
                case DessertOrder dessertOrder -> mapOfOrderTypeCounts.merge("Dessert", 1, Integer::sum);
                default -> throw new IllegalArgumentException(ordersList.getClass() + " isn`t used in our project!");
            }
        }
        return mapOfOrderTypeCounts;
    }

    public double calculateTotalOrder() {
        return ordersList.stream()
                .filter(o -> o.getStatus() == Status.NEW).mapToDouble(Priceable::getPrice).sum();
    }

}
