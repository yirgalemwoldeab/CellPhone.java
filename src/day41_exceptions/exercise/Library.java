package day41_exceptions.exercise;

public class Library {

    public String getLibraryCaard(String city){
       if(city.equals("fairfax")||city.equals("mclean")){
            System.out.println("library card created");
        }else{
           throw new NonResidentException();
       }
       return city;
    }
    public Library(){
        super();
    }


    public void borrow(boolean checkout) throws FailToCheckOutException{
        if (checkout==true){
            System.out.println("enjoy reading");
        }else if(checkout==false){

                throw new FailToCheckOutException();
            }


    }
}
