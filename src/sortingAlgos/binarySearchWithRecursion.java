package sortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				
		int index = binarySearch(arr, number,0, arr.length-1);
		if(index == -1)
		{
			System.out.println("Number "+number+" doesn't exists in an array");
		}
		else
		{
			System.out.println("Number "+number+" exists at index : "+index);
		}
	}

	public static int binarySearch(int[] arr, int number,int low, int high)
	{
		if(high>=low)
		{
			int middle = (low+high)/2;
			if(arr[middle] == number)
			{
				return middle;
			}
			else if(arr[middle] < number)
			{
				return binarySearch(arr, number, middle+1, high);
			}
			else if(arr[middle]>number)
			{
				return binarySearch(arr, number, low, middle-1);
			}
		}
		return -1;
	}


}
