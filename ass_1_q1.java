package assignment1;

public class ass_1_q1
{
	public static int sum(int arr [])
	{
		int size=arr.length;
		int total=0;
		for(int i=0;i<size;i++)
		{
		total+=arr[i];	
		}
		return total;
	}

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		System.out.println("sum of all numbers is "+sum(arr));
	}

}
