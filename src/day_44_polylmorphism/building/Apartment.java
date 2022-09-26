package day_44_polylmorphism.building;

public class Apartment extends Building implements HasBalcony{

    int monthOfLease;

    public Apartment(String location, double price, int monthOfLease) {
        super(location, price);
        this.monthOfLease = monthOfLease;
    }

    @Override
    public void pay() {
        System.out.println("you have to pay for the lease");
    }

    @Override
    public void openBalcony() {
        System.out.println("it is must to have a lease");
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "monthOfLease=" + monthOfLease +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }
}
