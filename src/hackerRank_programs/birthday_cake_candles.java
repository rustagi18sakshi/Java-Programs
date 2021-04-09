package hackerRank_programs;

import java.util.Arrays;
import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/birthday-cake-candles/problem
You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. 
They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

Example
Input : [4, 4, 1, 3]
The maximum height candles are 4 units high. There are 2 of them, so return 2. 
Output : 2
Other example :
Input : [3 2 1 3] 
The tallest candles are 3 units, and there are 2 of them.
Output : 2
*/
public class birthday_cake_candles {

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

    	int count = birthdayCakeCandles(arr);
    	System.out.println("Number of occurence of the maximum height candle is : "+count);
	}
	
    static int birthdayCakeCandles(int[] candles) 
    {
        int count = 0;
        int len = candles.length; 
        
        Arrays.sort(candles);

        int maxValue = candles[len-1];
        System.out.println("Maximum height candle is : "+maxValue);
        
        for(int i=0 ;i<len; i++)
        {
            if(candles[i]==maxValue)
            {
                count++;
            }
        }
        
        return count;
    }
}
