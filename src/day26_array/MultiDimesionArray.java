package day26_array;

import java.util.Arrays;

public class MultiDimesionArray {
    public static void main(String[] args) {
        char[] upper={'R','J','A'};
        char[] lower={'p','z','q','e'};
        char[] other={'4','#','*','$','&'};

        char[][] chars=new char[3][];//upper.lower.other
        chars[0]=upper;
        chars[1]=lower;
        chars[2]=other;
        System.out.println(Arrays.toString(chars[0]));
        System.out.println(Arrays.toString(chars[1]));
        System.out.println(Arrays.toString(chars[2]));

        System.out.println(Arrays.deepToString(chars));

    }
}
