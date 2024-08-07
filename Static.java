import java.util.Scanner;
public class Static {
    int a=10;
    static int b=20;

    public static void main(String arg[])
    {
        Static h=new Static();
        Static h1=new Static();
        System.out.print("h.a:"+h.a+"\n");
        
        System.out.println("h.b:"+h.b+"\n");
        h.b=50;
        h.a=100;
        h.b=2700;
        System.out.println("h.b:"+h.b+"\n");

        h1.b=100;
        h1.a=1500;
        b=2500;
        System.out.println("h.a:"+h.a);
    }

    
}
