import java.util.*;

class SumCalculator{
	int sum(int a,int b){
		return a+b;
		}
	double sum(double a,double b){
		return a+b;
		}
	double sum(int a,double b){
		return a+b;
		}
}

public class SumMeth{
public static void main(String args[]){
		
Scanner sc=new Scanner(System.in);

SumCalculator c=new SumCalculator();

System.out.println("Enter two int values:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Sum of two integers are:"+c.sum(a,b));

System.out.println("Enter two double values:");
double a2=sc.nextDouble();
double b2=sc.nextDouble();
System.out.println("Sum of two integers are:"+c.sum(a2,b2));
	
System.out.println("Enter one int and double:");
int a3=sc.nextInt();
double b3=sc.nextDouble();
System.out.println("Sum of two integers are:"+c.sum(a3,b3));

	}
	
	}
