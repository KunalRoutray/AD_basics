
public class ass_4_q3 {
    public static void bubble_sort(int arr[])
    {
    	int n= arr.length;
    	for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
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
           bubble_sort(arr);
        
        System.out.println("\n "
        		+ "Sorted array:");
        for(int num:arr)
    	 {
   		 System.out.print(num +" ");
   	     }


	}

}
