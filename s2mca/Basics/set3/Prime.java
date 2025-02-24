public class Prime{
	public static void main(String arg[]){
	   	int n=Integer.parseInt(arg[0]);
	   	
	   	boolean isPrime=true;
	   	
	   	for(int i=2;i<n;i++){
	   		if(n%i==0){
			   isPrime=false;
			   break;
			   		}
	   	}
			if(isPrime){
			  System.out.println("It is prime");
			  	}
			else{
			  System.out.println("Not a prime number");
			  	}	

		}
}

