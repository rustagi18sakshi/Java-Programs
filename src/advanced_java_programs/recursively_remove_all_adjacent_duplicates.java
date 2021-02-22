package advanced_java_programs;

import java.util.Scanner;

public class recursively_remove_all_adjacent_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want :");
		String input = sc.nextLine();
		//String input = "aaaabbbccxxxx";
		// String input = "aaaabbbccxxxxbx";
		// String input = "azxxzy";
		// outputString should be "vx" or for "azxxzy" -> "ay"

		removeDuplicates(input);

	}

	public static void removeDuplicates(String input) {
		String output = "";
		int count = 0;
		int length = input.length();
		System.out.println("Input string is : " + input);

		for (int i = 0; i < length - 1; i++) {
			if (input.charAt(i) != input.charAt(i + 1)) {
				output = output + input.charAt(i);
			} else {
				System.out.println("Elements removed : " + input.charAt(i) + " " + input.charAt(i + 1));
				i = i + 1;
			}
		}

		// need to correct this part
		Character lastElement = input.charAt(input.length() - 1);
		Character secondLastElement = input.charAt(input.length() - 2);

		if (lastElement != secondLastElement) {
			output = output + lastElement;
		}
		System.out.println("string is : " + output);

		for (int i = 0; i < output.length() - 1; i++) {
			if (output.charAt(i) == output.charAt(i + 1)) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println("Again looping");
			removeDuplicates(output);
		} else {
			System.out.println("Output string is : " + output);
		}
	}

}
