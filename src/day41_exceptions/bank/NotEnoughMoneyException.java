package day41_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(){
        super("not enough money in the account");
    }

}
