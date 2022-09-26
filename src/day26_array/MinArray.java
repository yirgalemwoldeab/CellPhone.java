package day26_array;

public class MinArray {
    public static void main(String[] args) {


      // /* Given a 2D int array find the max and min number from the whole array

       int[][] num= {
               {1, 5, 2, 23},
               {-12, 41, -5, -2},
               {1, 5, 1, 5}
       };
        int maximum=0;

      //  Max: 41
      //  Min -12

      //  Extra: Find the max and min between each inner array

for(int[] eachInner:num){
  int max=0;
  int min=0;


  for(int eachNum:eachInner){
      if(eachNum>max){
          max=eachNum;

if(max>maximum)
maximum=max;

       }
      }


  }
        System.out.println(maximum);

}


   }
