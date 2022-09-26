package day11nested;

public class AgeGroup {
    public static void main(String[] args) {
        int age =76;
        if (age <= 120 && age >= 0) {


            if (age <= 1) {
                System.out.println("baby");
            } else if (age <= 5) {
                System.out.println("toddler");

            } else if (age <= 13) {
                System.out.println("kid");
            } else if (age <= 18) {
                System.out.println("teen ager");
            } else if (age <= 45) {
                System.out.println("adult");
            } else if (age <= 65) {
                System.out.println("middle age");
            } else
                System.out.println("senior");}
if(age<0) {
    System.out.println("CAN NOT be negative");
}else if(age>120){
    System.out.println("can not be more than 120");


}

        }


    }



