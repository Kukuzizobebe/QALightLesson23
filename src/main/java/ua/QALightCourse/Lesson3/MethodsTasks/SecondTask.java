package ua.QALightCourse.Lesson3.MethodsTasks;
import java.util.Scanner;
/*(Використовувати оператори if-else-if)
 Користувач вводить з клавіатури числа: Якщо число дорівнює 1, виведення на консоль “Понеділок”;
 Якщо число дорівнює 2, виведення на консоль “Вівторок”; Якщо число дорівнює 3, виведення на консоль “Середа”;
 Якщо число дорівнює 4, виведення на консоль “Четвер”; Якщо число дорівнює 5, виведення на консоль “П'ятниця”;
 Якщо число дорівнює 6, виведення на консоль “Субота”; Якщо число дорівнює 7, то виведення на консоль "Неділя";
 В іншому випадку виводимо текст: "Краще б сьогодні була п'ятниця".*/
public class SecondTask {
    static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            chooseYourDayOfWeek(sc);
        }
    }
    public static void chooseYourDayOfWeek(Scanner sc)
    {
        System.out.print("Enter number for choose your day of week: ");
        int dayNumber = sc.nextInt();
        if(dayNumber == 1)
        {
            System.out.println("Понеділок");
        } else if (dayNumber == 2) {
            System.out.println("Вівторок");
        }
        else if (dayNumber == 3) {

            System.out.println("Середа");
        }
        else if (dayNumber == 4) {
            System.out.println("Четвер");
        }
        else if (dayNumber == 5) {
            System.out.println("П'ятниця");
        }
        else if (dayNumber == 6) {
            System.out.println("Субота");
        }
        else if (dayNumber == 7) {
            System.out.println("Неділя");
        }
        else {
            System.out.println("Краще б сьогодні була п'ятниця");
        }
    }
}
