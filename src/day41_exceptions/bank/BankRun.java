package day41_exceptions.bank;

public class BankRun {
    public static void main(String[] args) {

        Bank obj=new Bank();
        obj.balance=3000;

        obj.withdraw(4000);
        System.out.println(obj.balance);

        obj.withdraw(4000);
    }
}
