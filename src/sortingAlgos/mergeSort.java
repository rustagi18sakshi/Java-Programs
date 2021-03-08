package sortingAlgos;

import java.util.Scanner;
/*
For code : https://www.javatpoint.com/merge-sort
Logic : https://www.interviewbit.com/tutorial/merge-sort-algorithm/#:~:text=Merge%20sort%20is%20one%20of,results%20into%20a%20sorted%20list.
Complexity : O(n log n)
 */
public class mergeSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array :");
		int num = sc.nextInt();
				
		int arr[] = new int[num];
		System.out.println("Enter the elements of an array :");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sortedArray[] = mergeSort(arr,0,arr.length-1);
		
		System.out.println("Sorted array is : ");
		for(int j=0;j<sortedArray.length;j++)
		{
			System.out.print(sortedArray[j]+" ");
		}		
	}
	
	static int[] mergeSort(int arr[], int start, int end) 
	{
		if(start < end) 
		{
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
		return arr;
	}
	
	static void merge(int arr[], int beg, int mid, int end)  
	{  
		//Consider example of array with 10 elements
		int l = mid - beg + 1;   //5
		int r = end - mid;       //5
		  
		int[] LeftArray = new int[l];  
		int[] RightArray = new int[r];  
		  
		for(int i=0; i<l; i++)
		{
			LeftArray[i] = arr[beg + i];
		}
			  
		for(int j=0; j<r; j++) 
		{
			RightArray[j] = arr[mid + 1 + j];  
		}
		
		int i = 0, j = 0;  
		int k = beg;
		
		while(i<l && j<r)  
		{  
			if(LeftArray[i] <= RightArray[j])  
			{  
				arr[k] = LeftArray[i];  
				i++;  
			}  
			else  
			{  
				arr[k] = RightArray[j];  
				j++;  
			} 
			
		    k++;  
		}  
		
		while(i<l)  
		{  
			arr[k] = LeftArray[i];  
			i++;  
			k++;  
		}  
		  
		while(j<r)  
		{  
			arr[k] = RightArray[j];  
			j++;  
			k++;  
		}  
	}
}
