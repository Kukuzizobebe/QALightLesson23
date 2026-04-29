package ua.QALightCourse.Lesson6.Task;

public class DessertOrder extends Order {

    private String dessertName;

    public DessertOrder(int orderNumber, String dessertName) {
        super(orderNumber);
        this.dessertName = dessertName;
    }

    @Override
    public double getPrice() {
        return switch (dessertName.toUpperCase()) {
            case "PANCAKES" -> 25.0;
            case "CAKE" -> 50.0;
            case "CANDIES" -> 36.0;
            default -> 0;
        };
    }

    @Override
    public void printOrderInfo() {
        super.printOrderInfo();
        System.out.println("Dessert (" + dessertName + ")");
    }
}
