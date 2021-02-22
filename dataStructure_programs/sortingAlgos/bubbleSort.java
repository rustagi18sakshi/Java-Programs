package sortingAlgos;

/*
For explanation of bubble sort : https://www.geeksforgeeks.org/bubble-sort/
For coding refer link : https://www.javatpoint.com/bubble-sort-in-java
Complexity of bubble sort is 0(n^2)
*/
import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array :");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		System.out.println("Enter the elements of an array :");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sortedArray[] = bubbleSort(arr);
		
		System.out.println("Sorted array is : ");
		for(int j=0;j<sortedArray.length;j++)
		{
			System.out.print(sortedArray[j]+" ");
		}	
	}
//In bubble sort, maximum number is sorted first in the array at the end of the list
	public static int[] bubbleSort(int arr[])
	{
		int length = arr.length;
		for(int i=0;i<length;i++)
		{
			for(int j=1;j<length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
