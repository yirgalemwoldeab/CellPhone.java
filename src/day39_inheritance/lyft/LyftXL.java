package day39_inheritance.lyft;

public class LyftXL extends Lyft{

    @Override
    public double calculateRate(double miles) {
        return +miles*1.5+(miles*1.5*10/100);
    }
}
