import java.util.Scanner;

public class ass_3_q1 
{
 public static int sum (int arr[],int n)
 {
	if(n==0)
		return 0;
	else 
		return arr[n-1]+sum(arr,n-1);
 }
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number of elements");
		int n= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        System.out.println(sum(arr,arr.length));
	}

}
