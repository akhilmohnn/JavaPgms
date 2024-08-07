import java.util.Scanner;
public class FuncJava {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=s.nextInt();
        int b=s.nextInt();
        int res=sum(a,b);
        System.out.println("Result is:"+res);

    }

    static int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    
}
