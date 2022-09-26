package day40_inheritance.discord;

public class Studen1 extends Discord{

String roleStudent;

    public Studen1(String role, String name, String id,String roleStudent) {
        super(role, name, id);
        this.roleStudent = roleStudent;

    }

    public void sendingMessage(){
        System.out.println("sending message through discord");
    }

    public static void main(String[] args) {

      Admin admin=new Admin("vcs","yir","011","sis") ;

        System.out.println(admin);
        System.out.println(admin.name);

    }



}
