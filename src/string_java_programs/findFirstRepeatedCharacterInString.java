package string_java_programs;

import java.util.HashMap;
import java.util.Scanner;

/*
Input : goodmorning
Output : g
*/

public class findFirstRepeatedCharacterInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();

		int len = s.length();
		
		HashMap<Character, Integer> uniqueCharacter = new HashMap<Character, Integer>();
		
		for(int i=0; i<len; i++)
		{
			Character c = s.toLowerCase().charAt(i);
			
			if(uniqueCharacter.containsKey(c))
			{
				uniqueCharacter.put(c, uniqueCharacter.get(c)+1);
			}
			else
			{
				uniqueCharacter.put(c, 1);
			}
		}

		for(int i=0; i<len; i++)
		{
			if(uniqueCharacter.get(s.toLowerCase().charAt(i)) > 1)
			{
				System.out.println("First repeated character is : "+s.toLowerCase().charAt(i));
				break;
			}
		}
	}
}
