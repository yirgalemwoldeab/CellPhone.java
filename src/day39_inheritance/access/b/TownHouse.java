package day39_inheritance.access.b;

import day39_inheritance.access.a.House;

public class TownHouse extends House {
    public static void main(String[] args) {


        TownHouse house = new TownHouse();
        house.address = "123134 road";
        house.city = "Fairfax";
        // did I inherit the city variable? yes
        //        house.state;  state is default, so only accessible in the same package
        //        house.zipcode zipcode is private, so only accessible in the same class

    }
}