package ua.QALightCourse.Lesson6.Task;

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
            default -> 0;
        };
    }

    public void printOrderInfo() {
        super.printOrderInfo();
        System.out.println("Type of drink is tea (type: " + type + ")");
    }
}
