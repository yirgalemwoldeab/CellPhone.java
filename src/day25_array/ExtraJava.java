package day25_array;
import java.util.Arrays;
public class ExtraJava {
    public static void main(String[] args) {
        String[] strs = {"hello", "world", "monday", "java"};
        System.out.println(Arrays.toString(strs));
        System.out.println(String.join("#", strs));
        System.out.println(String.join(" ", strs));
        System.out.println(String.join(" MIDDLE ", strs));

        int [] aa = new int[]{1, 5, 2, 5}; // another syntax to create an array
        System.out.println(Arrays.toString(aa));
        // normally used when you don't need a reference
        System.out.println(Arrays.toString(new int[]{3,5,2,6})); // creates array, prints, doesn't have a reference to it after in the program


    }
}
