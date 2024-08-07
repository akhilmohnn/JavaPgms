import java.util.Scanner;
public class Largest 
{
    public static int LargestNum(int[] array){
        int largest=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>largest)
            {
                largest=array[i];
            }

        }
     return largest;   
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the limit");
        int size=sc.nextInt();

        int[] numbers=new int[size];

        System.out.println("Enter array elemts");
        for(int i=0;i<size;i++)
        {
            numbers[i]=sc.nextInt();
        }
        int Largest=LargestNum(numbers);
        System.out.println("Largest is:"+Largest);



    }
    


}



