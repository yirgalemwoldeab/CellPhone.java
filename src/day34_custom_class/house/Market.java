package day34_custom_class.house;

import day34_custom_class.house.House;

public class Market {
    public static void main(String[] args) {

        House house1=new House();
        System.out.println(house1);

        house1.type="Townhouse";
        house1.squaareFeet=1300;
        house1.numberOfBaths=2;
        house1.numberOfBedrooms=3;
        house1.hasGarage=true;
        house1.inCity=false;
        System.out.println(house1);
        System.out.println(house1.calculateMortgage());
    }
}
