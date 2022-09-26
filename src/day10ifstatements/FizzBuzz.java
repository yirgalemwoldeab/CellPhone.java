package day10ifstatements;

public class FizzBuzz {

    public static void main(String[] args) {
     int num=4;


     if( num%3==0){


         System.out.println("fizz");

     }


       else if( num%5==0){
            System.out.println("buzz");

        }

        else if( num % 3==0 && num % 5==0){

            System.out.println("fizz buzz");

        }
else{

    System.out.println(num);}


    }
}
