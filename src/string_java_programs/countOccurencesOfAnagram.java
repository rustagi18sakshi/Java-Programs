package string_java_programs;

import java.util.Arrays;
import java.util.Scanner;
/*
Given a word and a text, return the count of the occurrences of anagrams of the word in the text.
Input : forxxorfxdofr
SearchForWord : for
Output : 3
Explanation : Anagrams of the word for - for, orf, ofr appear thrice in the text and hence the count is 3.

Input : aabaabaa
SearchForWord : aaba
Output : 4
Explanation : Anagrams of the word aaba - aaba, abaa each appear twice in the text and hence the count is 4.
*/

public class countOccurencesOfAnagram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input string :");
		String text = sc.nextLine();
		
		System.out.println("Enter the string you want to check for anagrams :");
		String word = sc.nextLine();
		
		int count = countAnagrams(text, word);
		System.out.println("Total number of occurence of anagram is : "+count);
	}
	
	public static int countAnagrams(String text, String word)
	{
		int count = 0;
		
		int textLength = text.length();
		int wordLength = word.length();
		
		for(int i=0; i<=textLength-wordLength; i++)
		{
			String s = text.substring(i, i+wordLength);
			
			if(checkAnagrams(word, s))
			{
				count++;
			}	
		}
		
		return count;
	}	
	
	public static boolean checkAnagrams(String s1, String s2)
	{
		boolean status = false;
		
		if(s1.length() == s2.length())
		{
			char[] arr1 = s1.toCharArray();
			char[] arr2 = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(Arrays.equals(arr1, arr2))
			{
				status = true;
			}
		}
		else
		{
			status = false;
		}
		
		return status;
	}	
}
