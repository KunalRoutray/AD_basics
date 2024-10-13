import java .util.*;
public class ass_2_q1 
{

	public static void main(String[] args)
	{
	Scanner sc= new Scanner (System.in);
	System.out.println("enter the number of elements");
	int n= sc.nextInt();
	int arr[] = new int[n];
	System.out.println("enter elements");
	for(int i=1;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int maxm=arr[0];
	int maxf=arr[0];
	for (int i=0; i<n;i++)
	{
		maxm=maxm+arr[i];
		maxm=Math.max(maxm,arr[i]);
		if(maxm>maxf)
		{
			maxf=maxm;
		}
		
	}
	System.out.println("sum of largest contigoud subarray "+maxf);

	}

}
