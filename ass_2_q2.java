import java.util.Scanner;

public class ass_2_q2
{

	public static void main(String[] args) 
	{   int pos;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number of elements");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		int temp[]=new int[max];
		for(int i=0;i<n;i++)
		{
			pos=arr[i]-1;
			temp[pos]=1;
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=1)
			 System.out.println("missing number is "+(i+1));
			break;
			
		}
	}

}
