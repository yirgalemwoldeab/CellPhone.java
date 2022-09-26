package day18loop;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {

      Scanner input=new Scanner(System.in) ;
      boolean run=true;
        System.out.println("bot is awake");
      while(run){
          System.out.println("enter your message");
          String msg=input.nextLine();

          switch (msg) {
              case "hello":
                  System.out.println("how are you\n shut down");
                  break;
              case "what is your age":
                  System.out.println("i was programmed in july");

                  break;
              case "what do you like":
                  System.out.println(" i like java");
                  break;

              default:
                  System.out.println("sorry, i didnot get that");
break;
              case "shutdown":
                  run=false;


          }
      }



    }
}
