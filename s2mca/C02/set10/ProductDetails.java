import java.util.*;

class Product{
int pcode;
String pname;
double price;

	Product(int code,String s,double pr){
		pcode=code;
		pname=s;
		price=pr;
		}	
		
	void display(){
		System.out.println("Product code: "+pcode);
		System.out.println("Product code: "+pname);
		System.out.println("Product code: "+price);
		}
	}
	
class ProductDetails{
public static void main(String []args){

Scanner sc=new Scanner(System.in);
Product prd[]=new Product[3];

for(int i=0;i<3;i++){
	System.out.print("Enter the product code: ");
	int pcode=sc.nextInt();
	System.out.print("Enter the product name: ");
	String pname=sc.next();
	System.out.print("Enter the product price: ");
	double salary=sc.nextDouble();
	System.out.println("");
	
	prd[i]=new Product(pcode,pname,salary);
	
	
	}
	
	/*for(Product pr : prd){
		pr.display();	
		}*/
		
	for(int i=0;i<3;i++){	
		prd[i].display();
		}	
	
	Product lowest=prd[0];
	for(int i=0;i<3;i++){
		if(prd[i].price<lowest.price){
			lowest=prd[i];
			}
		}	
			System.out.println("Lowest price is: "+lowest.price);
		
		}	
	}	
