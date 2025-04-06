import java.util.*;

class StudentDetails{
int id;
String name;
	
	StudentDetails(int n,String s){
		id=n;
		name=s;
		}
		
	void display(){
		System.out.println("Student id: "+id);
		System.out.println("Student Name: "+name);
		}	
	}
	
class Student3{
public static void main(String []args){
	
	StudentDetails s=new StudentDetails(1,"Akhil");
	s.display();	
	}	

		}	
