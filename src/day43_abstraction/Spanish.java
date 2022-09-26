package day43_abstraction;

import day43_abstraction.language.Language;

public class Spanish implements Language {

    @Override
    public void hello() {
        System.out.println("hola");
    }

    @Override
    public void bye() {
        System.out.println("adios");
    }
}
