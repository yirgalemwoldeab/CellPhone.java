package day35_custom_class.carpet;

public class Store {
    public static void main(String[] args) {

        Carpet kover = new Carpet(12.5, 35, 12.99, false);
        System.out.println(kover);

        Carpet persian = new Carpet(12.5, 35, 12.99, true);
        System.out.println(persian);

        persian.width = 16.5;
        persian.calculatePrice();
        System.out.println(persian);

    }
}






