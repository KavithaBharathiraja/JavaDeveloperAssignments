package Assignments_Day1;

import java.util.ArrayList;

public class ArrayListSizeAndEmptyCheck_10 {

    public static void main(String[] args) {

        ArrayList<String>  languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        if(languages.isEmpty()){

            System.out.println("The ArrayList is empty");

        }else {

            System.out.println("The ArrayList is not empty.");
            System.out.println("Size of ArrayList: " + languages.size());
            System.out.println("Elements in ArrayList: " + languages);
        }

    }

}
