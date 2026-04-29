package ua.QALightCourse.Lesson6.Task;

public abstract class Order {

    private int orderNumber;

    public Order(int orderNumber) {
        this.orderNumber += orderNumber;
    }

    public abstract double getPrice();

    public void printOrderInfo() {
        System.out.println("Order number: OCN-" + orderNumber);
    }
}
