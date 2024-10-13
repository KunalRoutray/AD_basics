import java.util.Scanner;

public class ass_3_q2 
{
   public static int maximum(int arr[],int n,int max)
   {
	   for(int i=0;i<n;i++)
	   {
		   if(arr[i]>max)
		   {
			   max=arr[i];
		   }
		  
	   }
	   return (max);
   }
   public static int minimum(int arr[],int n,int min)
   {
	   for(int i=0;i<n;i++)
	   {
		   if(arr[i]<min)
		   {
			   min=arr[i];
		   }
		  
	   }
	   return (min);
   }
   
  
   
   
	public static void main(String[] args)
	{

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
		int min=arr[0];
		 System.out.println(" maximun element  "+maximum(arr,arr.length,max));
		 System.out.println(" minimum element  "+minimum(arr,arr.length,min));

	}

}
