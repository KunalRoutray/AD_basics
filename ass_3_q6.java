
public class ass_3_q6 
{
    public static int fun(int a[],int n, int k,int i)
    {
    	if(i>k)
    		return i;
    	if(n<0)
    		return i;
    	if(a[n]==i)
    	{
    		n=k-1;
    		return fun(a,n,k,i+1);
    		
    	}
    	return fun(a,n-1,k,i);
    }
	public static void main(String[] args)
	{
		int n=4;
		int k=n;
		int i=1;
		int a[]= {1,2,3,5};
		System.out.println("the smallest missing number is "+fun(a,n-1,k,i));

	}

}
