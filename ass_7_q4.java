import java.util.Arrays;

public class ass_7_q4 
{
    public static void difference(int[]arr)
    {
    	if(arr==null||arr.length<2)
		{
    		System.out.println("array need atleast 2 elements ");
    		return;
		}
    	Arrays.sort(arr);
    	int maxdiff=arr[arr.length-1]-arr[0];
    	int pair1=arr[0];
    	int pair2=arr[arr.length-1];
    	int mindiff=Integer.MAX_VALUE;
    	int pair3=arr[0];
    	int pair4=arr[1];
    	for(int i=1;i<arr.length;i++)
    	{
    		int diff=arr[i]-arr[i-1];
    		if(diff<mindiff)
    		{
    			mindiff=diff;
    			pair3=arr[i-1];
    	    	pair4=arr[i];
    		}
    	}
    	System.out.println("pair = "+pair1+" "+pair2+" "+"max diff ="+maxdiff);
    	System.out.println("pair = "+pair3+" "+pair4+""+"max diff ="+mindiff);
    	
    }
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		difference(arr);

	}

}
