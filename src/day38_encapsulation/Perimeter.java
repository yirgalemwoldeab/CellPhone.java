package day38_encapsulation;

public class Perimeter {
    private int size;
    private int width;

    public Perimeter(int size,int width){
setSize(size);
setWidth(width);
    }
    public void setSize(int size){
        if(size>0)
        this.size=size;
    }
    public int getSize(){
        return size;
    }
    public void setWidth(int width){
       if( width>0)
           this.width = width;

    }
    public int getWidth(){
        return width;
    }

   public int area() {


          int  area1 = width * size;

        return area1;
   }


    @Override
    public String toString() {
        return "Perimeter{" +
                "size=" + size +
                ", width=" + width +
                '}'+area();
    }
}
