import java.util.Scanner;

public class ass_3_q4 
{   
	public static int fib(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		else 
			return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args)
	{

		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number  is :");
		int n= sc.nextInt();	
		System.out.println(" the number is  "+fib(n-1));


	}

}