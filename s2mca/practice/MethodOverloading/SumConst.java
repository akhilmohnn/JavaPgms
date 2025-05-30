import java.util.*;

class SumOperation{
		int a,b;
		double x,y;

SumOperation(int a,int b){
	this.a=a;
	this.b=b;
		}

SumOperation(double x,double y){
	this.x=x;
	this.y=y;
	}	

SumOperation(int a,double y){
	this.a=a;
	this.y=y;
	}

int Add(){
	return a+b;
	}

double doubleAdd(){
	return x+y;
	}
	
double mixAdd(){
	return a+y;
	}

}

public class SumConst{
public static void main(String arg[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter two int numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
SumOperation c1=new SumOperation(a,b);
System.out.println("Sum of integers are:"+c1.Add());

System.out.println("Enter two double numbers:");
double n1=sc.nextDouble();
double n2=sc.nextDouble();
SumOperation c2=new SumOperation(n1,n2);
System.out.println("Sum of double are: "+c2.doubleAdd());

System.out.println("Enter one int & double numbers:");
int s0=sc.nextInt();
double s1=sc.nextDouble();
SumOperation c3=new SumOperation(s0,s1);
System.out.println("Sum of int and double are:"+c3.mixAdd());

		}
	}