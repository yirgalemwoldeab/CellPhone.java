package day41_exceptions.exception_recap;

public class InvalidSelectionException extends Exception{

    public InvalidSelectionException(){
        super("selection can only be 1,2,or 3");
    }
}
