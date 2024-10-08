package assignment1;
import java.util.*;
public class ass_1_q3
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
    	int n=sc.nextInt();
    	System.out.println("enter the number of rotation");
    	int k=sc.nextInt();
    	k=k%n;
    	int arr[]=new int[n];
    	int temp[]=new int[n];
    	System.out.println("enter the elements");
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
    	 
    	for(int i=0;i<n;i++)
    	{
    		if(i<(n-k))
    		{
               temp[i+k]=arr[i];
    		}
    		else
    		{
    			temp[i-(n-k)]=arr[i];
    		}
    	}
    	
    	
    	for(int i=0;i<n;i++)
    	{
    		System.out.println(temp[i]);
    	}


	}

}
