import java.util.*;
import java.io.*;

class readWrite{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the text to store: ");
String data=sc.nextLine();

try(Writer w1=new FileWriter("Original.txt")){
	w1.write(data);
	}

catch(IOException e){
	e.printStackTrace();
	}

try(Reader r1=new FileReader("Original.txt"); Writer w2=new FileWriter("upper.txt")){
	int ch;
	while((ch=r1.read())!=1){
		w2.write(Character.toUpperCase((char) ch));
		}
	}
catch(Exception e){
	e.printStackTrace();
	}


}

	}
