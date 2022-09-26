package day42_abstraction.abstracExercise;

public class Running extends Exercise{

    @Override
    public void perform(){
        System.out.println("we are running");
    }
    @Override
    public void getCaloriesBurned(int calories){
        System.out.println(calories*0.35);
    }

}
