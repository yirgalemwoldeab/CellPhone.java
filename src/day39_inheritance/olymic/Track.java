package day39_inheritance.olymic;

public class Track extends Olympic{

    public Track(String name, int participant) {
        super(name, participant);
    }

    @Override
    public void compete() {
        System.out.println("running jumping,throwing");
    }
}
