import java.util.*;

interface Animal{
    void sound();
}

interface Species{
    void alive();
}

class Dog implements Animal,Species{

    public void alive(){
        System.out.println("Dog is alive");
    }

    public void sound(){
        System.out.println("Dog barks");
    }
}

public class Sample{
    public static void main(String args[]){

        Dog d=new Dog();
        d.alive();
        d.sound();
    }
}



