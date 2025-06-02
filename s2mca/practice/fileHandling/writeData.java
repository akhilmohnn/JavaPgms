import java.io.*;
import java.util.*;

class writeData{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.print("Enter the data to write: ");
String data=sc.nextLine();

try(FileOutputStream fos=new FileOutputStream("output.txt")){
	fos.write(data.getBytes());
	System.out.println("Data written succesfully");
	}
catch(IOException e){
	e.printStackTrace();
	}
}	
	}
