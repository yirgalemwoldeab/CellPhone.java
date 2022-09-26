package day41_exceptions.season;

public class Winter extends Season {

    public Winter(double highestTemp, double lowestTemp) {
        super("winter", highestTemp, lowestTemp);
    }

    @Override
    public void activity() {

        System.out.println("use firelplace");
        System.out.println("code java");

    }
}