package day13Switch;

public class floor {
    public static void main(String[] args) {
    int floor=2;
    String companies;

    switch (floor) {
        case 1:
            companies = "lobby,starbucks,amazon,pick up";
            break;
        case 2:
            companies = "jNASA,CYDEO,DISCOVER";
            break;

        case 3:
            companies = "UBER,LYFT,CHASE";
            break;

        case 4:
            companies = "ROOFTOP ,LOUNGE";
            break;

        default:
            companies = "invalid floor selected";
    }
            System.out.println("floor" + floor + ":" + companies);














    }
}
