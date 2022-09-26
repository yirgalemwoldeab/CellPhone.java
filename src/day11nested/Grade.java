package day11nested;

public class Grade {
    public static void main(String[] args) {
   int score=82;
   if (score>=75){
       System.out.println("passed");

       if (score>92){
           System.out.println("you did very well");
       }else if(score>80){
           System.out.println("good job");

       }else {
           System.out.println("no bad");
       }




   }else {
       System.out.println("failed");
       if (score > 50){
           System.out.println("try harder");


       }else {
           System.out.println("study much more");
       }
   }



    }





}
