package day29_method;

import java.lang.reflect.Array;

public class VarArgEx {

    public static void main(String[] args) {
       int[] nums={3,1,3,5};
        printAll(nums);
        System.out.println();
        int[] a={3,1,3,5};
        printAll(a);
        System.out.println();
        dynamic(4,1,4,1,5,2);
        System.out.println();
        dynamic("hello","monday","java");
        System.out.println();
         max(34,56,33,67);



    }
 public static void printAll(int[] nums)   {

        for (int each:nums){
            System.out.print(each+" ");
        }

 }

    public static void dynamic (int... nums)   {

        for (int each:nums) {
            System.out.print(each + " ");
        }
        }
    public static void dynamic (String... words) {

        for (String each : words) {
            System.out.print(each + " ");
        }
    }

    public static int max (int... nums3) {
        int max = 0;
        for (int each : nums3) {
            if (each > max) {
                max = each;
                System.out.println(max);
            }
        }
        return max;
    }
}
