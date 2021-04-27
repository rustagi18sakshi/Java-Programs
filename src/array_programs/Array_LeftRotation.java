package array_programs;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
Input array : 1 2 3 4 5
Number of rotations to the left : 4
Output : [1 2 3 4 5] -> [2 3 4 5 1] -> [3 4 5 1 2] -> [4 5 1 2 3] -> [5 1 2 3 4]
*/
public class Array_LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rotations you want : ");
		int rot = sc.nextInt();
		
		int[] rotatedArr = rotatedArray(arr, rot);
		
		System.out.println("Rotated array is : ");
		for(int i =0;i<rotatedArr.length;i++)
		{
			System.out.print(rotatedArr[i]+" ");
		}
	}

	public static int[] rotatedArray(int[] arr, int rotations)
	{
		int len = arr.length;
		
		for(int i=0; i<rotations; i++)
		{
			int start = arr[0];
			for(int j=0; j<len-1; j++)
			{
				arr[j]=arr[j+1];
			}
			arr[len-1]= start;
		}
		return arr;
	}
}
