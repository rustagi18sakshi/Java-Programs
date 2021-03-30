package sortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

/*
Link to refer : https://www.java67.com/2016/05/java-program-to-perform-binary-search-without-recursion.html
The time complexity of binary search is in order of O(logN) if you get the sorted input. 
If you have to sort the input then you need to add that time on the total run time of the algorithm as well.
*/
public class binarySearchWithoutRecursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array :");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("Enter the elements of an array in a sorted order :");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		//back up if user doesn't enter sorted array
		Arrays.sort(arr);
		
		System.out.println("Enter the number you want to search in an array :");
		int number = sc.nextInt();
		
		int index = binarySearch(arr, number);
		if(index == -1)
		{
			System.out.println("Number "+number+" doesn't exists in an array");
		}
		else
		{
			System.out.println("Number "+number+" exists at index : "+index);
		}
	}
/*
Java method to perform binary search. It accept an integer array and a number and return the index of 
number in the array. If number doesn't exists in array then it return -1
*/
	public static int binarySearch(int[] arr, int number)
	{
		int low = 0;
		int high = arr.length-1;

		while(high>=low)
		{
			int middle = (low+high)/2;
			if(arr[middle] == number)
			{
				return middle;
			}
			else if(arr[middle] < number)
			{
				low = middle+1;
			}
			else if(arr[middle] > number)
			{
				high = middle-1;
			}
		}
		return -1;
	}
}
