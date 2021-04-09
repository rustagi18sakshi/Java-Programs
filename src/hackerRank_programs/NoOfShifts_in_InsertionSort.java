package hackerRank_programs;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/runningtime/problem?h_r=next-challenge&h_v=zen
Identify the number of shifts while sorting using the Insertion sort algorithm.
Input  = [2, 1, 3, 1, 2]
Output = 4
Explanation : 
Iteration   Array      Shifts
0           2 1 3 1 2
1           1 2 3 1 2     1
2           1 2 3 1 2     0
3           1 1 2 3 2     2
4           1 1 2 2 3     1

Total                     4
*/
public class NoOfShifts_in_InsertionSort {

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
		
		int noOfshifts = runningTime(arr);
		
		System.out.println("Number of shifts performed to sort the array are : "+noOfshifts);
	}
	
    static int runningTime(int[] arr) {

        int noOfShifts = 0;
        
        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;
            
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                noOfShifts++;
                j = j-1;
            }
            
            arr[j+1] = key;
        }
        
        return noOfShifts;
    }
}
