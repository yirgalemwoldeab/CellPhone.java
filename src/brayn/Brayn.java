package brayn;

public class Brayn {
    public static void main(String[] args) {

        int num=5;
        if(num%2==0){
            System.out.println("it is even");
        }else {
            System.out.println("is is odd");
        }

        int num1=6;

        if(num1%2==0){
            System.out.println("it is even");
        }else {
            System.out.println("is is odd");
        }

        System.out.println();

        for (int i = 1; i <=30; i++) {



            if (i % 3 == 0) {
                System.out.println(" FIN");


           } else if (i % 5 == 0) {

                  System.out.println("RA");

              } else if (i % 3 == 0 & i % 5 == 0) {

                System.out.println("FINRA");
               }

        }

        System.out.println(  Math.floorDiv(4,2));

        }
    }

