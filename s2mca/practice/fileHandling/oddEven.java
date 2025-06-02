import java.io.*;
import java.util.*;

class oddEven{
public static void main(String args[]){
	
Scanner sc1=new Scanner(System.in);

System.out.print("Enter the numbers to split: ");
String numbers=sc1.nextLine();
File n=new File("numbers.txt");

try(Writer w1=new FileWriter(n)){
	w1.write(numbers);
	}
catch(Exception e){
	e.printStackTrace();
	}

    File odd=new File("odd.txt");
    File even=new File("even.txt");
    try(Scanner sc=new Scanner(n); Writer oddSet=new FileWriter(odd); Writer evenSet=new FileWriter(even)){
	while(sc.hasNext()){
		if(sc.hasNextInt()){
			int num=sc.nextInt();
			if(num%2==0){
				evenSet.write(num+"\n");
				}
			else{
				oddSet.write(num+"\n");
				}
			}
		else{
			sc.next();
			}
		}
    }
    catch(Exception e){
	e.printStackTrace();
    }
    

	}		
}
