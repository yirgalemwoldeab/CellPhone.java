package day06;

public class GiftCard {

    public static void main(String[] args) {
       int giftCard=500;
       int timesUsedAt=3;



        System.out.println("using giftcard and subtract 150 from the amount reduce the times used by one = ");
              giftCard-=150;
              timesUsedAt--;
        System.out.println("using giftcard and subtract 99 from the amount reduce the times used by one = ");
                giftCard-=99;
                timesUsedAt--;
        System.out.println("gift card balance left " + giftCard);
        System.out.println("timesUsedAt = " + timesUsedAt);



        int a = 8;
        int b = a--;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
                
        
        
    }
}
