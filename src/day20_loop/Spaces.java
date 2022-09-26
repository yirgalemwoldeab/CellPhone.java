package day20_loop;

public class Spaces {
    public static void main(String[] args) {


        String s = "java";
        String result="";

        for (int i = 0; i < s.length(); i++) {
char letter=s.charAt(i);

       if (letter ==' '){

           result += "  " ;

            }  else {
    result+=letter+" ";
            }
        }
        System.out.println(result.trim());


     //   for (int i = 0; i < s.length(); i++) {


         //   System.out.print(   s.charAt(i) +""+" ");



    }

}