package day39_inheritance.olymic;

public class Olympic {
    String name;
    int participant;


    public Olympic(String name, int participant) {
        this.name = name;
        this.participant = participant;
    }


    public void compete(){

    }

    @Override
    public String toString() {
        return "Olympic{" +
                "name='" + name + '\'' +
                ", participant=" + participant +
                '}';
    }
}
