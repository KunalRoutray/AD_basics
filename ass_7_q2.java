
public class ass_7_q2 
{
	public static void main(String[] args)
	{
		int a[]= {3,2,2,3,1,4};
		int b[]=new int[4];
		System.out.println("duplicate elements are");
		for( int i=0;i<a.length;i++)
		{
			b[a[i]-1]++;
			if (b[a[i]-1]==2)
			{
				System.out.println(a[i]);
				
			}
			
		}
	
		
	}


}
