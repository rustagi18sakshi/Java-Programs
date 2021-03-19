package string_java_programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
You need to write a function to implement an algorithm which will accept a string of characters and should find the 
highest occurrence of the character and display it. 
For example if input is "aaaaaaaaaaaaaaaaabbbbcddddeeeeee" it should return "a".
*/

public class returnHighestOccuredCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();
		
		HashMap<Character, Integer> uniqueCharacter = new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			Character c= s.charAt(i);
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
		int max = Integer.MIN_VALUE;
		char result = ' ';
		for(Character key : keys)
		{
			if(uniqueCharacter.get(key)>max)
			{
				max = uniqueCharacter.get(key);
				result = key;
			}
		}
		System.out.println("Character with highest occurance in the string is : "+result);
		System.out.println("Total number of occurance of highest occured string is : "+max);
		
	}

}
