package day36_custom_classes.offer;

import java.util.ArrayList;

public class Market {
    public static void main(String[] args) {

        ArrayList<Offer> allOffer =new ArrayList<>()  ;

        allOffer.add(new Offer("amazon","chicago",120_000,true,15));
        allOffer.add(new Offer("chase","new york",110_000,true,15));
        allOffer.add(new Offer("google","seatle",170_000,false,0));
        allOffer.add(new Offer("accenture","dallas",115_000,false,0));
        allOffer.add(new Offer("walmart","chicago",135_000,true,12));

        ArrayList<Offer> localOffer =new ArrayList<>(allOffer)  ;
        localOffer.removeIf(offer -> offer.location.equals("chicago"));
        System.out.println(localOffer);

        for(Offer each:allOffer){
            if(each.location.equals("chicago")){
                System.out.println(each);
            }
        }
        ArrayList<Offer> onlyFullTime =new ArrayList<>(allOffer)  ;
        onlyFullTime.removeIf(p->!p.isFullTime);

        System.out.println(onlyFullTime);

        ArrayList<Offer> minSalary =new ArrayList<>(allOffer)  ;
        minSalary.removeIf(p->p.salary<130_000);

        System.out.println(minSalary);

        Offer minOffer=allOffer.get(0);
        Offer maxOffer=allOffer.get(0);


        double min=allOffer.get(0).salary;
        double max=allOffer.get(0).salary;

        for(Offer each:allOffer) {
            if (each.salary > max) {
                max = each.salary;
            }
            if (each.salary < min) {
                min = each.salary;

            }
        }
            System.out.println(min);
        System.out.println();
        System.out.println(minOffer);
            System.out.println(max);
        System.out.println(maxOffer);
        

    }
}
