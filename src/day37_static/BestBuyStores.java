package day37_static;

public class BestBuyStores {
    public static void main(String[] args) {

     BestBuy store1=new BestBuy();
     store1.location="firefax";//instance variable to access you need object
        System.out.println(store1.location);


        System.out.println(BestBuy.headquarters);//it is static access with the class
        System.out.println(store1.headquarters);
    }
}
