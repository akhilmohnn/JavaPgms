import java.util.*;

class Account {
    int accountNo;
    String accountName, accountType;
    double balanceAmount;

    Account(int accno, String name, String type, double balance) {
        accountNo = accno;
        accountName = name;
        accountType = type;
        balanceAmount = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balanceAmount += amount;
            System.out.println("Deposited: " + amount + " | Balance is: " + balanceAmount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balanceAmount) {
            balanceAmount -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance is: " + balanceAmount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    void displayDetails() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name of holder: " + accountName);
        System.out.println("Account type: " + accountType);
        System.out.println("Balance Amount: " + balanceAmount);
    }
}

class AccountDetails2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] accounts = new Account[5];

        for (int i = 0; i < 5; i++) { // Changed to start from 0
            System.out.println("Enter the account details for account " + (i + 1) + ":");
            System.out.print("Enter the account No: ");
            int accountNo = sc.nextInt();
            System.out.print("Enter the account Holder name: ");
            String accountName = sc.next();
            System.out.print("Enter the account Type: ");
            String accountType = sc.next();
            System.out.print("Enter the account Balance: ");
            double accountBalance = sc.nextDouble(); // Changed to nextDouble()

            accounts[i] = new Account(accountNo, accountName, accountType, accountBalance);
        }

        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the account Number: ");
                    int depositAccountNo = sc.nextInt();
                    System.out.print("Enter the amount to deposit: ");
                    double amount1 = sc.nextDouble();
                    for (Account acc : accounts) {
                        if (acc != null && acc.accountNo == depositAccountNo) {
                            acc.deposit(amount1);
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter the account Number: ");
                    int withdrawAccountNo = sc.nextInt();
                    System.out.print("Enter the amount to withdraw: ");
                    double amount2 = sc.nextDouble();
                    for (Account acc : accounts) {
                        if (acc != null && acc.accountNo == withdrawAccountNo) { 
                            acc.withdraw(amount2);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter the account Number: ");
                    int displayAccountNo = sc.nextInt();
                    for (Account acc : accounts) {
                        if (acc != null && acc.accountNo == displayAccountNo) { 
                            acc.displayDetails();
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
