import java.io.File;
import java.util.*;

public class fCreation{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

    System.out.print("Enter the file name to create: ");
	String name=sc.nextLine();
	
	try{
		File f=new File(name);
		if(f.createNewFile()){
			System.out.println("File created: "+f.getName());
			}
		else{
			System.out.println("File already exists");
			}
        System.out.println("is exists:"+f.exists());
	System.out.println("is directory:"+f.isDirectory());
	System.out.println("is file:"+f.isFile());
	System.out.println("Absolute path:"+f.getAbsolutePath());
    
		}
	
    catch(Exception e){
        e.printStackTrace();
    }    
}
	}
