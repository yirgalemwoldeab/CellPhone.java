package day32_arrayList.random;

import day32_arrayList.random.RandomExample;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "did","coding","python"));

        System.out.println(searchInlist(list, "did"));
        System.out.println(searchInlist(list, "coding"));
        System.out.println(searchInlist(list, "java"));

        System.out.println(RandomExample.getDays());
        ArrayList<String> days = RandomExample.getDays();
        System.out.println(days);

    }

    public static int searchInlist(ArrayList<String> list,String target){
        int count=0;
       if(list.contains(target)){
    count++;
            }

        return  count;




    }
}
