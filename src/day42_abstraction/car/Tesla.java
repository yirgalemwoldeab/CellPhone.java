package day42_abstraction.car;

public class Tesla extends ElectricCar{

    @Override
    public void start() {
        System.out.println("key card near by starting car");
    }

    @Override
    public void charge() {
        System.out.println("tesla charging station");
    }
}
