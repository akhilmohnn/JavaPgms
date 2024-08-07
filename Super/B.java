package Super;

public class B extends A{

    int a;
    void display()
    {
        System.out.println("Its B");

        a=20;
        super.a=300;
        int c=a+super.a;
        System.out.println(c);

        //super.display(); //by this super function can also display 
    }
    void superDisplay()
    {
        super.display();
    }
    B()
    {
        System.out.println("Constructor of B");
    }
    B(int a)
    {
        //super(10); //enable to call A's argue constructor, it should be the frst statement of constructor
        System.out.println("Arguement constructor of B");
    }
    
    public static void main(String arg[])
    {
       //B ob=new B(); //for calling normally

       B ob=new B(10); //for calling that has arguement

    //    ob.display(); 
    //    ob.superDisplay(); 
    }  
}
