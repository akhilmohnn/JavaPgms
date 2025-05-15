import java.util.*;

class Employee{
	
	int empId;
	String empName;
	double empBasic;
	double hra;
	double da;
	double GrossSalary;
	
	Employee(int empId,String empName,double empBasic){
		this.empId=empId;
		this.empName=empName;
		this.empBasic=empBasic;
		calculateGross();
		}
		
	void calculateGross(){
		this.hra=(empBasic*5)/100;
		this.da=(empBasic*10)/100;
		this.GrossSalary=hra+da+empBasic;
		}
	
	void displayDetails(){
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Gross Salary: "+GrossSalary);
		}	
	
	}

class Salary{
public static void main(String []args){	
	Scanner sc=new Scanner(System.in);
	Employee[] employee= new Employee[5];
	
	for(int i=0;i<5;i++){
		System.out.println("Enter the details employee"+(i+1)+":");
		System.out.print("Enter the Employee ID: ");
		int empId=sc.nextInt();
		System.out.print("Enter the Employee Name: ");
		String empName=sc.next();
		System.out.print("Enter the Employee salary: ");
		double empBasic=sc.nextDouble();	

		employee[i]= new Employee(empId,empName,empBasic);
			}
	
	System.out.println("Employee Details are : ");
	for(Employee emp : employee){
		emp.displayDetails();
		}				
		}

	}
