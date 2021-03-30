package string_java_programs;

import java.util.HashSet;
import java.util.Scanner;

/*
 You need to remove duplicate characters from a given string keeping only the first occurrences.
 For example, if the input is ‘bananas’ the output will be ‘bans’
*/
public class removeDuplicateCharactersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();

		HashSet<Character> nonRepeatedCharacters = new HashSet<Character>();
		String nonDuplicateString = "";

		for (int i = 0; i < s.length(); i++) {
			boolean status = false;
			status = nonRepeatedCharacters.add(s.charAt(i));

			if (status == true) {
				nonDuplicateString = nonDuplicateString + s.charAt(i);
			}
		}
		System.out.println("String without duplicates is : " + nonDuplicateString);
	}
}
