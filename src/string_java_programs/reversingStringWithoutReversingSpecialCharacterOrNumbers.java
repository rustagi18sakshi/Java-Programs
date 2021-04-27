package string_java_programs;

import java.util.Scanner;

/*
Enter the string you want : 
ksd54#$2l23e32
Reverse string is : eld54#$2s23k32
*/

public class reversingStringWithoutReversingSpecialCharacterOrNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want : ");
		String str = sc.nextLine();
		
		char[] charArray = str.toCharArray();	
			
		char[] reverseCharArray = reverseString(charArray);
		
		String reverseString = new String(reverseCharArray);
		System.out.println("Reverse string is : "+reverseString);		
	}
	
	public static char[] reverseString(char[] c)
	{
		int l = 0;
		int r = c.length-1;
		
		while(l<r)
		{
			if(!Character.isAlphabetic(c[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(c[r]))
			{
				r--;
			}
			else
			{
				char temp = c[l];
				c[l] = c[r];
				c[r] = temp;
				l++;
				r--;
			}
		}	
		return c;
	}
}
