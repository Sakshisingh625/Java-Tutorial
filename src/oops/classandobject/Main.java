package src.oops.classandobject;

public class Main{
    public static void main(String[] args) {
        //creating object of class Student
        Student s1;
        s1=new Student();

        s1.id=1;
        s1.studentName="Ram";
        s1.studentCity="Bangaluru";

        s1.study();
        s1.showFullDetails();



    }
}
