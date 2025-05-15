import java.util.Scanner;

class Account {
    int accNo;
    String name;
    String accType;
    double balance;

   
    Account(int accNo, String name, String accType, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.accType = accType;
        this.balance = balance;
    }

  
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }


    void displayDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }
}

public class nineOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            int accNo = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Account Type (Savings/Current): ");
            String accType = scanner.nextLine();
            System.out.print("Initial Balance: ");
            double balance = scanner.nextDouble();

            accounts[i] = new Account(accNo, name, accType, balance);
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNo = scanner.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    for (Account acc : accounts) {
                        if (acc != null && acc.accNo == accNo) {
                            acc.deposit(amount);
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    accNo = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    for (Account acc : accounts) {
                        if (acc != null && acc.accNo == accNo) {
                            acc.withdraw(amount);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accNo = scanner.nextInt();
                    for (Account acc : accounts) {
                        if (acc != null && acc.accNo == accNo) {
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
        scanner.close();
    }
}
