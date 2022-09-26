package day39_inheritance.olymic;

public class RunDevice {
    public static void main(String[] args) {
        Surfing surfing=new Surfing("ball",6758);
        System.out.println(surfing);
        surfing.compete();


        Track track=new Track("valleyball",9065);
        System.out.println(track);
        track.compete();

    }
}
