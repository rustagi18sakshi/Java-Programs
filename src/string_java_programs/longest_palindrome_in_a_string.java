package string_java_programs;

import java.util.Scanner;
/*
Examples : 
1234, 12321, 9912321456, 9912333321456, 12145445499, 1223213, abb
Link to refer : 
https://netjs.blogspot.com/2016/05/how-to-find-longest-palindrome-in-given-string-java-program.html
*/

public class longest_palindrome_in_a_string {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the desired string:");
		String s= sc.nextLine();
		
		String longestPalindrome = findLongestPalindromeString(s);
		System.out.println("Longest palindrome in the string is : "+longestPalindrome);
	}

	public static String findLongestPalindromeString(String s) {
		//Validations
		if(s.isEmpty())
		{
			return "Please enter a string";
		}
		if(s.length()==1)
		{
			return s;
		}
		//Start with one character as a longest palindrome
		String longest = s.substring(0,1);
		for(int i=0; i<s.length(); i++)
		{
			//get longest palindrome for odd length(center is i)
			String tmp = checkForEquality(s, i, i);
			if(tmp.length() > longest.length())
			{
				longest=tmp;
			}
			//get longest palindrome for even length(center is i, i+1)
			tmp = checkForEquality(s, i, i+1);
			if(tmp.length() > longest.length())
			{
				longest=tmp;
			}
		}
		return longest;
	}

	public static String checkForEquality(String s, int begin, int end)
	{
		while(begin>=0 && end<=s.length()-1 && s.charAt(begin)==s.charAt(end))
		{
			begin--;
			end++;
		}
		return s.substring(begin+1,end);
	}
}
