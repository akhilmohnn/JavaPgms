import java.util.*;

class Employee{
    int eNo;
    String eName;
    double eSalary;
    
    Employee(int no,String s,double sal){
        eNo=no;
        eName=s;
        eSalary=sal;
        }
    
    void display(){
        System.out.println("Employee ID : "+eNo);
        System.out.println("Employee Name : "+eName);
        System.out.println("Employee Salary : "+eSalary);
        }    
    }

class EmployeeDetails{
public static void main(String []args){
Scanner sc=new Scanner(System.in);


int count;
System.out.println("Enter the number of employees: ");
count=sc.nextInt();
Employee employee[]=new Employee[count];

for(int i=0;i<count;i++){
    System.out.print("Enter the ID: ");
    int no=sc.nextInt();
    System.out.print("Enter the Name: ");
    String s=sc.next();
    System.out.print("Enter the Salary: ");
    double sal=sc.nextDouble();
    System.out.println(" ");
    employee[i]=new Employee(no,s,sal);
    }
    System.out.print("Enter the employeeID to search: ");
    int searchNo=sc.nextInt();
    
    for(Employee emp : employee){
        if(emp!=null && emp.eNo==searchNo){
            emp.display();
            }
        }
        }    
    
    
    }   


