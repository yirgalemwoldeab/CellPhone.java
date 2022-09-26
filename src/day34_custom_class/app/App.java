package day34_custom_class.app;

public class App {

   String name;
   double version;
   boolean isFree;
   int ratings;

    public void update(){

       System.out.println(name+"is updating");
       version+=0.1;
    }
  public String toString()  {
        return "name: "+name+"\nversion: "+version+"\nisfree"+isFree+"\nrating "+ratings;
  }


}
