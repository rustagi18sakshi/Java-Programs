package string_java_programs;
import java.util.Scanner;
/*
Input : 2398rh824h9f
Output : 2 3 9 8 8 2 4 9 
Added the logic for sum as well.
*/

public class extractNumbersFromStringAndSumThem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want having integers : ");
		String s = sc.nextLine();
		
		String numbers = "";
		int sum = 0;
		
		for(int i=0;i<s.length();i++)
		{
			Character c = s.charAt(i);
			
			if(Character.isDigit(c))
			{
				numbers = numbers + c + " ";
				sum = sum + Integer.valueOf(Character.toString(c));
			}
		}
		
		System.out.println("The numbers obtained in the string are : "+numbers);
		System.out.println("Sum of all the numbers obtained are : "+sum);
	}
}
