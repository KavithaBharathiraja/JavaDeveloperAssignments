package Assignments_Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingArrayList_8 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 6, 8, 7, 1};

        ArrayList<Integer> arraylist = new ArrayList<>();

        for (int num : numbers) {

            arraylist.add(num);
        }
        Collections.sort(arraylist);

        System.out.println("Sorted ArrayList: " + arraylist);
    }
}



