import java.util.*;

class Person{
int age;
String name;

Person(int age,String name){
this.age=age;
this.name=name; 
}
	}

class Employee extends Person{
int salary;

Employee(int age,String name,int salary){
super(age,name);
this.salary=salary; 
}

void display(){
System.out.println("Employee name: "+name);
System.out.println("Employee age: "+age);
System.out.println("Employee salary: "+salary);
}
	}

public class PersonDetails{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Employee details: ");
System.out.print("Enter name: ");
String name=sc.next();
System.out.print("Enter age: ");
int age=sc.nextInt();
System.out.print("Enter salary: ");
int salary=sc.nextInt();

Employee e=new Employee(age,name,salary);
e.display();

}
	}