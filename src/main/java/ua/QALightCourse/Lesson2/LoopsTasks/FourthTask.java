package ua.QALightCourse.Lesson2.LoopsTasks;

/*
   Таблиця множення для числа 5
   Виведіть таблицю множення для числа 5 (від 1 до 10).
   Очікую побачити в консолі:
   5 x 1 = 5
   5 x 2 = 10
   5 x 3 = 15
   5 x 4 = 20
   5 x 5 = 25
   5 x 6 = 30
   5 x 7 = 35
   5 x 8 = 40
   5 x 9 = 45
   5 x 10 = 50
*/
public class FourthTask {
    static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = "+(number*i));
        }
//        int i = 1;
//        int number = 5;
//        while (i<=10)
//        {
//            System.out.println(number + " x " + i + " = "+(number*i));
//            i++;
//        }

//        int i = 1;
//        int number = 5;
//        do {
//            System.out.println(number + " x " + i + " = " + (number * i));
//            i++;
//        }
//        while (i <= 10);
    }
}
