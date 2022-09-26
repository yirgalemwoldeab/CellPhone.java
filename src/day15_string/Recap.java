package day15_string;

public class Recap {
    public static void main(String[] args) {

     String first="testing" ;
     first=first.toUpperCase();
        System.out.println(first);

        String second="soft skill";
        second=second.toLowerCase();
        System.out.println(second);


        String third="    hello world  ";


        third=third.trim();
        System.out.println(third);
        System.out.println(third.length());


        String word="telephone";
        int b=word.length()-1;
System.out.println(""+word.substring(0,1) +word.substring(b));


System.out.println(word.substring(1));
        System.out.println(word.substring(0,b));
    }
}
