package ua.QALightCourse.Lesson3.ArraysTasks;
import java.util.Arrays;
import java.util.Scanner;
//Підрахувати, скільки разів у масиві зустрічається задане число (ввести число з клавіатури via Scanner).
public class FifthTask {
    static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size = fillSizeOfArray(sc);
            int targetNumber = fillEnteredNumber(sc);
            if (size != 0) {
                int[] array = new int[size];
                fillArray(array, sc);
                System.out.print("Array: " + Arrays.toString(array));
                System.out.println("\nHow many numbers " + "'" + targetNumber + "'" + " in our array: " + countOfTargetNumberInArray(array, targetNumber));
            } else {
                System.out.println("You've entered an array size of 0. Please try again.");
            }
        }
    }
    public static int fillEnteredNumber(Scanner sc) {
        System.out.print("Enter number for search in array: ");
        return sc.nextInt();
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
    public static int countOfTargetNumberInArray(int[] array, int targetNumber) {
        int counter = 0;
        for (int element : array) {
            if (element == targetNumber) {
                counter++;
            }
        }
        return counter;
    }

}
