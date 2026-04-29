package ua.QALightCourse.Lesson10.Task;

import java.util.EnumSet;
import java.util.Set;

public abstract class Order implements Priceable, Printable {

    private final int orderNumber;

    private Status status;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.status = Status.NEW;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) throws InvalidOrderStatusException {

        Set<Status> setOfAllowedStatuses = EnumSet.of(Status.NEW, Status.CANCELED, Status.COMPLETED);
        setOfAllowedStatuses.stream()
                .filter(s -> s.equals(status))
                .findFirst()
                .orElseThrow(InvalidOrderStatusException::new);
        this.status = status;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "orderNumber=" + orderNumber +
                ", status=" + status +
                '}';
    }
}
