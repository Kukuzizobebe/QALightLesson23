package ua.QALightCourse.Lesson4.Task1;
/*Створіть клас Student з полями: ім'я, прізвище, вік.
Додайте конструктор, гетери/сетери.
Додайте метод, який повертає повне ім'я студента.
Створіть у main масив з 5 студентів, виведіть їх повні імена.*/
public class StudentDemo {
    static void main(String[] args) {

        Student[] students = {
                new Student(25, "Andrii", "Rud"),
                new Student(24, "Stas", "Stasovich"),
                new Student(),
                new Student(6, "Elisa", "Elisovna"),
                new Student("Kateryna", "Katerinovna"),
        };
        for (Student student : students) {
            System.out.println(student.getFullName());
        }
    }
}
