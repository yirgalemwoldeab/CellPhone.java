package day12;

public class minutes {
    public static void main(String[] args) {

        int minute=-8;


        if(minute<0 || minute>90) {

            System.out.println("is not valid");
            if (minute < 0) {
                System.out.println("minutes can not be a negative number");
            } else if (minute > 90) {
                System.out.println("games can not be more than 90 minutes");
            }
        }
            if (minute >= 0 && minute <= 90) {
              if (minute >= 75 && minute <= 90) {
                    System.out.println("just getting started");
                } else if (minute >= 60 && minute <= 74) {
                    System.out.println("just getting started");
                } else if (minute >= 30 && minute <= 59) {
                    System.out.println("the middle of the game is going great");
                } else if (minute >= 0 && minute <= 29) {
                    System.out.println("the end of the same is approaching");}

            }
        }
        }

   // declare and assign a minutes variable
    //use the minutes value to determine how much time is left in the soccer
//game
       // use these ranges to determine the outputs:
       // - any number less than 0 and more than 90 are not valid:
       // when the minutes is less than 0:
       // print: minutes cannot be a negative number
       // when the minutes is more than 90:
       // print: games cannot be longer than 90 minutes
        //- when the minutes are between 90 - 75
       // print: just getting started
        //- when the minutes are between 74 - 60
       // print: players are doing their best
       // - when the minutes are between 59 - 30
      //  print: middle of the game is going great
       // - when the minutes are between 29 - 0
      //  print: the end of the same is approaching