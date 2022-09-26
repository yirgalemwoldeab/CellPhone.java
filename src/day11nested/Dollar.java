package day11nested;

public class Dollar {
    public static void main(String[] args) {

  int money=65;
  int quarter=money/25;
        System.out.println(money%25);
        money%=25;
        int dimes=money/10;
        money%=10;
        int nickles=money/5;
        money%=5;
        int pennies=money;

        System.out.println("change");
        System.out.println("quarter"+quarter);
        System.out.println("pennies = " + pennies);
        System.out.println("nickles = " + nickles);
        System.out.println("dimes = " + dimes);




    }


}
