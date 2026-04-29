package ua.QALightCourse.Lesson10.Task;

public class OrderNotFoundException extends Exception{

    public OrderNotFoundException() {
        super("Order`s not found!");
    }
}
