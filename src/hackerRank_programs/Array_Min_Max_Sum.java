package hackerRank_programs;
import java.util.Arrays;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/mini-max-sum/problem
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
Example
input array : 1 4 6 2
The minimum sum is 7 (1+4+2) and the maximum sum is 12(4+6+2).
Output : 7 12
*/
public class Array_Min_Max_Sum {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of elements you want in an array :");
    	int num = sc.nextInt();
    	
        int[] arr = new int[num];
        
    	System.out.println("Enter the elements of the array :");
    	
    	for(int i=0; i<num; i++)
    	{
    		arr[i] = sc.nextInt();
    	}

        miniMaxSum(arr);
    }
    
    static void miniMaxSum(int[] arr) 
    {
    	int len = arr.length;
    	long[] arrSum = new long[len];  
	    
	    for(int i=0; i<len ; i++)
	    {
	        long sum = 0;
	        for(int j=0; j<len; j++)
	        {
	            if(j!=i)   // Logic used is sum all the numbers except i and store in a new array
	            {
	                sum = sum + arr[j];
	            }
	            arrSum[i] = sum;
	        }
	    }
    
	    Arrays.sort(arrSum);  // Sort the new Sum array
	    System.out.println(arrSum[0]+" "+arrSum[len-1]); // Print min and max value of the array
    }
}

