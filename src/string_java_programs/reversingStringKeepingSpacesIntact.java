package string_java_programs;

import java.util.Scanner;
/*
Input : i am arvind
Output : d ni vramai
*/
public class reversingStringKeepingSpacesIntact {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want : ");
		String str = sc.nextLine();
		
		char[] charArray = str.toLowerCase().toCharArray();	
			
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
