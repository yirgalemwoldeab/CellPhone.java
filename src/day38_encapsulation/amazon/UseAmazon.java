package day38_encapsulation.amazon;

public class UseAmazon {
    public static void main(String[] args) {
        Amazon amazon=new Amazon("yir","yirga@yahoo.com",true);
        System.out.println(amazon);
        System.out.println(amazon.getUserName());
amazon.setUserName("andemariam");


        System.out.println(amazon);
    }
}
