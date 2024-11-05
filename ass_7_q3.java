
public class ass_7_q3 {

	public static void main(String[] args)
	{
		int a[]= {1,2,4,5,6};
		int n=6;
		int actualsum=n*(n+1)/2;
		int sum=0;
		for( int i=0;i<a.length;i++)
		{
			sum+=a[i];
			
		}
		System.out.println("the missing number is "+(actualsum-sum));

	}

}
