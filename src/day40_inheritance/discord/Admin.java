package day40_inheritance.discord;

public class Admin extends Discord{

    String admin;

    public Admin(String role, String name, String id, String admin) {
        super(role, name, id);
        this.admin = admin;
    }
    public void creatChannel(){
        System.out.println("creating new channel");
    }



}
