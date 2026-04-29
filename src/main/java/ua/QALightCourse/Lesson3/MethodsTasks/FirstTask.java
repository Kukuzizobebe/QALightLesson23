package ua.QALightCourse.Lesson3.MethodsTasks;
import java.util.Scanner;
/*Користувач вводить з клавіатури три цілі значення.
 На екран виводиться інформація, чи можна з цих сторін побудувати трикутник.
 (Необхідно згадати правило побудови трикутника з трьох сторін).*/
public class FirstTask {
    static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstSide = fillSide(sc);
            int secondSide = fillSide(sc);
            int thirdSide = fillSide(sc);
            if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
                System.out.println("Sides cannot be zero or negative value.");
            } else {
                System.out.println("Can we create a triangle: " + isTriangle(firstSide, secondSide, thirdSide));
            }
        }
    }
    public static int fillSide(Scanner sc) {
        System.out.print("Enter value for side of triangle: ");
        return sc.nextInt();
    }
    public static boolean isTriangle(int firstSide, int secondSide, int thirdSide) {
        return firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                secondSide + thirdSide > firstSide;
    }
}
