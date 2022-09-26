package day28_method1;

public class DayWeek {
    public static void main(String[] args) {
        System.out.println(dayInWeek(4));
        System.out.println(dayInWeek(7));
        switch ((dayInWeek(1))){
            case"mon":
            case "fri":
                System.out.println("full day of java");
                break;
        }


    }
    public static String dayInWeek(int day){
        String[] days={"mon","tue","wed","thu","fri","sat","sun"};
                return days[day-1];
    }
}
