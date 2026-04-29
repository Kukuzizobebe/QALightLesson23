package ua.QALightCourse.Lesson4.Task3;

/*
Створіть клас Circle з полем радіус (private).
Додайте методи для обчислення площі та довжини кола.
Створіть масив з кількох кіл, виведіть їх площі та довжини.*/
public class CircleDemo {
    static void main(String[] args) {
        Circle[] circles = {
                new Circle(12),
                new Circle(1),
        };
        printResultsForCircles(circles);
    }

    public static void printResultsForCircles(Circle[] circles) {
        int index = 0;
        for (Circle circle : circles) {
            System.out.print("Results for circle[" + index + "]: ");
            circle.printResults();
            index++;
        }
    }
}
