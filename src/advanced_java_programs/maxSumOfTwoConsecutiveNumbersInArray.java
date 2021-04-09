package advanced_java_programs;

import java.util.Arrays;
import java.util.Scanner;
/*
Input = {5,4,6,1,8}
Output = {9,10,7,9}
Max value : 10
*/

public class maxSumOfTwoConsecutiveNumbersInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		System.out.println("Enter the elements of the array : ");
		
		for(int i=0; i<num; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int[] sumArray = new int[num-1];
		
		System.out.println("Sum of consecutive numbers are :");
		
		for(int i=0; i<num-1; i++)
		{
			int sum = arr[i] + arr[i+1];
			sumArray[i] = sum;
			System.out.print(sum+" ");
		}
		System.out.println();
		
		Arrays.sort(sumArray);   // Sort the array in ascending order
		System.out.println("Maximum sum of two consecutive numbers in array are : "+sumArray[num-2]);
	}
}
