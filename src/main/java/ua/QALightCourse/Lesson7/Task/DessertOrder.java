package ua.QALightCourse.Lesson7.Task;

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
            default -> throw new IllegalArgumentException(dessertName + " isn`t exist!");
        };
    }

    @Override
    public void printOrderInfo() {
        System.out.println("OCN-" + getOrderNumber() + "(" + getStatus() + "): \n[Dessert (" + dessertName + ") \nPrice: " + getPrice() + " UAH.]\n");
    }
}
