package ua.QALightCourse.Lesson10.Task;

public class NoOrdersException extends Exception{
    public NoOrdersException() {
        super("The list of orders is empty!");
    }
}
