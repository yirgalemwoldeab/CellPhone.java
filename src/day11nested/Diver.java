package day11nested;

public class Diver {
    public static void main(String[] args) {

    int tank=60;
    String message="";
    if (tank>=90){
         message="your tank is full";}
        else if(tank>=80){
            message="still ok";}
            else if(tank>=70){
                message="do not go far" ;}
    else if(tank>=60){
        message="start to go head back" ;}

        System.out.println(message);
        }

    }






