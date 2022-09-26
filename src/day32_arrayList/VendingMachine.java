package day32_arrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class VendingMachine {
    public static void main(String[] args) {
        ArrayList<String>  drinks=new ArrayList<>();

        drinks.add("soda");
        drinks.add("juice");
        drinks.add("water");
        drinks.add("coffee");

        System.out.println(drinks);

        Scanner input=new Scanner(System.in);

        ArrayList<String>  drink=new ArrayList<>(Arrays.asList("soda","juice","coffee","water"));

        System.out.println("which drink you want");

        String selection =input.nextLine();
        if(drink.contains(selection)){
            System.out.println("is in the vending machine");
        }else{
            System.out.println("is not in the vending machine");
        }
    }
}
