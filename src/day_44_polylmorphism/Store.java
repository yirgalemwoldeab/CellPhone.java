package day_44_polylmorphism;

import day43_abstraction.clothes.Clothes;
import day43_abstraction.clothes.Hashod;
import day43_abstraction.clothes.Jacket;
import day43_abstraction.clothes.T_Shirt;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        T_Shirt item1=new T_Shirt();
        Clothes item2=new T_Shirt();



        Jacket jacket1=new Jacket();
        Clothes jacket2=new Jacket();
        Hashod jacket3=new Jacket();



        Clothes[] inventory=new Clothes[10];
        inventory[0]=new T_Shirt();
        inventory[1]=item1;
        inventory[2]=item2;
        inventory[3]=jacket1;
        inventory[4]=jacket2;
      // inventory[5]=jacket3;

        inventory[5]=new Hat();
        inventory[6]=new Hat();


        ArrayList<Clothes>  list=new ArrayList<>();
        list.add(new Jacket());
        list.add(new T_Shirt());
        list.add(new Hat());
        for(Clothes each:inventory){
            each.wear();
        }
        buy(new  Jacket());

        buy(new  T_Shirt());

        buy(new  Hat());

    }
    public static void buy(Clothes clothes){
        if(clothes instanceof Jacket){
            System.out.println("Jackets cost 29.99");
        } else if(clothes instanceof Hat){
            System.out.println("Hats cost 19.99");
        } else if(clothes instanceof T_Shirt){
            System.out.println("Tshirt is 9.99");
        }

    }

}

class Hat extends Clothes{
    @Override
    public void wear() {
        System.out.println("wearing hat");
    }
}