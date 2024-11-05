import java .util.*;
public class ass_5_q2 
{
     
		    public static void main(String[] args)
		    {
		        int[] arr1 = {1, 3, 5, 7};
		        int[] arr2 = {2, 4, 6, 8, 10};
		        
		        int[] mergedArray = merge(arr1, arr2);
		        for(int i=0;i<mergedArray.length;i++)
		        {
		        	System.out.print("  "+mergedArray[i]);
		        }
            }

		    public static int[] merge(int[] arr1, int[] arr2) 
		    {
		        int[] merged = new int[arr1.length + arr2.length];
		        int i = 0, j = 0, k = 0;

		        // Merge elements from both arrays
		        while (i < arr1.length && j < arr2.length) {
		            merged[k++] = (arr1[i] < arr2[j]) ? arr1[i++] : arr2[j++];
		        }

		        // Copy remaining elements from arr1
		        while (i < arr1.length) merged[k++] = arr1[i++];
		        
		        // Copy remaining elements from arr2
		        while (j < arr2.length) merged[k++] = arr2[j++];

		        return merged;
		    }
}

	


