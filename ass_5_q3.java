import java.util.*;
public class ass_5_q3
{

	public static void main(String[] args)
	{
		boolean r=true;
		int arr[]= {1,2,5,4,3};
		System.out.println("  enter the sub array position you want to reverse between"
				+ "0 to "+(arr.length-1));
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		 for(int k=i;k<(i+j)/2;k++)
	        {
	        	int temp=arr[i];
	        	arr[i]=arr[j];
	        	arr[j]=temp;
	        	i++;j--;
	        }
		 for(int a=0;a<arr.length-1;a++)
	        {
	        	if(arr[a]>arr[a+1])
	        	{
	        		r=false;
	        		break;
	        	}
	        }
		 if(r==true)
		   System.out.println("array after reversion is sorted");
		 else
			 System.out.println("array after reversion is  NOT sorted");
		
	}

}
