import java.util.*;

class NegativeNumberException extends Exception{
  NegativeNumberException(String message){
	super(message);	
	}	
}

class NumberSum{
public static void main(String args[]){
double sum=0,count=0;
Scanner sc=new Scanner(System.in);

System.out.print("Enter the number of inputs:");
int n=sc.nextInt();

for(int i=0;i<n;i++){
	try{
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
	if(num<0){
		throw new NegativeNumberException("Negative number detected");
		}
	else{
		sum+=num;
		count++;
           }
		}
	catch(NegativeNumberException e){
	    System.out.print(e.getMessage());
	}	
	    }
	
	if(count>0){
		    System.out.print("Average is:"+sum/count);
		}
	
}
    }
