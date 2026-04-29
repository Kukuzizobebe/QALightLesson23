package ua.QALightCourse.Lesson4.Task4;
/*Створіть клас Team, який містить масив об'єктів Student.
Додайте метод для додавання студента в команду.
Додайте метод для виводу списку студентів.
Створіть команду, додайте студентів, виведіть список.*/
public class TeamDemo {
    static void main(String[] args) {
        Student[] students = {
                new Student(25, "Andrii", "Rud"),
                new Student(24, "Stas", "Stasovich"),
                new Student(),
                new Student(6, "Elisa", "Elisovna"),
                new Student("Kateryna", "Katerinovna"),
        };
        Team redTeam = new Team("Red team");
        addStudentsToTeam(students,redTeam);
        redTeam.printTeam();
    }
    public static void addStudentsToTeam(Student[] students, Team team)
    {
        for (Student student : students) {
            team.addStudentToTeam(student);
        }
    }
}
