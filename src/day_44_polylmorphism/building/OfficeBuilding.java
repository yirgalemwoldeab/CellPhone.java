package day_44_polylmorphism.building;

public class OfficeBuilding extends Building implements HasElevator{
    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }


    @Override
    public void pay() {
        System.out.println("you have to pay for the office rent");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("it is must to pay for the office rent");
    }



    @Override
    public String toString() {
        return "OfficeBuilding{" +
                "numberOfFloors=" + numberOfFloors +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
