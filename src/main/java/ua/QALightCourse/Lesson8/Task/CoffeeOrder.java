package ua.QALightCourse.Lesson8.Task;

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
            default -> throw new IllegalArgumentException(size + " isn`t exist!");
        };
    }

    @Override
    public void printOrderInfo() {
        System.out.println("\nOCN-" + getOrderNumber() + "(" + getStatus() + "): \n[Coffee (size: " + size + ") \nPrice: " + getPrice() + " UAH.]");
    }
}
