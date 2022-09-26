package day05;

public class arthimeticOperator {

    public static void main(String[] args) {
        
      byte b =14;
      int i=b;// int is bigger so this is ok


      long l =40;//it can authomatically stored because int can hold it
        long l2=3000000000000l; //we have to tell the compiler it is lond {using l)

        float f=10;

        System.out.println(f);

        double d=19.99;
        int i2=(int)d;
        System.out.println(i2);

        int i3=500;
        byte b2=(byte)i3;
      System.out.println(b2);
short s=60;
double d3=s;
      System.out.println(d3);
float f2=100.50f;
 long l3=   (long) f2;
      System.out.println(l3);
      double d4=l3;
      System.out.println(d4);



    }
}
