package string_java_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class countVowelsAndConsonantsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want : ");
		String s = sc.nextLine();

		int vowelCount = 0;
		int consonantCount = 0;
		ArrayList<Character> vowels = new ArrayList<Character>();
		ArrayList<Character> consonants = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelCount++;
				vowels.add(c);
			} else {
				consonantCount++;
				consonants.add(c);
			}
		}

		System.out.println("Total number of vowels are :" + vowelCount);
		System.out.println("Vowels are : " + vowels);

		System.out.println("Total number of consonants are :" + consonantCount);
		System.out.println("Consonants are : " + consonants);

	}

}
