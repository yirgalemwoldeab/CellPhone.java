package day37_static.car;

public class Driver {
    String name;
    long licenceNum;
    char licenceType;

    public Driver(String name, long licenceNum, char licenceType) {
        this.name = name;
        this.licenceNum = licenceNum;
        this.licenceType = licenceType;
    }


    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceNum=" + licenceNum +
                ", licenceType=" + licenceType +
                '}';
    }
}
