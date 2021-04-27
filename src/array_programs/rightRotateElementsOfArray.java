package array_programs;

import java.util.Scanner;
/*
Input array : 1 2 3 4 5
Number of rotations to the left : 4
Output : [1 2 3 4 5] -> [5 1 2 3 4] -> [4 5 1 2 3] -> [3 4 5 1 2] -> [2 3 4 5 1]
*/
public class rightRotateElementsOfArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rotations you want : ");
		int rotations = sc.nextInt();
		
		int[] rotatedArr = rotatedArray(arr, rotations);
		
		System.out.println("Rotated array is : ");
		for(int i=0;i<rotatedArr.length;i++)
		{
			System.out.print(rotatedArr[i]+" ");
		}
	}
	
	//The last value in the array becomes the first value of the array. 
	//The other elements from (len-1) to 1 are shifted to right.	
	public static int[] rotatedArray(int[] arr, int rotations)
	{
		int len = arr.length;
		
		for(int i=0; i<rotations; i++)
		{
			int last = arr[len-1];
			for(int j=len-1; j>0; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}	
		return arr;
	}
}
