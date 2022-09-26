package day27_methods;

import java.lang.reflect.Array;

public class MethodPractice {

    public static void main(String[] args) {
int [] nums={31,56,78,34};
        System.out.println(max(nums));

        System.out.println(min(nums));
        System.out.println();
        number();
        number1();
        letter();
        num(4);
        name("java");



    }

    public static void number() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    public static void number1() {
        for (int i = 0; i <= 100; i++) {


            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

   public static void letter() {
       System.out.println();
       for (char i = 'a'; i <='z'; i++) {
           System.out.print(i+" ");
       }

   }

    public static void  num(int num1) {
        System.out.println();
        if (num1 > 0) {
            System.out.println("positive");
        }
        if(num1<0){
            System.out.println("negative");
        }
        if(num1==0){
            System.out.println("zero");
        }

    }
    public static void  name(String str) {
        for (int i = 0; i < str.length(); i++) {
            char let = str.charAt(i);
            System.out.println(let);
        }
    }

    public static int max ( int ...nums) {
        int max1=0;
for(int each:nums) {
    if(each>max1){
        max1=each;
    }
}
    return max1;
    }

    public static int min ( int ...numss) {
        int min1=0;
        for(int i=0;i<numss.length;i++) {
            if(numss[i]<min1){
                min1=numss[i];
            }
        }
        return min1;
    }

    public static boolean contain ( int [] sis,int num) {
        for (int each : sis) {
            if (each == (num)) {

            }

        }
        return true;
    }

}
