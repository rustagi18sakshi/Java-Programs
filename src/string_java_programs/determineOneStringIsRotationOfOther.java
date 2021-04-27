package string_java_programs;

import java.util.Scanner;

public class determineOneStringIsRotationOfOther {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first string : ");
		String str1 = sc.nextLine();						//e.g. abcde
		
		System.out.println("Enter the second string : ");
		String str2 = sc.nextLine();						//e.g. cdeab
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Second string is not a rotation of first string");
		}
		else
		{
			str1 = str1.concat(str1);
			
			if(str1.contains(str2))
			{
				System.out.println("Second string is a rotation of first string");
			}
			else
			{
				System.out.println("Second string is not a rotation of first string");
			}
		}
		
	}

}
