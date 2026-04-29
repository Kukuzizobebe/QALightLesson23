package ua.QALightCourse.Lesson4.Task3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException(
                    "Incorrect value 'radius'"
            );
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void printResults() {
        System.out.println("Area equals: " + Math.ceil(getArea()) + ", length equals: " + Math.ceil(getCircumference()));
    }
}
