package day39_inheritance.lyft;

public class Lux extends Lyft{
    @Override
    public double calculateRate(double miles) {
        return miles*1.5+(miles*1.5*20/100);
    }
}
