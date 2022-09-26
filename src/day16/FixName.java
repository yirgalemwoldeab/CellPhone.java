package day16;

public class FixName {
    public static void main(String[] args) {
     String firstname="yirgalem";
     String lastnane="woldeab";
     String initial=firstname.substring(0,1)+lastnane.substring(0,1);
        System.out.println(firstname.substring(0,1).toUpperCase()+firstname.substring(1));
        System.out.println(lastnane.substring(0,1).toUpperCase()+lastnane.substring(1));

        System.out.println("full name:"+firstname+" "+lastnane);
        System.out.println(initial);
        System.out.println(firstname.substring(1));

    }
}
