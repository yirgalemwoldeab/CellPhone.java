package day39_inheritance.device;

public class TV extends Device{



    public TV(String brand, String model, String wireless, int price) {
        super(brand, model, wireless, price);
    }

    @Override
    public void useDevice() {
        System.out.println("using tv");
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", wireless='" + wireless + '\'' +
                ", price=" + price +
                '}';
    }
}
