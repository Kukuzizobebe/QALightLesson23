package ua.QALightCourse.Lesson3.ArraysTasks;
import java.util.Arrays;
import java.util.Scanner;

//Замінити всі від’ємні елементи масиву на нуль.
public class FouthTask {
    static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = fillSizeOfArray(sc);
            if (size != 0) {
                int[] array = new int[size];
                fillArray(array, sc);
                System.out.print("Array before formatting: " + Arrays.toString(array));
                System.out.println("\nArray after formatting: " + Arrays.toString(findAndReplaceNegativeValueToZero(array)));
            } else {
                System.out.println("You've entered an array size of 0. Please try again.");
            }
        }
    }
    public static int fillSizeOfArray(Scanner sc) {
        System.out.print("Enter array size: ");
        return sc.nextInt();
    }
    public static void fillArray(int[] array, Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element for index " + "[" + i + "]" + ": ");
            array[i] = sc.nextInt();
        }
    }
    public static int[] findAndReplaceNegativeValueToZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }
}
