package string_java_programs;
import java.util.Scanner;
/*
Find out the total number of Capital Alphabets in String.
Input : SaksDOFad
Output : 4
*/

public class getCountOfCapitalAlphabetsInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want : ");
		String s = sc.next();
		
		// Way1 : Using Alphabets
		int count = 0;
		for(int i=0;i <s.length(); i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				count++;
			}
		}
		
		System.out.println("Total number of capital alphabets in string :"+s+" are : "+count);
		
		// Way2 : Using ASCII Code for A(65) and Z(90)
		int count1 = 0;
		for(int i=0;i <s.length(); i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				count1++;
			}
		}
		
		System.out.println("Total number of capital alphabets in string :"+s+" are : "+count1);
		
		// Way3 : Using Character.isUpperCase method
		int count2 = 0;
		for(int i=0;i <s.length(); i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				count2++;
			}
		}
		
		System.out.println("Total number of capital alphabets in string :"+s+" are : "+count2);
		
		// Way4 : Using JDK 1.8 Streams
		
		long count3 = s.chars().filter(e -> Character.isUpperCase(e)).count();
		System.out.println("Total number of capital alphabets in string :"+s+" are : "+count3);
		
		long count4 = s.chars().filter(e -> e>=65 && e<=90).count();
		System.out.println("Total number of capital alphabets in string :"+s+" are : "+count4);
		
	}
}
