package day17;

public class PrintLetter {
    public static void main(String[] args) {

     char first='a'   ;
     while (first<='z'){
         System.out.print(first++);

     }
        System.out.println();
char backward='z';
     while (backward>='a'){
         System.out.print(backward--);
     }
    }
}
