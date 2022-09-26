package day34_custom_class.house;

public class House {
    
    String type;
    double squaareFeet;
    int numberOfBedrooms;
    int numberOfBaths;
    boolean inCity;
    boolean hasGarage;
    
    
    public double calculateMortgage(){
        
        if(numberOfBedrooms==2){
            return  1500;
            
        } else if (numberOfBaths<4) {
            return 2000;
            
            
        }else {
            return 2500;
        }
    }

  
    
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", squaareFeet=" + squaareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBaths=" + numberOfBaths +
                ", inCity=" + inCity +
                ", hasGarage=" + hasGarage +
                '}';
    }
}
    
    
    

