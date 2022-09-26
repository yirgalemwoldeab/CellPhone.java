package day35_custom_class.food;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Kitchen {
    public static void main(String[] args) {
        Food[] allFood=new Food[5];
        System.out.println(Arrays.toString(allFood));
        Food apples=new Food("apples");
        allFood[0]=apples;
        allFood[1]=new Food("suchi",10);
        allFood[2]=new Food("cajun pasta",2,5);
        allFood[3]=new Food("KEBAB",5,4);
        allFood[4]=new Food("ploy",4,2.99);
        System.out.println(Arrays.toString(allFood));


        for(Food each:allFood){
            System.out.println(each);
            if(each.name.startsWith("a")||each.name.startsWith("c")){
                System.out.println(each);
            }
        }
        System.out.println("food that is over $7");

        for(Food each:allFood){
            if(each.totalPrice<=3){
                System.out.println(each.name);
            }
        }

    }

}
