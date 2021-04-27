package string_java_programs;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 You need to write a program to print all duplicate character and their count in Java. For example, if given String is "Programming" then your program should print
g : 2
r : 2
m : 2
Read more: https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz5uugKnsMM
*/

public class duplicateCharacterInStringHashMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();

		printDuplicateCharacters(s);
	}
	
	public static void printDuplicateCharacters(String s)
	{
		if(s == null)
		{
			System.out.println("NULL String");
			return;
		}
		
		if(s.isEmpty())
		{
			System.out.println("Empty string");
			return;
		}
		
		if(s.length()==1)
		{
			System.out.println("Single character string, so no duplicates");
			return;
		}

		HashMap<Character, Integer> uniqueCharacter = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++)
		{
			Character c = s.charAt(i);
			
			if(uniqueCharacter.containsKey(c)) 
			{
				uniqueCharacter.put(c, uniqueCharacter.get(c)+1);
			} 
			else 
			{
				uniqueCharacter.put(c, 1);
			}
		}

		Set<Character> keys = uniqueCharacter.keySet();

		//For finding duplicate characters we need to get keys with value greater than or equal to 2		
		System.out.println("Duplicate characters with their no. of occurance are : ");
		
		for (Character key : keys) 
		{
			if (uniqueCharacter.get(key) > 1) 
			{
				System.out.println(key + " : " + uniqueCharacter.get(key));
			}
		}
	}
}
