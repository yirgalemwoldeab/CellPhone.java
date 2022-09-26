package day32_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatingWithValues {
    public static void main(String[] args) {

    int[ ]    arr={3,5,1,1};
        System.out.println( Arrays.asList(arr));

        Integer[ ] arr1   ={3,5,1,1};


        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(arr1));

        System.out.println(nums);
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(5,3,2,2,1));

        System.out.println(list);
        ArrayList<String> names=new ArrayList<>(Arrays.asList("james","adam","ana","jane"));
        System.out.println(names);




    }
}
