package day39_inheritance.device;

public class Device {
    String brand, model,  wireless;
    int price;

    public Device(String brand, String model, String wireless, int price) {
        this.brand = brand;
        this.model = model;
        this.wireless = wireless;
        this.price = price;
    }

    public void useDevice(){

    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", wireless='" + wireless + '\'' +
                ", price=" + price +
                '}';
    }
}
