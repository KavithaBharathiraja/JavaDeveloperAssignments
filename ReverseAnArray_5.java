package Assignments_Day1;

import java.util.Arrays;

public class ReverseAnArray_5 {

    public static void main(String[] args) {

        String [] animals = {"cat", "dog", "bird", "fish"};
        String [] reversedArray = new String[animals.length];

        for(int i =0 ; i< animals.length; i++){

            reversedArray[i] =  animals[animals.length-1-i];
        }

      System.out.println("ReversedArray: " +Arrays.toString(reversedArray));

    }
}
