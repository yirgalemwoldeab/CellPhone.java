package day17;

public class SmsParts {
    public static void main(String[] args) {
   String msg="sender:<james Bond>.from number:[202-123-3456].+Message:{\"i love programming and problem solving\"}";
        int startSender= msg.indexOf('<') ;
        int endSender=msg.indexOf('>');
        int startNumber=msg.indexOf('[');
        int endNumber=msg.indexOf(']');
        int startMsg=msg.indexOf('{');
        int endMsg=msg.indexOf('}');
        String sender=msg.substring(startSender+1,endSender);
        String number=msg.substring(startNumber+1,endNumber);
        String msgPart=msg.substring(startMsg+1,endMsg);

        System.out.println("sender"+sender);
        System.out.println("number"+number);
        System.out.println("message"+msgPart);


        boolean x=false;
        boolean y=!x;
        boolean z=x==true;
        if (x){
            System.out.println("hello");}
            if(y){
                System.out.println("send");}
                if (z){
                    System.out.println("word");
        }
    }
}
