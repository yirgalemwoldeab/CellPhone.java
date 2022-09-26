package day05;

public class Pizza {

    public static void main(String[] args) {

        String type="cheese";
        int pizzaSlices=10;
                int people=3;
                int slicesPerPerson=pizzaSlices/people;
                int leftOverSlices=pizzaSlices%people;

        System.out.println(slicesPerPerson+"slices and there will be"+people+"people and"+pizzaSlices+"pizza slices"+leftOverSlices+"so the left over slices will be");
    }
}
