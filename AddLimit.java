import java.util.Scanner;
public class AddLimit {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum is:"+sum);
    }
    
}
