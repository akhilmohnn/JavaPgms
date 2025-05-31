package Pack2;

public class Faculty{
int id,age,salary;
String name;

public Faculty(int id,String name,int age,int salary){
this.id=id;
this.name=name;
this.age=age;
this.salary=salary;
}

public void display(){
System.out.println("Faculty ID: "+id);
System.out.println("Faculty Name: "+name);
System.out.println("Faculty Age: "+age);
System.out.println("Faculty salary: "+salary);	
	
}
	}