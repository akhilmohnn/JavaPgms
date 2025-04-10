import java.util.*;


class Matrix{

int arr1[][];
int arr2[][];
int sum[][];
int mul[][];

	Matrix(int arr1[][],int arr2[][]){
		this.arr1=arr1;
		this.arr2=arr2;
		this.sum=new int[arr1.length][arr1[0].length];
		this.mul=new int[arr1.length][arr2[0].length];
		}

	void add()
	{
	int r1=arr1.length;
	int c1=arr1[0].length;
	for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++)
			{
			sum[i][j]=arr1[i][j]+arr2[i][j];
			}
				}	
		}
		
	void multiply(){
		int r1=arr1.length;
		int c1=arr1[0].length;
		int c2=arr2[0].length;
		
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				 mul[i][j]=0;
			  for(int k=0;k<c1;k++){
			  	mul[i][j]+=arr1[i][k]*arr2[k][j];
			  }	
				}
			}
		}		
		
		
	void displaySum(){
		
		int r1 = arr1.length;
		int c2=arr2[0].length;
        	int c1 = arr1[0].length;
		System.out.println("Sum of two arrrays are:");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++)
			{
			System.out.print(sum[i][j]+" ");
			}
			System.out.println();
				}
				
				
		System.out.println("Multiple of two arrays are:");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++)
			{
			System.out.print(mul[i][j]+" ");
			}
			System.out.println();
				}		
		}	
	}


class MatrixOperations{
public static void main(String []args){

Scanner sc=new Scanner(System.in);


	System.out.print("Enter the row of matrix1:");
	int rows1=sc.nextInt();
	
	
	System.out.print("Enter the column of matrix1:");
	int cols1=sc.nextInt();
	
	
	System.out.print("Enter the row of matrix2:");
	int rows2=sc.nextInt();
	
	
	System.out.print("Enter the column of matrix2:");
	int cols2=sc.nextInt();

int arr1[][]=new int[rows1][cols1];
int arr2[][]=new int[rows2][cols2];

	
	System.out.println("Enter the first array elements:");
	for(int i=0;i<rows1;i++){
		for(int j=0;j<cols1;j++){
		arr1[i][j]=sc.nextInt();
			}
		}
	
	System.out.println("Enter the second array elements:");
	for(int i=0;i<rows2;i++){
		for(int j=0;j<cols2;j++){
		arr2[i][j]=sc.nextInt();	
		}	}
		
	Matrix matrixop = new Matrix(arr1,arr2);
        matrixop.add();
        matrixop.multiply();
        matrixop.displaySum();			
	
		}
	}
