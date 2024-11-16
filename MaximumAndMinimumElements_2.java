package Assignments_Day1;

public class MaximumAndMinimumElements_2 {

    public static void main(String[] args) {

      int [] numbers = {3,9,1,7,5};

      int maxNumber = numbers[0];
      int minNumber = numbers[0];

      for(int num: numbers){

          if(num > maxNumber){

              maxNumber =  num;
          }

          if(num < minNumber){

              minNumber = num;
          }
      }

      System.out.println("Maxnumber: " + maxNumber);
      System.out.println("Minnumber: " + minNumber);

    }

}
