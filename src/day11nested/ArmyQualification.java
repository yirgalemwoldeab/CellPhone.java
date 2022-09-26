package day11nested;

public class ArmyQualification {
    public static void main(String[] args) {
  int age=20;
  boolean hasDiploma=false;
  boolean isCitizen=false;
  if(age>=18 && age<=35 && isCitizen&& hasDiploma){
      System.out.println("you qualified for the army");
  }else {

      if (age<0||age>120){
          System.out.println("not valid age");


      } else if (age <18){
          System.out.println("you are too young to be at least 18");
      }else if(age>35){
          System.out.println("you are too old limit is 35 years old");
      }
      if(!hasDiploma){
          System.out.println("you neeed to have a deploma");

      }
      if ((!isCitizen)){
          System.out.println("you need to be a citizen to apply");
      }
  }





    }
}
