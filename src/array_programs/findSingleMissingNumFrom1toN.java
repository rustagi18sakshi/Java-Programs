package array_programs;

import java.util.Scanner;

/*
This program finds out the single missing number from 1 to N number. 
Enter the value of N : 
10
Enter the numbers of the array
1 2 3 5 6 7 8 9 10
Missing number from 1 to N in the array is : 4
*/
public class findSingleMissingNumFrom1toN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n-1];  // Initializing array of length N-1 since one element is missing
		
		System.out.println("Enter the numbers of the array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sumOfAll = (n*(n+1))/2;
		int sumArray = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			sumArray = sumArray + arr[i];
		}
		
		int missingNum = sumOfAll-sumArray;
		
		System.out.println("Missing number from 1 to N in the array is : "+missingNum);
		
	}

}
