package string_java_programs;

import java.util.Scanner;

/*
input = sakshi
1st iteration : reverseString(akshi) + s
2nd iteration : reverseString(kshi) + a + s
3rd iteration : reverseString(shi)+k+a+s
4th iteration : reverseString(shi)+k+a+s
5th iteration : reverseString(hi)+s+k+a+s
6th iteration : reverseString(i)+h+s+k+a+s
output : ihskas
 */
public class stringReversalUsingRecursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();

		String reverse = reverseString(s);
		System.out.println("Reverse string is :" + reverse);
	}

	public static String reverseString(String str) 
	{
		if (str.isEmpty()) 
		{
			return str;
		}
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
