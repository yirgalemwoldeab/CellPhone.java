package day39_inheritance.device;

public class Phone extends Device{

    public Phone(String brand, String model, String wireless, int price) {
        super(brand, model, wireless, price);
    }

    @Override
    public void useDevice() {
        System.out.println("using phone");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", wireless='" + wireless + '\'' +
                ", price=" + price +
                '}';
    }
}
