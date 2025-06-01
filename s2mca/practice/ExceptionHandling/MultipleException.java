public class MultipleException{
public static void main(String args[]){

try{
	int a=10,b=0;
//	int result=a/b;
	int[] arr=new int[5];
	System.out.println("10th element: "+arr[10]);
		}

catch(Exception e){
	System.out.println("Error occurred: "+e.getMessage());
	}
   }
}
