package Assignments_Day1;

public class FindDuplicates_3 {

    public static void main(String[] args) {

        String [] fruit = {"apple", "banana", "apple", "cherry", "banana"};

        System.out.println("Duplicate Furits: ");

        for( int i=0; i< fruit.length; i++){

            for (int j = i+1; j < fruit.length; j++) {

               if(fruit[i].equals(fruit[j])){

                   System.out.println(fruit[i]);
               }

            }
        }
    }

}
