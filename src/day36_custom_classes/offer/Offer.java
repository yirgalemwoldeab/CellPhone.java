package day36_custom_classes.offer;

public class Offer {

    String company;
    String location;
    double salary;
    boolean isFullTime;
    int  numberOPto;

  public Offer(String company,String location,double salary) {
      this.company = company;
      this.location = location;
      this.salary = salary;
  }

   public Offer(String company,String location,double salary,boolean isFullTime,int numberOPto) {
      this(company,location,salary);
      this.isFullTime=isFullTime;
      this.numberOPto=numberOPto;

  }

    @Override
    public String toString() {
        return "Offer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOPto=" + numberOPto +
                '}';
    }
}
