package string_java_programs;

import java.util.Scanner;

public class CountNoOfZeroOnesInBinaryString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a binary string containing 0's and 1's : ");
		String binaryString = sc.nextLine();
		
		int oneCount = 0;
		int zeroCount = 0;
		
		for (int i = 0; i < binaryString.length(); i++) 
		{
			if (binaryString.charAt(i) == '1') 
			{
				oneCount++;
			} 
			else if (binaryString.charAt(i) == '0') 
			{
				zeroCount++;
			} 
			else 
			{
				System.out.println("Invalid character at " + i + " location. String should contain only 0's and 1's");
			}
		}
		
		System.out.println("Total number of 1's in the string are: " + oneCount);
		System.out.println(("Total number of 0's in the string are:" + zeroCount));
		
		// Printing numbers with all the 1's first and then all the 0's
		System.out.println("Final String with all the 1's first and then all the 0's is: ");
		
		for (int i = 0; i < oneCount; i++) 
		{
			System.out.print(1);
		}
		
		for (int j = 0; j < zeroCount; j++) 
		{
			System.out.print(0);
		}
	}
}
