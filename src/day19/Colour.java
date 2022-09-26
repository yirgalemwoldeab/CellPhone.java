package day19;

import java.util.Scanner;

public class Colour {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int numOfCOLORS=0;
       String color="" ;
       while (numOfCOLORS<3){
           System.out.println("enter the color");
           String inputColor=input.nextLine().toLowerCase();
           if (!color.contains(inputColor)){
               color+=" "+inputColor;

               numOfCOLORS++;
           }

           System.out.println(color);
           }
       }




    }

