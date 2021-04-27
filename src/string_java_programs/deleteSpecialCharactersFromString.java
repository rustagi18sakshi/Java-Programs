package string_java_programs;

import java.util.Scanner;

/*
Enter the string you want having special characters : 
la435@#mf
String without special characters is : la435mf
*/

public class deleteSpecialCharactersFromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string you want having special characters : ");
		String s = sc.nextLine();
		
		String newString = "";
		
		for(int i=0; i<s.length(); i++)
		{
			Character c = s.charAt(i);
			
			if(Character.isAlphabetic(c) || Character.isDigit(c))
			{
				newString = newString + c;
			}
		}
		
		System.out.println("String without special characters is : "+newString);		
	}
}
