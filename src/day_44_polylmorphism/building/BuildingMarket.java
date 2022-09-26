package day_44_polylmorphism.building;

import java.util.ArrayList;

public class BuildingMarket {
    public static void main(String[] args) {

        ArrayList<Building> allBuilding=new ArrayList<>();
        allBuilding.add(new House("chicago", 1400.00, 5));
        allBuilding.add(new House("dallas", 1300, 5));
        allBuilding.add(new House("newyork", 1500, 3));
        allBuilding.add(new Apartment("Dc", 4500, 123));
        allBuilding.add(new Apartment("SYTLE", 2300, 650));
        allBuilding.add(new Apartment("California", 6700, 450));
allBuilding.add(new OfficeBuilding("ohayo", 6700, 5));

      allBuilding.add(new OfficeBuilding("eritera",5600, 8));
        allBuilding.add(new OfficeBuilding("francisco", 4560, 6));


        double highestPrice=allBuilding.get(0).price;
        double lowestPrice=allBuilding.get(0).price;

       for (Building each:allBuilding) {


           if(each.price<lowestPrice){
               lowestPrice= each.price;

           }

           if(each.price>highestPrice){
               highestPrice=each.price;


           }
           if(each.location.equals("chicago")){
               System.out.println(each);
           }
           if(each.price>5000){
               System.out.println(each);
           }

       }
        System.out.println(lowestPrice);
        System.out.println(highestPrice);


      //  ArrayList<Building>filter=new ArrayList<>();
      //  filter.removeIf()

    }
    }