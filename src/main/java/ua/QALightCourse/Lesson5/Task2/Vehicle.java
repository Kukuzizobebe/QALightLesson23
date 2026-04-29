package ua.QALightCourse.Lesson5.Task2;

public class Vehicle {

    private String name;
    private int speed;

    public Vehicle(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public void move() {
        System.out.println("The vehicle is moving at a speed of " + speed + " km/h.");
    }

    public void stop() {
        System.out.println("The vehicle " + this.name + " stopped!");
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
