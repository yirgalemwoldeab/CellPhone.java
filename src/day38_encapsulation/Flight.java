package day38_encapsulation;

public class Flight {
  private   String type;
   private String location;
 private    String arrival;

    public Flight(String type, String location, String arrival) {
        setType(type);
        this.location = location;
        this.arrival = arrival;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        if(type.equals("business")||type.equals("economy")||type.equals("first")){
            this.type = type;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
