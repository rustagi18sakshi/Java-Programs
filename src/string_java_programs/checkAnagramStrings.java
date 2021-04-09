package string_java_programs;

import java.util.Arrays;
import java.util.Scanner;

/*
Two strings are anagrams if they are written using the same exact letters, ignoring space, punctuation, and capitalization
Each letter should have the same count in both strings.
For example, the Army and Mary are an anagram of each other.
*/
public class checkAnagramStrings {

	public static void main(String[] args) {

		
		System.out.println("\"([^\"]*)\"|(\\S*");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string :");
		String s1 = sc.nextLine();
		System.out.println("Enter second string :");
		String s2 = sc.nextLine();

		boolean status = false;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] arr1 = s1.toLowerCase().toCharArray();
			char[] arr2 = s2.toLowerCase().toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);
			status = Arrays.equals(arr1, arr2);
		}

		if (status == true) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

}
