package ua.QALightCourse.Lesson2.IfElseTasks;
/*
Визначення найбільшого з двох чисел
Введіть два числа та виведіть, яке з них більше (або повідомте, що вони рівні).
*/
public class SecondTask {
    static void main(String[] args) {
        //Example, when first number is greater than second number
        int firstNumber = 28;
        int secondNumber = 12;
        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than second number.");
        } else if (secondNumber > firstNumber) {
            System.out.println("The second number is greater than first number.");
        } else {
            System.out.println("Numbers are equals.");
        }
        //Example, when second number is greater than first number
        firstNumber = 12;
        secondNumber = 28;
        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than second number.");
        } else if (secondNumber > firstNumber) {
            System.out.println("The second number is greater than first number.");
        } else {
            System.out.println("Numbers are equals.");
        }
        //Example, when numbers are equals
        firstNumber = 28;
        secondNumber = 28;
        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than second number.");
        } else if (secondNumber > firstNumber) {
            System.out.println("The second number is greater than first number.");
        } else {
            System.out.println("Numbers are equals.");
        }

    }
}
