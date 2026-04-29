package ua.QALightCourse.Lesson9.Task;

public class TeaOrder extends Order {

    private String type;

    public TeaOrder(int orderNumber, String type) {
        super(orderNumber);
        this.type = type;
    }

    @Override
    public double getPrice() {
        return switch (type) {
            case "Black" -> 15.0;
            case "Green" -> 20.0;
            case "Herbal" -> 21.0;
            default -> throw new IllegalArgumentException(type + " isn`t exist!");
        };
    }

    public void printOrderInfo() {
        System.out.println("\nOCN-" + getOrderNumber() + "(" + getStatus() + "): \n[Tea (type: " + type + ") \nPrice: " + getPrice() + " UAH.]");
    }
}
