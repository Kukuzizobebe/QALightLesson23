package ua.QALightCourse.Lesson2.IfElseTasks;
/*
 Перевірка числа на парність
 Напишіть програму, яка перевіряє, чи введене число є парним або непарним.
 */
public class FirstTask {
    static void main(String[] args) {
        //Example for even number
        int value = 8;
        if (value % 2 == 0) {
            System.out.println("This is a even number.");
        } else {
            System.out.println("This is a odd number.");
        }
        //Example for odd number
        value = 13;
        if (value % 2 == 0) {
            System.out.println("This is a even number.");
        } else {
            System.out.println("This is a odd number.");
        }

    }
}
