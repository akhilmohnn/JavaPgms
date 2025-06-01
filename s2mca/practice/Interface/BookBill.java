import java.util.*;

interface BillCalc{
	void calculate();
	}

class Bill implements BillCalc{

String productId,name;
int quantity;
double unitPrice,total;

	Bill(String productId,String name,int quantity,double unitPrice){
		this.productId=productId;
		this.name=name;
		this.quantity=quantity;
		this.unitPrice=unitPrice;
		}

	public void calculate(){
		total=unitPrice*quantity;
		}

	void display(){
		System.out.printf("%-10s %-10s %-10d %-10.2f %-10.2f\n",productId,name,quantity,unitPrice,total);
		}

	double getTotal(){
		return total;
		}
}

public class BookBill{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.print("Enter the orderNo: ");
int orderNo=sc.nextInt();

System.out.print("Enter the date: ");
String date=sc.nextLine();
sc.nextLine();

System.out.println("Enter the product details:");
System.out.print("Enter the number of products");
int n=sc.nextInt();


Bill[] items=new Bill[n];

for(int i=0;i<n;i++){
    System.out.print("\nEnter the product id: ");
    String productId=sc.nextLine();
    sc.nextLine();
    
    System.out.print("Enter the product name: ");
    String name=sc.nextLine();
    
    System.out.print("Enter the product quantity: ");
    int quantity=sc.nextInt();
    
    System.out.print("Enter the product price: ");
    double price=sc.nextDouble();
    
    items[i]=new Bill(productId,name,quantity,price);
}
double netAmount=0;
System.out.println("orderNo: "+orderNo);
System.out.println("Date: "+date);
System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","ProductId","name","quantity","price","total");
for(Bill b: items){
    b.calculate();
    b.display();
    netAmount+=b.getTotal();
}

System.out.println("---------------------------------------------");
System.out.printf("%40s: %.2f","netAmount",netAmount);

	}
}
