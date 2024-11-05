
public class ass_5_q1 
{

	public static void main(String[] args) 
	{
		int count=0;
		int arr[]= {5,3,1,2,1};
		int n= arr.length;
		for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("  ");
		while(n!=0)
		{
			int min = arr[0];
			for (int i=0;i<n;i++)
			{
				if(arr[i]<min)
					min=arr[i];
			}
			for (int i=0;i<n;i++)
			{
				arr[i]=arr[i]-min;
			}
			int j=0,c=0;
			for (int i=0;i<n;i++)
			{
				if(arr[i]!=0)
				{
					arr[j]=arr[i];
					j++;
					
				}
				else
				{
					c++;
				}
			}
			n=n-c;
			for (int i=0;i<n;i++)
			{
				System.out.print(arr[i]);
			}
			System.out.println("  ");
			count++;
		}
		System.out.print("total number of reduction is "+count);
	}

}
