import java.util.*;

class StudentDetails{
int id;
String name;
	
	void insert(int n,String s){
		id=n;
		name=s;
		}
		
	void display(){
		System.out.println("Student id: "+id);
		System.out.println("Student Name: "+name);
		}	
	}
	
class Student{
public static void main(String []args){
	
	StudentDetails s=new StudentDetails();
	s.insert(1,"Akhil");
	s.display();	
	}	

		}	
