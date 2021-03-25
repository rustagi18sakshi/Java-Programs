package basic_java_programs;

import java.util.Scanner;

public class numberReversalWithZeroAtEnd {

	public static void main(String[] args) {
		
		System.out.println("Enter the number you want : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
				
		String str_num = Integer.toString(number);
		int len = str_num.length();
		
		String reverse_num = "";
		
		for(int i=len-1; i>=0; i--)
		{
			reverse_num = reverse_num + str_num.charAt(i);
		}
		
		System.out.println("Reverse number is : "+reverse_num);
	}
}
