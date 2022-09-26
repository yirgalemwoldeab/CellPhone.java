package day41_exceptions.exception_recap;

public class OutOfStackException extends RuntimeException{

    public OutOfStackException(){

    super("item out of stock");
    }
}
