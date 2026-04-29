package ua.QALightCourse.Lesson2.LoopsTasks;

/*
Сума чисел від 1 до N
Введіть число N та знайдіть суму всіх чисел від 1 до N.
*/
public class SecondTask {
    static void main(String[] args) {
        int N = 5;
        int sumOfNumbers = 0;
        System.out.println("Number N equals: "+ N );
        for (int i = 0; i < N; i++) {
            sumOfNumbers+=i;
        }
        System.out.println("Sum of numbers equals " + sumOfNumbers);
//        int i = 1;
//        while (i<N)
//        {
//            sumOfNumbers+=i;
//            i++;
//        }
//        System.out.println("Sum of numbers equals " + sumOfNumbers);
//        int i = 1;
//        do{
//            sumOfNumbers+=i;
//            i++;
//        }
//        while (i<N);
//        System.out.println("Sum of numbers equals " + sumOfNumbers);

    }
}
