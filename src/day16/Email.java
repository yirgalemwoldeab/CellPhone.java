package day16;

public class Email {
    public static void main(String[] args) {

        String email="saim@cydeo.com";
        System.out.println("name "+email.substring(0,4));
        System.out.println("domain "+email.substring(5,10));

        int endexOfAt=email.indexOf("@");
        String name=email.substring(0,endexOfAt);
        int endexOfDot=email.indexOf('.');
        String domain=email.substring(endexOfAt+1,endexOfDot);

        System.out.println(email);
        System.out.println(name);
        System.out.println(domain);



    }
}
