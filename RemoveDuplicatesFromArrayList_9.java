package Assignments_Day1;

import java.util.ArrayList;

public class RemoveDuplicatesFromArrayList_9 {

    public static void main(String[] args) {

        String [] fruits = {"apple", "banana", "apple", "cherry"};

        ArrayList<String> arrayList = new ArrayList<>();

        for(String fruit : fruits){;

            if(!arrayList.contains(fruit)){
                arrayList.add(fruit);
            }
        }

        System.out.println("ArrayList after removing duplicates: "+ arrayList);
    }

}
