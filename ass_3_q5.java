import java.util.Scanner;

public class ass_3_q5
{
    public static int pow(int b,int a)
    {
    	if(b==0)
    	 return 0;
    	if(a==0)
    	  return 1;
    	else
    		return b*pow(b,a-1);
    	
    }
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the base:");
		int b= sc.nextInt();
		System.out.println("enter the power:");
		int a= sc.nextInt();
		System.out.println(" the nth power of number is  "+pow(b,a));
	

	}

}
