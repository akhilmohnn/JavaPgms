public class Factorial{
	public static void main(String arg[]){
		int n=Integer.parseInt(arg[0]);
		
		int fact=1;
		for(int i=2;i<=n;i++){
			fact*=i;
		}
		System.out.println("Factorial of"+n+"is :"+fact);
		}	
	}
