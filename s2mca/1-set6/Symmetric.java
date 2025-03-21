import java.util.Scanner;


public class Symmetric{
	public static void main(String []args){
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row size:");
		int row=sc.nextInt();
		System.out.print("Enter the column size:");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		
		System.out.println("Enter the values of array:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=sc.nextInt();
				}
				}
		System.out.println("Array elements are:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
					}
		if(row!=col){
		  System.out.println("Not square matrix hence not symmetric!");
		  	}
		else{
		   for(int i=0;i<row;i++){
		   	for(int j=0;j<col;j++){
		   		if(arr[i][j]!=arr[j][i]){
		   			flag=1;
		   			break;
		   			}
	  			   		}
		   		}
		   	}
		   	  				
		if(flag==1){
		System.out.println("Matrix is not symmetric!");
			}
			else{	
			System.out.println("Matrix is symmetric");	
			  }
		}	
	}
	
