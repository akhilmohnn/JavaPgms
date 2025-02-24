public class ThreeLoop{
	public static void main(String arg[]){
	   	int a=Integer.parseInt(arg[0]);
	   	int i=1,sum1=0;

	   	while(i<=a){
	   	sum1+=i;
	   	i++;
	   		}
	   	System.out.println("Sum using while:"+sum1);
	   	
	   	
	   	
	   	int j=1,sum2=0;
		do{
		sum2+=j;
		j=j+1;
		}while(j<=a);
		
		System.out.println("Sum using do-while:"+sum2);		


		int k=1,sum3=0;
		for(k=1;k<=a;k++){
		sum3+=k;
		}
		System.out.println("Sum using for-loop:"+sum3);		
		
		

		}
		
		
}

