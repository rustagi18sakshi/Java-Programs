package sortingAlgos;

/*
For coding refer link : https://www.geeksforgeeks.org/java-program-for-selection-sort/
Complexity of selection sort is 0(n^2)
*/
import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array :");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		System.out.println("Enter the elements of an array :");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int[] sortedArray = selectionSort(arr);
		
		System.out.println("Sorted array is : ");
		for(int j=0;j<sortedArray.length;j++)
		{
			System.out.print(sortedArray[j]+" ");
		}
	}
	// In selection sort, sorting is done by placing minimum number in the array at the beginning of the list
	public static int[] selectionSort(int[] arr)
	{
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			// Find the minimum element in unsorted array
			int min = i;
			for(int j=i+1;j<length;j++)
			{
				if(arr[min]>arr[j])
				{
					min = j;
				}
			}
			// Swap the found minimum element with the first element
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
