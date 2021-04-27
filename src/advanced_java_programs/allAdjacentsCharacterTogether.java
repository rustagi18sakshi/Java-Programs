package advanced_java_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
This program prints all the same characters together
input = "abcabcab"
output = "aaabbbcc"
*/

public class allAdjacentsCharacterTogether {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter input string :");
		String input = sc.nextLine();
		
		int length = input.length();
		
		HashSet<Character> nonRepeatedElements = new HashSet<Character>();
		ArrayList<Character> outputResultList = new ArrayList<Character>();

		for(int i=0; i<length; i++) 
		{
			boolean status = false;
			int count = 1;
			
			status = nonRepeatedElements.add(input.charAt(i));

			if(status == true) 
			{
				for(int j=i+1; j<length; j++) 
				{
					if(input.charAt(i) == input.charAt(j)) 
					{
						count++;
					}
				}
				for(int k=1; k<=count; k++) 
				{
					outputResultList.add(input.charAt(i));
				}
			}
		}
		
		System.out.println("Output string is : ");
		
		for(Character output : outputResultList) 
		{
			System.out.print(output + " ");
		}
	}
}
