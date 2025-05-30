package Pack2;

public class Student{
    int id,age;
    String name;

    public void input(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+name);
        System.out.println("Student Age: "+age);
    }
}