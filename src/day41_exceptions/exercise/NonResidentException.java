package day41_exceptions.exercise;

public class NonResidentException extends RuntimeException{

    public NonResidentException(){
        super("not resident");
    }
}
