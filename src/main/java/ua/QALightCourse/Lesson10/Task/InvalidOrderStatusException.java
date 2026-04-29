package ua.QALightCourse.Lesson10.Task;

public class InvalidOrderStatusException extends Exception{

    public InvalidOrderStatusException() {
        super("Status`s not valid!");
    }
}
