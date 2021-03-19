package string_java_programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
Find the first non-repeated (unique) character in a given string. 
for Example, if given String is "Morning" then it should print "M"

Read more: https://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz5uz6QzNrg
*/

public class findFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();

		LinkedHashMap<Character, Integer> uniqueCharacter = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (uniqueCharacter.containsKey(c)) {
				uniqueCharacter.put(c, uniqueCharacter.get(c) + 1);
			} else {
				uniqueCharacter.put(c, 1);
			}
		}
		
		Set<Character> keys = uniqueCharacter.keySet();

		for(Character key : keys)
		{
			if (uniqueCharacter.get(key) == 1) {
				System.out.println("First non repeated character in the string is : " + key);
				break;
			}
		}
	}

}
