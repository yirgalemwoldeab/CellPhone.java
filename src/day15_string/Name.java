package day15_string;
import java.util.Locale;
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter your name");
        String name=input.next();
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());

    }
}
