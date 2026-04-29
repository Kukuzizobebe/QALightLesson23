package ua.QALightCourse.Lesson5.Task1;

/*Створіть базовий клас Animal із загальними методами: eat() і sleep(), які виводять відповідні повідомлення ("Я їм" / "Я сплю").
Створіть підкласи:
Bird: додає метод fly() (виводить "Я літаю").
Fish: додає метод swim() (виводить "Я плаваю").
Dog: додає метод bark() (виводить "Гав-гав").
В методі main створіть об`єкти цих класів і використайте їхні методи.*/
public class AnimalDemo {
    static void main(String[] args) {
        System.out.println("\nActions for animal:");
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println("\nActions for bird:");
        Bird parrot = new Bird();
        parrot.eat();
        parrot.sleep();
        parrot.fly();

        System.out.println("\nActions for dog:");
        Dog pitbull = new Dog();
        pitbull.eat();
        pitbull.sleep();
        pitbull.bark();

        System.out.println("\nActions for fish:");
        Fish goldfish = new Fish();
        goldfish.eat();
        goldfish.sleep();
        goldfish.swim();
    }
}
