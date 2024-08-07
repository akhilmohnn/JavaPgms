import java.util.Scanner;

class Sum{
    int num1,num2,num3;

    void calculateSum()
    {
        num3=num1+num2;
    }
    void display()
    {
        System.out.println(+num3);
    }
}

public class AddSample {
    public static void main(String arg[])
    {
        Sum s=new Sum();
        s.num1=10;
        s.num2=15;
        s.calculateSum();
        s.display();

    }

    
}
