package ua.QALightCourse.Lesson5.Task2;

public class Car extends Vehicle {

    private int passengerCapacity;

    public Car(int speed, String name, int passengerCapacity) {
        super(speed, name);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("The vehicle " + getName() + " is moving at a speed of " + getSpeed() + " km/h and has " + passengerCapacity + " passengers on the board.");
    }
}
