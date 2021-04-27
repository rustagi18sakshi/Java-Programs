package string_java_programs;

import java.util.Scanner;
/*
You need to write a Java method which will accept a String and a character to be removed and return a String, 
which doesn't has that character e.g remove(String word, char ch).
*/
public class removeCharacterFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();
		
		System.out.println("Enter the character you want to remove from string");
		Character c = sc.next().charAt(0);
		
		//Through normal way
		String s1 ="";
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!=c)
			{
				s1 = s1 + s.charAt(i);
			}
		}
		
		System.out.println("String with character "+c+"removed from the string is : "+s1);
		
		//Through recursion
		String s2 = removeCharacter(s, c);
		System.out.println("Using recursion, string with character "+c+" removed from the string is : "+s2);
		
	}
	
	public static String removeCharacter(String s, char c)
	{
		int index = s.indexOf(c);
		
		if(index == -1)
		{
			return s;
		}
		else
		{
			return removeCharacter(s.substring(0,index)+s.substring(index+1,s.length()), c);
		}
	}
}
