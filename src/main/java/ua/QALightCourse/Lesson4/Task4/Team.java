package ua.QALightCourse.Lesson4.Task4;

import java.util.Arrays;

public class Team {
    private String teamName;
    private Student[] students = new Student[0];

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addStudentToTeam(Student newStudent) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = newStudent;
    }

    public void printTeam() {
        System.out.println("Team: " + teamName);
        for (Student student : students) {
            System.out.println(student.getFullName());
        }
    }
}
