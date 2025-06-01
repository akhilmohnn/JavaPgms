import java.util.*;

interface Shape{
void area();
	}

class Rectangle implements Shape{
double length,breadth;

Rectangle(double length,double breadth){
this.length=length;
this.breadth=breadth;
}

public void area(){
double area=length*breadth;	
System.out.println("Area of the rectangle: "+area);
}
	}

class Circle implements Shape{
double radius;

Circle(double r){
radius=r;
}

public void area(){
double area=Math.PI*radius*radius;
System.out.println("Area of circle: "+area);
}
	}

public class AreaCalculator{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter length and breadth: ");
double l=sc.nextDouble();
double b=sc.nextDouble();
Rectangle r=new Rectangle(l,b);
r.area();

System.out.println("Enter the radius");
double radius=sc.nextDouble();
Circle r2=new Circle(radius);
r2.area();

}
	}