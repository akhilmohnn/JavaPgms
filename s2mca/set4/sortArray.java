import java.util.*;

class sortArray{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int arr[]=new int[5];

System.out.println("Enter 5 array elements:");
for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();		
		}
	
Arrays.sort(arr);		
System.out.println("Sorted array elements are:");
for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);		
		}
		

	
	}
	
	}
