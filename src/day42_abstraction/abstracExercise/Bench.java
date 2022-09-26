package day42_abstraction.abstracExercise;

public class Bench extends Lifting{

    @Override
    public void perform() {
        System.out.println("bench press");
    }

    @Override
    public void getCaloriesBurned(int calories) {
        System.out.println(10*calories);
    }

    @Override
    public void rackWeights() {
        System.out.println("putting weight");

    }
}
