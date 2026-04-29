package ua.QALightCourse.Lesson5.Task2;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(int speed, String name, double loadCapacity) {
        super(speed, name);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("The vehicle " + getName() + " by load capacity " + loadCapacity + " is moving at a speed of " + getSpeed() + " km/h.");
    }
}
