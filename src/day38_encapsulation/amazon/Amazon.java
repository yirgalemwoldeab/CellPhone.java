package day38_encapsulation.amazon;

public class Amazon {

  /*  instance variables:
            - userName (String)
- email (String)
- hasPrime (boolean)
    constructor:
            - initialize the fields
    encapsulate AmazonAccount
    methods: toString()
    Create a class UseAmazon
create an object of the AmazonAccount and verify the constructor,
        getters and setters and toString are working properly
--------------------------------------------------------------------------
        -------
    create a class called Square
   */

  private String userName;
 private String email;
 private boolean hasPrime;


    public Amazon(String userName, String email, boolean hasPrime) {
        this.userName = userName;
        this.email = email;
        this.hasPrime = hasPrime;
    }


    @Override
    public String toString() {
        return "Amazon{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }
}
