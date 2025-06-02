import java.util.*;
import java.io.*;

class fileSeach{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the directory name: ");
String dirPath=sc.nextLine();

File dir=new File(dirPath);

if(dir.isDirectory() && dir.exists()){
	File[] items=dir.listFiles();
	
	System.out.println("Contents of files are: ");

	for(File item : items){
		if(item.isFile()){
			System.out.println("File name: "+item.getName());
			}
		else if(item.isDirectory()){
			System.out.println("Directory name: "+item.getName());	
			}
		}

	System.out.println("Enter the fileName to search: ");
	String filename=sc.nextLine();

	boolean found=false;
	for(File item: items){
		if(item.getName().equalsIgnoreCase(filename)){
			System.out.println("File found at: "+item.getAbsolutePath());
			found=true;
			break;
			}
		}
	if(!found){
		System.out.println("File not found!");	
		}
	

	}
else{
	System.out.println("Directory not found!");
	}

}

	}
