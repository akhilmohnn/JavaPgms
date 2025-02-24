public class Fibonacci{
	public static void main(String arg[]){
	   	int a=Integer.parseInt(arg[0]);
	   	int sum1=0,sum2=1,sum=0;
	   	
	   	System.out.println(sum1);
	   	System.out.println(sum2);
	   	
	   	for(int i=1;i<=a;i++){
	   		sum=sum1+sum2;
	   		sum1=sum2;
	   		sum2=sum;
	   		System.out.println(sum);
	   	
	   		}
	   	
	   	}
		
		
}

