package hackerRank_programs;

import java.util.Scanner;

/*
Our friend Monk was given an integer array A of size N. 
He got a task to calculate the Absolute Difference between the number of odd and even pairs present in this array A.
A Pair of 2 integers  is called an odd pair, if i<j, and if A[i] + A[j] is not divisible by 2. A pair of integers  is called even, 
if i<j, and A[i] + A[j] is divisible by 2.
This task seems a little bit tricky to him, and wants you to help him out. Can you ?
Input : 1 2 3
Output : 1
Explanation
Even pairs- (1,3) ==> 1
Odd Pairs- (1,2), (2,3) ==> 2
Difference = absolutevalue(OddPairs-EvenPairs) == 1
*/

public class OddEvenPairs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array :");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		System.out.println("Enter the elements of the array :");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int noOfOddPairCount = 0;
		int noOfEvenPairCount = 0;
		int absoluteDifference = 0;
		
		for(int i=0; i<num ;i++)
		{
			for(int j=i+1; j<num; j++)
			{
				if((arr[i]+arr[j])%2==0)
				{
					noOfEvenPairCount++;
				}
				else
				{
					noOfOddPairCount++;
				}
			}
		}
		
		absoluteDifference = Math.abs(noOfEvenPairCount-noOfOddPairCount);
		System.out.println("Absolute difference : "+absoluteDifference);
	}
	

}
