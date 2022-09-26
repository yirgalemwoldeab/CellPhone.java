package day43_abstraction.clothes;

public class Jacket extends Clothes implements Hashod{
    @Override
    public void wear() {
        System.out.println("wearing the jacket");
    }
    @Override
    public void putOnHood(){
        System.out.println("putting on jacket hood");
    }
}
