package day13Switch;

public class DayInMonths {
    public static void main(String[] args) {
    String month="may" ;
    switch(month){
        case "february":
            System.out.println("28 days");
            break;
        case "april":

        case "june":

        case "september":

        case "november":
            System.out.println("30days");
            break;
        case"may":
        case"january":
        case"march":
        case"july":
        case"august":
        case"october":
        case"december":
            System.out.println("31 days");
            break;
        default:
            System.out.println("invalid month");
    }





    }
}
