package day41_exceptions.exercise;

public class FailToCheckOutException extends Exception{
    public FailToCheckOutException(){
        super("checked exception");
    }
}
