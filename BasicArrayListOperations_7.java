package Assignments_Day1;

import java.util.ArrayList;

public class BasicArrayListOperations_7 {

    public static void main(String[] args) {
     //"John", "Emma", "Ava", "Liam", "Olivia"

        ArrayList <String> names = new ArrayList<>();
        names.add("John");
        names.add("Emma");
        names.add("Ava");
        names.add("Liam");
        names.add("Olivia");

        //names.remove(1);
        //names.remove(3);
        names.subList(1, 3).clear();

       System.out.println(names);

    }



}
