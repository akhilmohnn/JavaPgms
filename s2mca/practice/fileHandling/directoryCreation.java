import java.io.File;
import java.util.*;

public class directoryCreation{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter dir. name to create: ");
	String name=sc.nextLine();
	
	try{
		File f=new File(name);
		if(f.mkdir()){
			System.out.println("Directory created: "+f.getName());
			}
		else{
			System.out.println("Directory already exists!");
			}
        System.out.println("is exists: "+f.exists());
        System.out.println("Absolute path: "+f.getAbsolutePath());
        System.out.println("is file: "+f.isFile());
                System.out.println("is directory: "+f.isDirectory());
        
            
	}
	catch(Exception e){
		e.printStackTrace();
		}
	
	}
}
