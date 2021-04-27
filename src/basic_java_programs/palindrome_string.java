package basic_java_programs;

import java.util.Scanner;

public class palindrome_string {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String original = sc.nextLine();
		
		String reverse = "";
		
		int length = original.length();

		for(int i=length-1; i>=0; i--) 
		{
			reverse = reverse + original.charAt(i);
		}

		if(original.equals(reverse)) 
		{
			System.out.println("String:" + " " + original + " " + "is a palindrome");
		} 
		else 
		{
			System.out.println("String:" + " " + original + " " + "is not a palindrome");
		}
	}
}
