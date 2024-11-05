
public class ass_7_q5 
{

	public static void main(String[] args)
	{    int c=0;
		int a[]= {3,2,2,1,1,1,4};
		int b[]=new int[4];
		for( int i=0;i<a.length;i++)
		{
			b[a[i]-1]++;
			
		}
		 for(int i=0; i<b.length;i++)
		 {
			 if(b[i]>c)
				 c=b[i];
			 
		 }
       System.out.println(b[c-1]);
	}

	

}
