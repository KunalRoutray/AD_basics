
public class ass_4_q2 
{
  public static void selection_sort(int []arr)
  {
	  int n=arr.length;
	  for( int i=0;i<n-1;i++)
	  { 
		 
		  int min=i;
		  for(int j=i+1;j<n;j++)
		  {
			  if (arr[j]<arr[min])
			  {
				  min=j;
			  }
			  
		  }
		  int  temp= arr[min];
		  arr[min]=arr[i];
		  arr[i]=temp;
	  }
	 
  }
	public static void main(String[] args)
	{
		int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        
        for(int num:arr)
     	 {
   		 System.out.print(num +" ");
   	     }
        selection_sort(arr);
        
        System.out.println("\n "
        		+ "Sorted array:");
        for(int num:arr)
    	 {
   		 System.out.print(num +" ");
   	     }

	}

}
