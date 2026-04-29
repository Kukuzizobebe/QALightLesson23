package ua.QALightCourse.Lesson11.Task;

import java.util.ArrayList;
import java.util.List;

public class FirstVersionOfPrintList {

    static void main(String[] args) {

        List<Integer> listOfIntegers = List.of(1, 2, 3, 4, 5);
        for (int i = 0; i < listOfIntegers.size(); i++) {
            System.out.println(listOfIntegers.get(i));
        }
    }
}
