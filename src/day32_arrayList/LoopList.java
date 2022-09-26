package day32_arrayList;

import java.util.ArrayList;

public class LoopList {
    public static void main(String[] args) {

        ArrayList<Integer>   nums=new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i) + " ");
        }
            for(int each:nums){
                System.out.println(each+" ");

        }
        ArrayList<String> avengers =new ArrayList<>();
        avengers.add("spider man");
        avengers.add("iron");
        avengers.add("captain amrica");
        avengers.add("hawkeyer");


for(String each:avengers){
    if(each.contains(" ")){
        int space=each.indexOf(" ")+1;
        System.out.println(   each.substring(0 ,1)+each.substring(space,space+1));
    }else {
        System.out.println(each.charAt(0));
    }
}

    }
}
