package day21NestedLoop;

public class MultipilicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println("table for" + i);
            for (int j = 1; j <= 10; j++) {
                System.out.print(i+"*"+j+"="+i*j+"|");
            }
            System.out.println();
        }

    }
}
