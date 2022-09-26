package day35_custom_class.food;

public class Food {
    String name;
    int quantity;
    double untiPrice;
    double totalPrice;


    public Food(String name){
        this.name=name;

    }
    public Food(String name,int quantity){
        this(name);
this.quantity=quantity;
    }

    public Food(String name,int quantity,double unitPrice){
        this(name,quantity);
        this.untiPrice=unitPrice;

    }
    public  boolean calculatePrice() {
        if (quantity == 0 || untiPrice == 0) {
            return false;
        }
            totalPrice = untiPrice * quantity;
            return true;
        }
public String toString(){
        String str="name"+name;
        if(quantity!=0){
            str+=", unit price:$"+untiPrice;
        }
        if(totalPrice!=0){
            str+="total price $"+totalPrice;
        }
        return str;
}
    }

