package Assignments_Day1;

import java.util.Arrays;

public class RemoveElementsFromAnArray_6 {

    public static void main(String[] args) {

        char[] alphabets = {'a', 'b', 'c', 'd', 'e'};
        char elementToRemove = 'c';

        char[] newArray = new char[alphabets.length - 1];


        int j = 0;
        for (int i = 0; i < alphabets.length; i++) {

                    if (alphabets[i] != elementToRemove) {

                        newArray[j++] = alphabets[i]; // Copy elements to the new array
                    }
                }


                System.out.println("Array after removal: " + Arrays.toString(newArray));
            }
        }






