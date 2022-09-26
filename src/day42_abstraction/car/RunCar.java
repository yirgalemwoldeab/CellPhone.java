package day42_abstraction.car;

public class RunCar {
    public static void main(String[] args) {

        Bmw bmw=new Bmw();
        bmw.start();


        Toyota toyota=new Toyota();
        toyota.start();

        Tesla tesla=new Tesla();
        tesla.start();
        tesla.charge();

    }
}
