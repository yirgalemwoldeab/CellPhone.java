package day09;

public class Bank {

   public static void main(String[] args) {
     double balance=1_000_000;
     double amountToWithdraw=1_500_000;
     balance-=amountToWithdraw;
      System.out.println("with draw"+amountToWithdraw);
      if (balance>=0) {
          System.out.println("account balnce = " + balance);
      }
      if(balance<0) {
         System.out.println("over draft penality");
         System.out.println("amount due"+amountToWithdraw*0.25);

      }

   }





}
