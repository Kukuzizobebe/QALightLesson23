package ua.QALightCourse.Lesson5.Task3;

/*Створіть базовий клас Media з полями:
title (String) і duration (int) (тривалість у хвилинах), і
методом play() (виводить "Відтворення мультимедіа").
Створіть підкласи:
Music: додає поле artist (String) і метод play() (виводить "Відтворюється музика [artist]: [title]").
Video: додає поле resolution (String) (наприклад, "1920x1080") і метод play() (виводить "Відтворюється відео [title] в роздільній здатності [resolution]").
Створіть об'єкти для кожного класу і викличте метод play() для демонстрації поліморфізму.*/
public class MediaDemo {

    static void main(String[] args) {

        System.out.println("\nInformation about media:");
        Media media = new Media(25,"Test");
        media.play();

        System.out.println("\nInformation about music:");
        Music centuries = new Music("Centuries",3,"Fall out boy");
        centuries.play();

        System.out.println("\nInformation about video:");
        Video guideJava = new Video("Java Guide",20,"1920X800");
        guideJava.play();
    }
}
