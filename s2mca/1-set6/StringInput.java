import java.util.*;

public class StringInput{	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String SInput=sc.nextLine();
		System.out.println("Entered string is:"+SInput);
		
		System.out.println("Length of string is:"+SInput.length());
		
		System.out.println("1st and 4th characters are: "+SInput.charAt(1)+" and "+SInput.charAt(3));
		
		
		System.out.println("Enter start index:");
		int l=sc.nextInt();
		System.out.println("Substring from"+l+" is : "+SInput.substring(l));
		
		System.out.println();
		
		System.out.println("Enter substring range:");
		int l1=sc.nextInt();
		int l2=sc.nextInt();
		System.out.println("Substring from"+l1+" to "+l2+" is : "+SInput.substring(l1,l2));
		
		
		
		
		}	
		
		
	}
