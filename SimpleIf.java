import java.util.Scanner;
public class SimpleIf {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num<0)
        {
            System.out.println("It is negative");
        }
        else
        {
            System.out.println("Positive");
        }
        
    }
}
