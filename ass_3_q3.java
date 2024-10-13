import java.util.Scanner;

public class ass_3_q3 
{
    public static int factorial(int n)
    {
    	if(n==0)
    		return 1;
    	else 
    		return n*factorial(n-1); 
    }
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number  is :");
		int n= sc.nextInt();	
		System.out.println(" factorial of the number  "+factorial(n));

	}

}
