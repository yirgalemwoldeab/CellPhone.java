package day38_encapsulation;

public class TestBank {
    public static void main(String[] args) {

      BankAccount account=new BankAccount(345666,788990009);
        System.out.println(  account.getAccountNumber());
        System.out.println(account.getBalance());


    }
}
