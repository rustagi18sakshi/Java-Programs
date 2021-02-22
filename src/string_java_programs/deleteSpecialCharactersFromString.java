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
		
		char[] c = s.toCharArray();
		int length = c.length;
		String newString = "";
		
		
		for(int i=0;i<length;i++)
		{
			if(Character.isAlphabetic(c[i]) || Character.isDigit(c[i]))
			{
				newString = newString + c[i];
			}
		}
		
		System.out.println("String without special characters is : "+newString);		
	}
}
