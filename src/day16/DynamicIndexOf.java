package day16;

public class DynamicIndexOf {
    public static void main(String[] args) {
        String str="definition";
        System.out.println("first i "+str.indexOf('i'));
        System.out.println("last i "+str.lastIndexOf('i'));
        System.out.println("second i "+str.indexOf('i',4));
        System.out.println("third"+str.indexOf('i',6));

        int firsti=str.indexOf('i');
        int secondi=str.indexOf('i',firsti+1);
        int thirdi=str.indexOf('i',secondi+1);
    }
}
