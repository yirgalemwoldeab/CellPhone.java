package day_44_polylmorphism.building;

public class TestBuilding {
    public static void main(String[] args) {


        House house = new House("chicago", 1400.00, 5);
        Building house1 =new House ("chicago", 1400.00, 5);
        HasBackyard house2 = new House("chicago", 1400.00, 5);


        Apartment apa = new Apartment("chicago",1400.00, 5);
        Building apa1 = new Apartment("chicago", 1400.00, 5);
        HasBalcony apa2 = new Apartment("chicago", 1400.00, 5);


        OfficeBuilding off1 =new OfficeBuilding("chicago", 1400.00, 5);
        Building off2 = new OfficeBuilding("chicago", 1400.00, 5);
        HasElevator off3=new OfficeBuilding("chicago", 1400.00, 5);







    }

}
