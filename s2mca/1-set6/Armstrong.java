import java.util.scanner;


class Armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int lowest=sc.nextInt();
		int highest=sc.nextInt();
		for(int num=lowest;num<highest;num++){
			if(isArmstrong(num)){
				System.out.println(num + "");
				}
			}
		}	
	}




public static boolean isArmstrong(int number){
	if(number<100 || number>999) return false;
	int originalNumber=number, sum=0;
	while(number>0){
		int digit=number%10;
		sum+=digit*digit*digit;
		number/=10;
		}	
	return sum==originalNumber;	
	}
	
	
	
	
