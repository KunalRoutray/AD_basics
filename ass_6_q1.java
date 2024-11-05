package assignment6;

import java.util.Scanner;

public class ass_6_q1 
{

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
		boolean b= false;
		for( int i=0;i< n;i++)
		{ 
			if(arr[i]==key)
			{
			  b= true;
			}
		}
		System.out.println( "\n  found  "+ b);
		   

	

	}

}
