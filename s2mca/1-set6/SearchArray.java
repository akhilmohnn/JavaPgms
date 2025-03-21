import java.util.Scanner;

public class SearchArray{
	public static void main(String []args){
		int arr[]=new int[5];
		int key,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("Enter the key to search:");
		key=sc.nextInt();	
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
			     System.out.println(key+" Present in : "+(i+1));
			     flag=1;
			     continue;
				}				
		}	
		if(flag==0){
			System.out.println("Element not found in array");
			}
			
		}	
	}
