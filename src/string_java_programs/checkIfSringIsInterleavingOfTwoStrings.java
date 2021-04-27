package string_java_programs;

import java.util.Scanner;

/*
Given three strings X, Y and S.
S is said to be interleaving X and Y, if it contains all characters of X and Y and order of all characters in individual strings is preserved.
For example, given first = "abc" and second = "def",  third = "dabecf"
ACBCD is interleaving of ABC & CD
ACDABC is interleaving of ABC & ACD 
*/
public class checkIfSringIsInterleavingOfTwoStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string :");
		String X = sc.nextLine();
		System.out.println("Enter second string :");
		String Y = sc.nextLine();
		System.out.println("Enter interleaved string :");
		String S = sc.nextLine();
		
		boolean status = checkInterleaving(X, Y, S);
		if(status == true)
		{
			System.out.println("Given string is an interleaving of First and second string");
		}
		else
		{
			System.out.println("Given string is not an interleaving of first and second string");
		}
	}
		
	public static boolean checkInterleaving(String X, String Y, String S)
	{
		
		//Return true if we have reached end of all the strings
		if(X.length()==0 && Y.length()==0 && S.length()==0)
		{
			return true;
		}
		//Return false if we have reached the end of string S but string X and Y are not empty
		if(S.length()==0)
		{
			return false;
		}
		//If string X is not empty and its first character matches with first character of S, recur for remaining substring
		if(X.length()!=0 && S.charAt(0)==X.charAt(0))
		{
			return checkInterleaving(X.substring(1), Y, S.substring(1));
		}
		//If string Y is not empty and its first character matches with first character of S, recur for remaining substring
		if(Y.length()!=0 && S.charAt(0)==Y.charAt(0))
		{
			return checkInterleaving(X, Y.substring(1), S.substring(1));
		}
		
		return false;
	}

}
