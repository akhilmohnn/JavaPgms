import java.util.*;

class stud_details{
int rollNo;
String name;
 stud_details(int rollNo,String name){
	this.rollNo=rollNo;
	this.name=name;
	}
}

class Marks extends stud_details{
int m1,m2,m3;
Marks(int rollNo,String name,int m1,int m2,int m3){
	super(rollNo,name);
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	}
}

class Total extends Marks{
int total;
Total(int rollNo,String name,int m1,int m2,int m3){
super(rollNo,name,m1,m2,m3);
total=m1+m2+m3;
}

void display(){
System.out.println("Total marks is:"+total);	
}

	}

public class Student{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int rollNo=sc.nextInt();
	String name=sc.next();
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
	Total t=new Total(rollNo,name,m1,m2,m3);
	t.display();	

	}
}