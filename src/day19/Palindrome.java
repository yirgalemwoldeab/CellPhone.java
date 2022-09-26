package day19;

public class Palindrome {
    public static void main(String[] args) {

    //if string read from back and forward the same
    String word="racecar" ;
    String reverse="";
    String palindrome="" ;
     for (int i=word.length()-1;i>=0;i--) {
         System.out.println(word.charAt(i));

         reverse+=word.charAt(i);
     }
     if (word.equals(reverse)){
         System.out.println("palindrome");
     }else{
         System.out.println("not palindrome");
     }



    }
}
