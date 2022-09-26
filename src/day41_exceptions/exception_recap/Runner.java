package day41_exceptions.exception_recap;

import day41_exceptions.exception_recap.InvalidSelectionException;
import day41_exceptions.exception_recap.VendingMachine;

public class Runner {
    public static void main(String[] args) {

        System.out.println(VendingMachine.select(5));

        try {
            System.out.println(VendingMachine.selectValid(5));
        } catch (InvalidSelectionException e) {
            System.out.println(e.getMessage());
        }finally {

        }
    }
}
