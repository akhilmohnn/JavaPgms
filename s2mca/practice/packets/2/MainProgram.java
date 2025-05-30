import Pack2.Student;
//import Pack2/Faculty;
import java.util.*;

public class MainProgram{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the student details: ");
        System.out.print("Enter the ID:");
        int id=sc.nextInt();
        System.out.print("Enter the name:");
        String name=sc.next();
        System.out.print("Enter the age:");
        int age=sc.nextInt();

        Student s=new Student();
        s.input(id,name,age);
        s.display();


    }
}