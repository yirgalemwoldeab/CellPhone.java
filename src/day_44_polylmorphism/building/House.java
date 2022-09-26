package day_44_polylmorphism.building;

public class House extends Building implements HasBackyard{

    int numberOfResidence;

    public House(String location, double price, int numberOfResidence) {
        super(location, price);
        this.numberOfResidence = numberOfResidence;
    }

    @Override
    public void pay() {
        System.out.println("paying for the house or");
    }

    @Override
    public void mowlawn() {
        System.out.println("going to the backyard");
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfResidence=" + numberOfResidence +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
