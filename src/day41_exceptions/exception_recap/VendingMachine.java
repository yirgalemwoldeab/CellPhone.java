package day41_exceptions.exception_recap;

public class VendingMachine {

  public static String select(int selection)  {

      String item="";
      if(selection==1){
          item="chips";
      } else if (selection==2) {
          item="gum";
throw new  OutOfStackException();
      } else if (selection==3) {
          item="candy";

      }
      return item;
  }


    public static String selectValid(int selection) throws InvalidSelectionException {

        String item="";
        if(selection==1){
            item="chips";
        } else if (selection==2) {
            item="gum";

        } else if (selection==3) {
            item="candy";

        }else {
            throw new InvalidSelectionException();
        }
        return item;
    }







    public static void main(String[] args) {
        System.out.println(5/0);
    }

}
