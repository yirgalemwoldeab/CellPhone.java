package day39_inheritance.access.b;

public class Runnerb {

        public static void main(String[] args) {

            // Q: What does TownHouse inherit from House?

            // in different packages

            TownHouse house = new TownHouse();
            house.address = "123134 road";
            //        house.city = "Fairfax"; no accessible outside the package
            //        house.state;  state is default, so only accessible in the same package
            //        house.zipcode zipcode is private, so only accessible in the same class

    }
}
