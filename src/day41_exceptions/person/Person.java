package day41_exceptions.person;

public class Person {

   private String name;
 private   int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    public void setAge(int age){
        if(age<0||age >120){
            throw new IllegalArgumentException("age shoul be greater than 0 and less than 120");

        }
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
