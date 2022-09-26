package day10ifstatements;

public class Letter {
    public static void main(String[] args) {
char c='6';
      boolean isLetter=(c>='A'&&c<='Z') || (c>='a'&&c<='z');
        boolean isNumber=c>='0'&&c<='9';

        if(isLetter){
            System.out.println("is a letter " + c);
        }
         if(isNumber) {
             System.out.println("is   Number = " + c);
         }

           if(!isLetter && !isNumber){
               System.out.println("is special character " + c);
           }

              }
    }


