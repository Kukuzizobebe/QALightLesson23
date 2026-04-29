package ua.QALightCourse.Lesson3.MethodsTasks;
import java.util.Scanner;
/* Використовуючи оператор switch(or if else) написати програму, яка виводить на консоль посилання для завантаження програми.
З вибору програм взяти: IntelliJ IDEA, Git, Java. З вибору ОС взяти: Linux, MacOS, Windows. Програма повинна запитати користувача, яка програма йому цікава, також запитати яку ОС він використовує,
а після вивести в консоль необхідне посилання. Якщо програма з такою назвою не іcнує виводить повідомлення в консоль, про те, що такої програми не існує. Якщо зазначеної користувачем ОС немає, виводиться повідомлення в консоль,
що такої ОС немає.*/
public class ThirdTask {

    static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            chooseSoftware(sc);
        }
    }
    public static void chooseSoftware(Scanner sc) {
        System.out.print("Enter the software: ");
        String nameOfSoftware = sc.nextLine();
        switch (nameOfSoftware) {
            case "IntelliJ IDEA" -> {
                System.out.print("Enter OS: ");
                String nameOfOS = sc.nextLine();
                switch (nameOfOS) {
                    case "Linux" -> System.out.println("https://www.jetbrains.com/idea/download/?section=linux");
                    case "MacOS" -> System.out.println("https://www.jetbrains.com/idea/download/?section=mac");
                    case "Windows" -> System.out.println("https://www.jetbrains.com/idea/download/?section=windows");
                    default -> System.out.println("OS doesn`t exist.");
                }
            }
            case "Git" -> {
                System.out.print("Enter OS: ");
                String nameOfOS = sc.nextLine();
                switch (nameOfOS) {
                    case "Linux" -> System.out.println("https://git-scm.com/install/linux");
                    case "MacOS" -> System.out.println("https://git-scm.com/install/mac");
                    case "Windows" -> System.out.println("https://git-scm.com/install/windows");
                    default -> System.out.println("OS doesn`t exist.");
                }
            }
            case "Java" -> {
                System.out.print("Enter OS: ");
                String nameOfOS = sc.nextLine();
                switch (nameOfOS) {
                    case "Linux" -> System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk26-linux");
                    case "MacOS" -> System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk26-mac");
                    case "Windows" -> System.out.println("https://www.oracle.com/java/technologies/downloads/#jdk26-windows");
                    default -> System.out.println("OS doesn`t exist.");
                }
            }
            default -> System.out.println("Software doesn`t exist");
        }
    }
}
