package day13Switch;

public class StringObjects {
    public static void main(String[] args) {

       String s="first";
       String s2=new String("second");
        System.out.println(s==s2);

        String s3="first";
        System.out.println(s==s3);//compare objects in differ location

        String s4="second";
        System.out.println(s==s4);

        String s5="first";
        System.out.println(s==s5);



    }
}
