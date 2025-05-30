import Pack.Calculations;
import java.util.*;

public class MainProgram{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int num=sc.nextInt();

Calculations c=new Calculations();

System.out.println("Number is: "+num);
System.out.println("Square is: "+c.square(num));
System.out.println("Cube is: "+c.cube(num));
System.out.println("Square root is:"+c.root(num));

sc.close();
}
	}