import Pack2.Faculty;
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

        Student s=new Student(id,name,age);

        System.out.println("Enter the faculty details");
        System.out.print("Enter the ID");
        id=sc.nextInt();
        System.out.print("Enter the name");
        name=sc.next();
        System.out.print("Enter the age");
        age=sc.nextInt();
        System.out.print("Enter the salary");
        int salary=sc.nextInt();
        Faculty f=new Faculty(id,name,age,salary);

        System.out.println("Student details:");
        s.display();
        
        System.out.println("Faculty details:");
        f.display();

        sc.close();
    }
}