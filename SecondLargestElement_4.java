package Assignments_Day1;

public class SecondLargestElement_4 {

    public static void main(String[] args) {

      int []  numbers = {45, 76, 34, 89, 76};

      int largestElement = Integer.MIN_VALUE;
      int secondLargestElement = Integer.MIN_VALUE;

     for(int num : numbers){

         if(num > largestElement){
             secondLargestElement = largestElement;
             largestElement = num;
         }

     }
        System.out.println("SecondLargestElement: " + secondLargestElement);

    }

}
