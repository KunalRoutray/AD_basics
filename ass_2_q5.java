import java.util.*;
public class ass_2_q5 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number ");
		int n= sc.nextInt();
		int a=0,b=1,sum=0;
		if(n==1)
			System.out.println("series is  "+a);
		if(n==2)
			System.out.println("series is  "+a+" "+b);
		else
		{   
			System.out.print("series is  "+a+" ,"+b+" ,");
		
			for (int i=3;i<=n;i++)
			{
				sum=a+b;
				System.out.print(sum+" ,");
				a=b;
				b=sum;
				
			}
		}
		
	}

}
