package day34_custom_class;

public class School {
    public static void main(String[] args) {

    Student studentOne=new Student();
        System.out.println(studentOne);


        studentOne.name="olena";
        studentOne.batchNumber=27;
       studentOne.program="SDET";
       studentOne.grade=99.99;

        System.out.println(studentOne);


        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);
studentOne.study();



        Student studentTwo=new Student();
        System.out.println(studentTwo.name);
        System.out.println(studentTwo.batchNumber);
        System.out.println(studentTwo.program);
        System.out.println(studentTwo.grade);

studentTwo.study();
    }
}
