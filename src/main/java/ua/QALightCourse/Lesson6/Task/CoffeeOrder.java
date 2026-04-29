package ua.QALightCourse.Lesson6.Task;

public class CoffeeOrder extends Order {

    private String size;

    public CoffeeOrder(int orderNumber, String size) {
        super(orderNumber);
        this.size = size;
    }

    @Override
    public double getPrice() {
        return switch (size.toUpperCase()) {
            case "SMALL" -> 20.0;
            case "MEDIUM" -> 35.0;
            case "LARGE" -> 50.0;
            default -> 0;
        };
    }

    @Override
    public void printOrderInfo() {
        super.printOrderInfo();
        System.out.println("Type of drink is coffee (size: " + size + ")");
    }
}
