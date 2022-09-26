package day37_static;

public class Iphone {

    String model;
    String color;
    double price;
    int storage;

    static String os;

    static String brand;
    static {
        System.out.println("static block run");
        os="ios";
        brand="apple";
    }

    public Iphone(String model, String color, double price, int storage) {

        this.model=model;
this.color=color;
this.price=price;
this.storage=storage;
        System.out.println("constructor is run");
}

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
