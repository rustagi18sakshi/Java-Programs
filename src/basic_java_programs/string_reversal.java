package basic_java_programs;

import java.util.Scanner;

public class string_reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String original = sc.nextLine();
		String reverse = "";
		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		System.out.println("The reversed string is: " + reverse);
	}
}
