package day42_abstraction.abstracExercise;

public class Gym {
    public static void main(String[] args) {

        Running running=new Running();
        running.perform();
        running.getCaloriesBurned(30);

        Bench bench=new Bench();
        bench.perform();
        bench.rackWeights();

    }
}
