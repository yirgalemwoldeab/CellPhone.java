package day_44_polylmorphism.animal;

public class Wild {
    public static void main(String[] args) {

        //lizard obj with all references

        Lizard lizard1=new Lizard();//reference of itself


        Reptile lizard2=new Lizard();//reference of super class

        Animal lizard3=new Lizard();//reference of super class

        lizard1.eat();
        lizard2.eat();
        lizard3.eat();

    }
}
