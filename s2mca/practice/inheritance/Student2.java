import java.util.*;

class studDetails{
int rollNo;
String name;
public void details(int rollNo,String name){
	this.rollNo=rollNo;
	this.name=name;
	}

public void displayBasic(){
    System.out.println("Student rollNo:"+rollNo);
    System.out.println("Student name:"+name);
}
}

class Mark extends studDetails{
int m1,m2,m3;
void markEntry(int m1,int m2,int m3){
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
	}

void displaymarks(){
    System.out.println("Mark1:"+m1);
    System.out.println("Mark2:"+m2);
    System.out.println("Mark3:"+m3);
}    
}

class TotalMark extends Mark{
int total;
void markCalculation(){
total=m1+m2+m3;
}

void displayTotal(){
System.out.println("Total marks is:"+total);	
}

	}

public class Student2{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
    System.out.print("Enter the rollNo: ");
	int rollNo=sc.nextInt();
    System.out.print("Enter name: ");
	String name=sc.next();


    System.out.println("Enter 3 marks: ");
	int m1=sc.nextInt();
	int m2=sc.nextInt();
	int m3=sc.nextInt();
    Mark m=new Mark();
 

    TotalMark t=new TotalMark();
    t.details(rollNo,name);
    t.displayBasic();
    t.markEntry(m1,m2,m3);
    t.displaymarks();
    t.markCalculation();
    t.displayTotal();

	}
}