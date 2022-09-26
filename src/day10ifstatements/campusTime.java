package day10ifstatements;

public class campusTime {
    public static void main(String[] args) {

  int time=12;
  if (time>=6 && time<=11) {
      System.out.println("good morning");}
      else if (time >= 12 && time <= 16) {
          System.out.println("good AFTERNOON");
      }
      else if (time >= 17) {
          System.out.println("good NIGHT");}
else{
      System.out.println("not in 24h range");
  }
      }


  }


