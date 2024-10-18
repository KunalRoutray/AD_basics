
public class ass_4_q1 
{    
	
	public static  void insertion_sort(int arr[])
	{
		 int n= arr.length;
		 for(int i=1;i<n;i++)
		 {
			 int key=arr[i];
			 int j=i-1;
			 while(j>=0 && arr[j]>key)
			 {
				 arr[j+1]=arr[j];
				 j=j-1;
			 }arr[j+1]=key;
		 }
		 
		 System.out.println("\n array after sort ");
		 for(int num:arr)
		 {
			 System.out.print(num +" ");
		 }
	}

	public static void main(String[] args) 
	{
	 int arr[]= {1,3,4,2,7,5};
	 System.out.println (" array before sort ");
	 for(int num:arr)
	 {
		 System.out.print(num +" ");
	 }
	 insertion_sort(arr);

	}

}
