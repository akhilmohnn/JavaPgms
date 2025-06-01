import java.util.*;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
        	super(message);
    }
	}

public class AgeCalculator{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.print("Enter the age: ");
int age=sc.nextInt();

try{
	if(age<18){
	throw new InvalidAgeException("Age is less than 18!");
	}
	else{
	System.out.println("Eligible to vote");
	}
   }
catch(InvalidAgeException e){
	System.out.println("Error occured: "+e.getMessage());
	}
}
	}
    
