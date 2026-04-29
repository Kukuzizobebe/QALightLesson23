package ua.QALightCourse.Lesson9.Task;

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

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
