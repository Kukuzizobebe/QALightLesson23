package ua.QALightCourse.Lesson5.Task2;

/*Створіть базовий клас Vehicle з полями:
name (String), speed (int) і
методами:
move() (виводить "Транспорт рухається зі швидкістю X км/год") і
stop() (виводить "Транспорт [name] зупинився").
Створіть підкласи:
Car: додає поле passengerCapacity (int) (місткість пасажирів).
Truck: додає поле loadCapacity (double) (вантажопідйомність у тоннах).
Напишіть програму, яка створює об'єкти для кожного класу, задає їхні параметри, і демонструє роботу методів move() та stop().
Для класу Car метод move повинен виводити у консоль – “Транспорт [name] рухається зі швидкістю X км/год з [passengerCapacity] кількістю людей”
Для Track метод move() повинен виводити у консоль – “ Транспорт [name] за вантажопідйомністю [loadCapacity] рухається зі швидкістю X км/год”*/
public class VehicleDemo {
    static void main(String[] args) {

        System.out.println("\nInformation about vehicle:");
        Vehicle vehicle = new Vehicle(200,"Test");
        vehicle.move();
        vehicle.stop();

        System.out.println("\nInformation about car:");
        Car audi = new Car(220, "Audi", 4);
        audi.move();
        audi.stop();

        System.out.println("\nInformation about truck:");
        Truck mercedez = new Truck(150, "Mercedes-Benz", 2582.5);
        mercedez.move();
        mercedez.stop();
    }
}
