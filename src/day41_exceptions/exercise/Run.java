package day41_exceptions.exercise;

public class Run {
    public static void main(String[] args) {


        Library library = new Library();
        System.out.println(library.getLibraryCaard("fairfax"));

        try{
            library.borrow(true);
        }
        catch (FailToCheckOutException e){
            System.out.println( e.getMessage());
        }
    }
}