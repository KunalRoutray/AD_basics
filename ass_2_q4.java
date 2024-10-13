import java.util.*;
public class ass_2_q4 
{

	public static void main(String[] args)
	{
		int fact=1;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number ");
		int n= sc.nextInt();	
		for(int i=n;i>0;i--)
		{
			 fact*=i;
		}
        System.out.println("the factoril is "+fact);
	}

}
