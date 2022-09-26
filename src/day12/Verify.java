package day12;
import java.util.Scanner;
public class Verify {
    public static void main(String[] args) {


        int pin = 1234;
        int ssn = 1111;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the pin");
        int inputPin = input.nextInt();
        System.out.println("please enter the last digits of SSN");
        int inputssn = input.nextInt();

        if (pin == inputPin && ssn == inputssn) {
            System.out.println("authentication is sucessfull");
        } else {

            if (pin != inputPin) {
                System.out.println("pincode is incorrect");
            }
            if (ssn != inputssn) {
                System.out.println("SSN is incorrect");
            }

        }
    }
}