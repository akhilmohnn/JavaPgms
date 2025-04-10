import java.util.*;

class Employee1{
int empno,salary;
String name;

	Employee1(int no,String s,int sal){
		empno=no;
		name=s;
		salary=sal;
		}
	
	void display(){
		System.out.println("Employee no. : "+empno);
		System.out.println("Employee name : "+name);
		System.out.println("Employee salary : "+salary);
		}
	}
	
class Employee{	
public static void main(String []args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the employee details:");
	System.out.print("Enter the employee no:");
	int no=sc.nextInt();
	System.out.print("Enter the employee name:");
	String name=sc.next();
	System.out.print("Enter the employee salary:");
	int sal=sc.nextInt();
	
	Employee1 e=new Employee1(no,name,sal);
	e.display();
		}	
	}	
