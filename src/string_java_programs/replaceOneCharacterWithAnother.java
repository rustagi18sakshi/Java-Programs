package string_java_programs;

import java.util.Scanner;

/*
Write a Java program to replace a given character in a String to other provided character, 
For example, if the input is "Java is Great" and asked to replace space with %20 then it should be "Java%20is%20Great".
*/
public class replaceOneCharacterWithAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();
		//For replacing one string with another
		System.out.println("Enter the string you want to be replaced :");
		String original = sc.nextLine();
		System.out.println("Enter the string you want the original to be replaced with :");
		String replace = sc.nextLine();

		String replaced = s.replaceAll(original, replace);
		System.out.println("Replaced string is :" + replaced);
		
		//For replacing one character with another
		System.out.println("Enter the string you want :");
		String s1 = sc.nextLine();
		System.out.println("Enter the character you want to replace :");
		Character c1 = sc.next().charAt(0);
		System.out.println("Enter the character you want the original to be replaced with :");
		Character c2 = sc.next().charAt(0);
		String s2 = s1.replace(c1, c2);
		System.out.println("Replaced string is :" + s2);
	}
	

}
