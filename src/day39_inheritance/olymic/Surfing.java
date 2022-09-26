package day39_inheritance.olymic;

public class Surfing extends Olympic{

    public Surfing(String name, int participant) {
        super(name, participant);
    }

    @Override
    public void compete() {
        System.out.println("surfing the waves");

    }
}
