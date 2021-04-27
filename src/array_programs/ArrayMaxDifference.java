package array_programs;

import java.util.Scanner;
/*
Find the maximum difference between any item and any lower indexed smaller item for all possible pairs.
If no output, then return -1.
Input  : [2,3,10,2,4,8,1]
Output : 8
Explanation : 
Differences are calculated as : 
3 - [2] = 1
10 - [3,2] = [7 8]
4 - [2,3,2] = [2,1,2]
8 - [4,2,3,2] = [4,6,5,6]
The maximum value found is : 8
*/
public class ArrayMaxDifference {

	public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of elements you want in an array :");
    	int num = sc.nextInt();
    	
        int[] arr = new int[num];
        
    	System.out.println("Enter the elements of the array :");
    	
    	for(int i=0; i<num; i++)
    	{
    		arr[i] = sc.nextInt();
    	}

    	int maxDiff = maxDifference(arr);
    	System.out.println("Maximum difference in array is : "+maxDiff);
	}
	
	   static int maxDifference(int[] arr) 
	    {

	        int len = arr.length; 
	        
	        int max = -1;
	        
	        for(int i=1; i<len; i++)
	        {
	        	for(int j=0 ;j<i ;j++)
	        	{
	        		if(arr[i] > arr[j])
	        		{
	        			int diff = arr[i] - arr[j];
	        			if(diff > max)
	        			{
	        				max = diff;
	        			}
	        		}
	        	}
	        }

	        return max;
	    }
}
