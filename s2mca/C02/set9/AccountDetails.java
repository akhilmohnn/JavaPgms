import java.util.*;

class Account{
static int nextAccountno=1001;	
int accountNo;
String accountName,accountType;
double balanceAmount;

    Account(String name,String type,double balance){
	accountNo=nextAccountno++;
	accountName=name;
	accountType=type;
	balanceAmount=balance;	
	}
	
void deposit(double amount){
	if(amount>0){
		balanceAmount+=amount;
		System.out.println("Deposited: "+amount+ "Balance is: "+balanceAmount);
		}
	else{
		System.out.println("Invalid amount");
			}	
	
	}	
	
void withdraw(double amount){
	if(amount>0 && amount<=balanceAmount){
		balanceAmount-=amount;
		System.out.println("Withdrawed: "+amount+ "Balance is: "+balanceAmount);
		}
	else{
		System.out.println("Invalid amount");
			}
		
	}
	
void displayDetails(){
	System.out.println("Account No: "+accountNo);
	System.out.println("Name of holder: "+accountName);
	System.out.println("Account type: "+accountType);
	System.out.println("Balance Amount: "+balanceAmount);
	System.out.println("");
	}	
	
	}

class AccountDetails{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		Account[] accounts=new Account[5];
		
		for(int i=0;i<5;i++){
			System.out.println("");
			System.out.println("Enter the account details account "+ (i + 1 ) +":");
			System.out.print("Enter the account Holder name: ");
			String accountName=sc.next();
			System.out.print("Enter the account Type: ");
			String accountType=sc.next();
			System.out.print("Enter the account Balance: ");
			double accountBalance=sc.nextDouble();

			accounts[i]=new Account(accountName,accountType,accountBalance);
			}
			int accNo;
			int choice;
			do{
				System.out.println("--MENU--");
				System.out.println("1.Display account details:");
				System.out.println("2.Deposit:");
				System.out.println("3.Withdraw:");
				System.out.println("4.Exit");
				System.out.println("Enter your choice:");
				choice=sc.nextInt();

				switch (choice) {
					case 1: System.out.println("Enter the account Number:");
							accNo=sc.nextInt();
							for (Account acc: accounts){
								if(acc!=null && acc.accountNo==accNo){
									acc.displayDetails();
									break;
								}
							}
						
						break;
					
					case 2: System.out.println("Enter the account number:");
							accNo=sc.nextInt();
							System.out.println("Enter the amount to deposit:");
							double amount=sc.nextDouble();
							for(Account acc : accounts){
								if(acc!=null && acc.accountNo==accNo){
									acc.deposit(amount);
									break;
								}
							}
							break;
					
					case 3: System.out.println("Enter the account number:");
							accNo=sc.nextInt();
							System.out.println("Enter the amount to withdraw:");
							double withdrawAmount=sc.nextDouble();
							for(Account acc : accounts){
								if(acc!=null && acc.accountNo==accNo){
									acc.withdraw(withdrawAmount);
									break;
								}
							}
							break;
					case 4 : System.out.println("Exiting...");
								break;

					default: System.out.println("Invalid choice!");
				}

				
			}while(choice!=4);

			sc.close();
		}	
		
	}	
