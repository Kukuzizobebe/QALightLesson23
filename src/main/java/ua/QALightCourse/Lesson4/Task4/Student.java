package ua.QALightCourse.Lesson4.Task4;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
    }

    public Student(int age, String firstName, String lastName) {
        if (age < 0) {
            throw new IllegalArgumentException(
                    "Incorrect value 'age' for " + firstName + " " + lastName
            );
        }
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}