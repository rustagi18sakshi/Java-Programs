package string_java_programs;

import java.util.Scanner;

public class palindromeStringUsingWhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string");
		String s = sc.nextLine();
		
		isPalindrome(s);		
	}
	
	public static void isPalindrome(String s)
	{
		boolean status = false;
		int l = 0;
		int r = s.length()-1;
		
		while(l<r)
		{
			if(s.charAt(l)==s.charAt(r))
			{
				l++;
				r--;
				status = true;
			}
			else
			{
				System.out.println("String : "+s+" is not a palindrome");
				status = false;
				break;
			}
		}
		
		if(status == true)
		{
			System.out.println("String : "+s+" is a palindrome");
		}

	}

}
