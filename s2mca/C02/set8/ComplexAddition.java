import java.util.*;

class Complex{
double real;
double imaginary;


	Complex(double real,double imaginary){
		this.real=real;
		this.imaginary=imaginary;
		}
		
	Complex add(Complex other){
		double realPart=this.real+other.real;
		double imaginaryPart=this.imaginary+other.imaginary;
		return new Complex(realPart, imaginaryPart);
		}	
		
	void display(){
			System.out.println(real + " + " + imaginary + "i");
			}		
	}




public class ComplexAddition{
public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		System.out.print("Enter the second number:");
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		
		Complex num1=new Complex(a1,a2);
		Complex num2=new Complex(b1,b2);
		
		Complex sum=num1.add(num2);
		
		System.out.print("Sum is: ");
        	sum.display();
		
		}	
	}
