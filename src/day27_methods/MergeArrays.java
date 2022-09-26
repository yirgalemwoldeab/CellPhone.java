package day27_methods;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[][] nums = {
                {10, 20, 30},
                {5, 10, 15},
                {1, 2, 3}
        };
        int size = 0;

        for (int[] eachArray : nums) {
            size += eachArray.length;

        }
        // the purpose of loop is to know how many elements we have in array
        int[] merged = new int[size];
        int indexToStore = 0;
        for (int[] eachArray : nums) {
            for (int eachNum : eachArray) {
                merged[indexToStore++] = eachNum;
                //System.out.println(Arrays.toString(merged));
            }
        }
        System.out.println(Arrays.toString(merged));



    }
}