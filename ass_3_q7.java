import java.util.Scanner;

public class ass_3_q7
{
     public static int gcd(int n,int m)
     {
    	 if(n==0)
    		 return m;
    	 if(m==0)
    		 return n;
    	 else
    		 return gcd(m,n%m);
     }
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the 1st term:");
		int n= sc.nextInt();
		System.out.println("enter the 2nd term:");
		int m= sc.nextInt();
		System.out.println(" the gsd is  "+gcd(n,m));
		

	}

}
