package ua.QALightCourse.Lesson3.ArraysTasks;
import java.util.Arrays;
import java.util.Scanner;
//Знайти суму всіх елементів масиву.
public class FirstTask {
    static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           int size = fillSizeOfArray(sc);
            if (size != 0) {
                int[] array = new int[size];
                fillArray(array, sc);
                System.out.print("Array: " + Arrays.toString(array));
                System.out.println("\nSum of array elements is equals: " + sumOfElementsInArray(array));
            } else {
                System.out.println("You've entered an array size of 0. Please try again.");
            }
        }
    }
    public static int fillSizeOfArray(Scanner sc)
    {
        System.out.print("Enter array size: ");
        return sc.nextInt();
    }
    public static void fillArray(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element for index " + "[" + i + "]" + ": ");
            array[i] = sc.nextInt();
        }
    }
    public static int sumOfElementsInArray(int[] array) {
        int sumOfElements = 0;
        for (int element : array) {
            sumOfElements += element;
        }
        return sumOfElements;
    }
}
