package sortingAlgos;

/*
For explanation of insertion sort : Refer below.
For coding refer link : https://www.geeksforgeeks.org/insertion-sort/
Complexity of insertion sort is 0(n^2)
*/
import java.util.Scanner;

public class insertionSort {

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
		
		int sortedArray[] = insertionSort(arr);
		
		System.out.println("Sorted array is : ");
		for(int j=0;j<sortedArray.length;j++)
		{
			System.out.print(sortedArray[j]+" ");
		}
	}
	
	public static int[] insertionSort(int[] arr)
	{
		int length = arr.length;
		for(int i=1;i<length;i++)
		{
			int key = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j]; // Right rotation of element
				j = j-1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}

/*
Explanation :
Array : 12,11,13,5,6
1. i=1, arr[i]=key=11
	j = 0 , arr[j]=12
	while condition satisfied. So, arr[j+1]=arr[1] = a[j] = 12
	j = -1. Came out of while loop.
	arr[j+1]=arr[0] = key =11
	Array : 11,12,13,5,6
2. i=2, arr[i]=key=11 . Already sorted
3. i=3, arr[i]=key=5
	Array : 11,12,13,5,6
	j = 2 , arr[j]=13
	while condition satisfied. So, arr[j+1]=arr[3] = a[j] = 13
	j = 1, arr[j]=12
	while condition satisfied. So, arr[j+1]=arr[2] = a[j] = 12
	j = 0, arr[j]=11
	while condition satisfied. So, arr[j+1]=arr[1] = a[j] = 11
	j = -1. Came out of while loop. 
	arr[j+1]=arr[0] = key =5
	Array : 5,11,12,13,6
4.  i=4, arr[i]=key=6
	j = 3 , arr[j]=13
	while condition satisfied. So, arr[j+1]=arr[4] = a[j] = 13
	j = 2, arr[j]=12
	while condition satisfied. So, arr[j+1]=arr[3] = a[j] = 12
	j = 1, arr[j]=11
	while condition satisfied. So, arr[j+1]=arr[2] = a[j] = 11
	j = 0. arr[j]=5. Came out of while loop since key(6)>5 . 
	arr[j+1]=arr[1] = key =6
	Array : 5,6,11,12,13
 */

