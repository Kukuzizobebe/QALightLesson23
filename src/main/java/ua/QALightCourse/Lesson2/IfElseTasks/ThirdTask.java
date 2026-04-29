package ua.QALightCourse.Lesson2.IfElseTasks;
/*
Перевірка на позитивність/негативність
Введіть число та визначте, чи воно позитивне, негативне чи нуль.
*/
public class ThirdTask {
    static void main(String[] args) {
        //Example for number > 0
        int number = 1;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero");
        }
        //Example for number < 0
        number = -1;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero");
        }
        //Example for number == 0
        number = 0;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero");
        }

    }
}
