import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit:");
        int limit = scanner.nextInt();
        
        System.out.println("Prime numbers up to " + limit + " are:");
        for(int num=2;num<=limit;num++) {
            if(isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if(number<=1) {
            return false;
        }
        for(int i=2;i<number;i++) {
            if(number%i==0) {
                return false;
            }
        }
        return true;
    }
}
