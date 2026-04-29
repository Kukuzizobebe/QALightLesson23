package ua.QALightCourse.Lesson2.LoopsTasks;

/*
Вивести парні числа від 1 до 20
Виведіть всі парні числа від 1 до 20.
*/
public class ThirdTask {
    static void main(String[] args) {
        System.out.print("Even numbers: ");
        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nOdd numbers: ");
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
//        System.out.print("Even numbers: ");
//        int i = 1;
//        while (i < 20) {
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        }
//        System.out.print("\nOdd numbers: ");
//        i = 1;
//        while (i < 20) {
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        }
//
//        System.out.print("Even numbers: ");
//        int i = 1;
//        do{
//            if (i % 2 == 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        }
//        while (i < 20);
//        System.out.print("\nOdd numbers: ");
//        i = 1;
//        do{
//            if (i % 2 != 0) {
//                System.out.print(i + " ");
//            }
//            i++;
//        }
//        while (i < 20);
    }
}
