import java.util.*;

class StudentDetails{
int rollno,engmark,mathmark,tot_mark;
String name;
	
	 StudentDetails(int n,String s,int eng,int math){
		rollno=n;
		name=s;
		engmark=eng;
		mathmark=math;
		tot_mark=engmark+mathmark;
		}
		
	void display(){
		System.out.println("Student roll: "+rollno);
		System.out.println("Student Name: "+name);
		System.out.println("English mark: "+engmark);
		System.out.println("Maths mark: "+mathmark);
		System.out.println("Total mark: "+tot_mark);
		}	
	}
	
class Student{
public static void main(String []args){
	

	int a1=Integer.parseInt(args[0]);
	String a2 = args[1];
	int a3=Integer.parseInt(args[2]);
	int a4=Integer.parseInt(args[3]);
	
	StudentDetails s=new StudentDetails(a1,a2,a3,a4);
	s.display();	
	}	

		}	
