package src.oops.classandobject;

public class Student {
    //data : data members : instance variable
    int id;
    String studentName;
    String studentCity;

    //Behaviour: member methods : (functions)
    public void study(){
        System.out.println(id + " is studying.");
    }

    public void showFullDetails(){
        System.out.println("Student name is "+studentName);
        System.out.println("Student id is "+id);
        System.out.println("Student city is "+studentCity);
    }
}
