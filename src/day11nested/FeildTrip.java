package day11nested;

public class FeildTrip {
    public static void main(String[] args) {

     int grade=7;
     String location="";
     String teacher="";
     int numberOfGroup=0;



     if (grade>=0 &&grade<=6) {
     if(grade==1) {
         location = "apple orchard";
         teacher = "ms smith";
         numberOfGroup = 6;
     }else if (grade==2){
         location = "zoo";
         teacher = "ms bond";
         numberOfGroup = 6;
     }else if (grade==3){

         location = "aquarim";
         teacher = "ms reyes";
         numberOfGroup = 2;
     }else if (grade==4){
         location = "musuem";
         teacher = "ms wilson";
         numberOfGroup = 6;
     }else if (grade==5){
         location = "movie";
         teacher = "ms lee";
         numberOfGroup = 3;
     }else if (grade==6){
         location = "six flag";
         teacher = "ms bond";
         numberOfGroup = 10;
     }


         System.out.println("grade"+grade);
         System.out.println("numberOfGroup = " + numberOfGroup);
         System.out.println("location = " + location);
         System.out.println("teacher = " + teacher);
     }else{
         System.out.println("invalid grade");}


     }





    }






