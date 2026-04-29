package ua.QALightCourse.Lesson10.Task;

public class DuplicateOrderException extends Exception{

    public DuplicateOrderException() {
        super("This order number is exist!");
    }
}
