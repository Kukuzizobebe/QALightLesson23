package ua.QALightCourse.Lesson2.IfElseTasks;

/*
 Оцінка за балами
   Введіть бал (від 0 до 100) та виведіть оцінку:
   90-100: "Відмінно"
   70-89: "Добре"
   50-69: "Задовільно"
   0-49: "Не задовільно"
 */
public class FourthTask {
    static void main(String[] args) {
        //Example for 90-100: "Відмінно"
        int mark = 100;
        if (mark >= 90 && mark <= 100) {
            System.out.println("Your mark between 90-100: \"Відмінно\"");
        } else if (mark >= 70 && mark <= 89) {
            System.out.println("Your mark between 70-89: \"Добре\"");
        } else if (mark >= 50 && mark <= 69) {
            System.out.println("Your mark between 50-69: \"Задовільно\"");
        } else if (mark >= 0 && mark <= 49) {
            System.out.println("Your mark between 0-49: \"Не задовільно\"");
        } else {
            System.out.println("Your mark isn`t correct.");
        }
        //Example for 70-89: "Добре"
        mark = 74;
        if (mark >= 90 && mark <= 100) {
            System.out.println("Your mark between 90-100: \"Відмінно\"");
        } else if (mark >= 70 && mark <= 89) {
            System.out.println("Your mark between 70-89: \"Добре\"");
        } else if (mark >= 50 && mark <= 69) {
            System.out.println("Your mark between 50-69: \"Задовільно\"");
        } else if (mark >= 0 && mark <= 49) {
            System.out.println("Your mark between 0-49: \"Не задовільно\"");
        } else {
            System.out.println("Your mark isn`t correct.");
        }
        //Example for 50-69: "Задовільно"
        mark = 57;
        if (mark >= 90 && mark <= 100) {
            System.out.println("Your mark between 90-100: \"Відмінно\"");
        } else if (mark >= 70 && mark <= 89) {
            System.out.println("Your mark between 70-89: \"Добре\"");
        } else if (mark >= 50 && mark <= 69) {
            System.out.println("Your mark between 50-69: \"Задовільно\"");
        } else if (mark >= 0 && mark <= 49) {
            System.out.println("Your mark between 0-49: \"Не задовільно\"");
        } else {
            System.out.println("Your mark isn`t correct.");
        }
        //Example for 0-49: "Не задовільно"
        mark = 5;
        if (mark >= 90 && mark <= 100) {
            System.out.println("Your mark between 90-100: \"Відмінно\"");
        } else if (mark >= 70 && mark <= 89) {
            System.out.println("Your mark between 70-89: \"Добре\"");
        } else if (mark >= 50 && mark <= 69) {
            System.out.println("Your mark between 50-69: \"Задовільно\"");
        } else if (mark >= 0 && mark <= 49) {
            System.out.println("Your mark between 0-49: \"Не задовільно\"");
        } else {
            System.out.println("Your mark isn`t correct.");
        }
        //Example for incorrect mark.
        mark = -1;
        if (mark >= 90 && mark <= 100) {
            System.out.println("Your mark between 90-100: \"Відмінно\"");
        } else if (mark >= 70 && mark <= 89) {
            System.out.println("Your mark between 70-89: \"Добре\"");
        } else if (mark >= 50 && mark <= 69) {
            System.out.println("Your mark between 50-69: \"Задовільно\"");
        } else if (mark >= 0 && mark <= 49) {
            System.out.println("Your mark between 0-49: \"Не задовільно\"");
        } else {
            System.out.println("Your mark isn`t correct.");
        }

    }
}
