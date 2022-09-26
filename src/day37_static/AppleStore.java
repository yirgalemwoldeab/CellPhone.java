package day37_static;

public class AppleStore {
    public static void main(String[] args) {

        Iphone iphone1=new Iphone("IPHONE X,","black",1000,256);
        System.out.println(iphone1);

        System.out.println(Iphone.brand);
        System.out.println(Iphone.os);

        Iphone iphone2=new Iphone("IPHONE 7,","silver",1000,256);
        System.out.println(iphone2);
        System.out.println(Iphone.brand);
    }
}
