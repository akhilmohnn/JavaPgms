import java.util.*;

class MatrixOperations{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the row of matrix1:");
		int rows=sc.nextInt();
		
		System.out.print("Enter the columns of matrix1:");
		int cols=sc.nextInt();
		
		
		System.out.print("Enter rows of matrix2:");
		int rows2 = sc.nextInt(); 
		
		System.out.print("Enter the columns of matrix2:");
		int cols2=sc.nextInt();
		 
		
		if (cols != rows2) {
			    System.out.println("cols and rows are different");
			    return;
			    }

		
		int arr1[][]=new int[rows][cols];
		int arr2[][]=new int[rows2][cols2];
		int sum[][]=new int[rows][cols];
		int mul[][]=new int[rows][cols2];
		
		System.out.println("Enter the first array elements");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++)
			{
			arr1[i][j]=sc.nextInt();
			}
				}
		
		System.out.println("Enter the second array elements");
		for(int i=0;i<rows2;i++){
			for(int j=0;j<cols2;j++)
			{
			arr2[i][j]=sc.nextInt();
			}
				}
		
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++)
			{
			sum[i][j]=arr1[i][j]+arr2[i][j];
			}
				}

		
		System.out.println("Sum of two arrrays are:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++)
			{
			System.out.print(sum[i][j]+" ");
			}
			System.out.println();
				}
		
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols2;j++)
			{
			  mul[i][j]=0;
			  for(int k=0;k<cols;k++){
			  	mul[i][j]+=arr1[i][k]*arr2[k][j];
			  }	
			}
				}

		System.out.println("Multiple of two arrays are:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols2;j++)
			{
			System.out.print(mul[i][j]+" ");
			}
			System.out.println();
				}
		
			
		
		}	
	}
