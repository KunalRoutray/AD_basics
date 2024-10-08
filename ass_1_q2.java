package assignment1;
import java.util.*;

public class ass_1_q2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int max,min,i,n;
		System.out.println("enter the size of arrayy");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements");	

		for(i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		max=arr[0];
		min=arr[0];
		for(i=1;i<n;i++)
		{
		 if(arr[i]>max)
		 {
			 max=arr[i];
		 }
		 if(arr[i]<min)
		 {
			 min=arr[i];
		 }
		}
		System.out.println("max element is "+max);
		System.out.print("min element is "+min);


	}

}
