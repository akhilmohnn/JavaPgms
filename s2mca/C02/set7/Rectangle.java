
class RectangleDetails{
int length,breadth,area;

	RectangleDetails(){
		length=5;
		breadth=6;
		area=length*breadth;
		}	
	
	void display(){
		System.out.println("Length of rectangle: "+length);
		System.out.println("Breadth of rectangle: "+breadth);
		System.out.println("Area of rectangle: "+area);
		}
	}
	
class Rectangle{
public static void main(String []args){

RectangleDetails r=new RectangleDetails();
r.display();
	}
		}	
