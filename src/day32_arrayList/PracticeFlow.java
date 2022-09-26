package day32_arrayList;

import java.util.ArrayList;

public class PracticeFlow {
    public static void main(String[] args) {

       /* Create an ArrayList of Strings
        add these elements:
        add Hat
        add Shoes
        add Jacket in middle of Hat and Shoes
        add Towel in the beginning
        add Car between Towel and Hat
        Print the ArrayList after each action to see how the change is made
                */

        ArrayList<String> words = new ArrayList<>();
        words.add("Hat");
        System.out.println(words);
        words.add("Shoes");
        System.out.println(words);
        words.add(1, "Jacket");
        System.out.println(words);
        words.add(0, "Towel");
        System.out.println(words);
        words.add(1, "Car");
        System.out.println(words);






        ArrayList<String> avengers =new ArrayList<>();
        avengers.add("spider man");
        avengers.add("iron");
        avengers.add("captain amrica");
        avengers.add("hawkeyer");

        System.out.println(avengers);
        int indexOfThor=avengers.indexOf("thor");
        System.out.println(indexOfThor);

        avengers.remove("iron");
        System.out.println(avengers);

        ArrayList<Integer> nums =new ArrayList<>();
      nums.add(800);
        nums.add(300);
        nums.add(400);
        nums.add(300);

        System.out.println(nums);

        nums.remove((Integer) 300);
        System.out.println(nums);

      ArrayList<Character>   name=new ArrayList<>();
      name.add('s');
        name.add('a');
        name.add('i');
        name.add('m');

        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.get(2));
        System.out.println(name.get(3));
name.remove(1);
        System.out.println(name);


    }

}
