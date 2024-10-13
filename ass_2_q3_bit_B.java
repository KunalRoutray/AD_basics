import java.util.Scanner;

public class ass_2_q3_bit_B
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number of elements");
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("enter elementss unsorted way");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
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
