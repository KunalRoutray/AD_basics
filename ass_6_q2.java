package assignment6;

import java.util.Scanner;

public class ass_6_q2
{

	public static int linear(int s[],int n,int key)
    {
   	 if(n==-1)
   		 return -1;
   	 else if(s[n]==key)
   		 return s[n];
   	 else
   		 return(linear(s,n-1,key));
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the numbers in  array ");
		int n= sc.nextInt();
		System.out.println(" enter the array ");
		int arr[]=new int[n];
		for( int i=0;i< n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(" enter the key");
	    int key = sc.nextInt();
		System.out.println(" the array ");
		for( int i=0;i< n;i++)
		{
			System.out.print( arr[i]+" ");
		}
		
		System.out.println( "\n  we got "+linear(arr,arr.length-1,key));
	}
	


}
