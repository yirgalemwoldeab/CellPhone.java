package day20_loop;

public class PrimeNumber {
    public static void main(String[] args) {

        int n = 9;
        boolean isPrime = true;
if(n<2){
    System.out.println("not prime");
    System.exit(0);
}
        for (int i = 2; i < n; i++) {


            if (n % i == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime?"prime":"not prime");
    }


    }

