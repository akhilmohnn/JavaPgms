package OneShot;


class Pen{
    String color;
    String type; //ballpen,gel

    public void write(){
        System.out.println("Used to write");
    }
    
    public void printColor(){
        System.out.println(this.color);
    }
}


public class Oops{
    public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.color="red";
        pen1.type="ball";
        //pen1.write();

        Pen pen2=new Pen();
        pen2.color="blue";
        pen2.type="gel";

        pen1.printColor();
        pen2.printColor();

    }
}