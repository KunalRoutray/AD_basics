import java.util.*;
public class ass_2_q3_bit_A 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number of elements");
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("enter elementss in sorted way");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int f1=0,f2=n-1;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[f2]+" ");
				f2--;
			}
			else
			{
				System.out.println(arr[f1]+" ");
				f1++;
			}
		}

	}

}
