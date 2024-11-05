
public class ass_7_q1
{   
	public static void main(String[] args)
	{
		int a[]= {3,2,2,1,4};
		int b[]=new int[4];
		for( int i=0;i<a.length;i++)
		{
			b[a[i]-1]++;
			
		}
		 for(int i=0; i<a.length;i++)
		 {
			 if (b[a[i]-1]==2)
				{
					System.out.println(a[i]);
					break;
				}
		 }
       
	}

	

}
