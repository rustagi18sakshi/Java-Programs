package advanced_java_programs;

import java.util.ArrayList;
import java.util.Scanner;

//Problem
//Tatiana likes to keep things tidy. Her toys are sorted from smallest to largest, her pencils are sorted from 
//shortest to longest and her computers from oldest to newest. One day, when practicing her counting skills, 
//she noticed that some integers, when written in base 10 with no leading zeroes, have their digits sorted in 
//non-decreasing order. Some examples of this are 8, 123, 555, and 224488. She decided to call these numbers tidy.
//Numbers that do not have this property, like 20, 321, 495 and 999990, are not tidy. 

public class TidyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total numbers that you want: ");
		int count = sc.nextInt();

		int[] num = new int[count];
		for (int i = 0; i < count; i++) 
		{
			System.out.println("Enter "+i+" number :");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < count; i++) 
		{
			boolean status = false;
			int number = num[i];
			status = checkTidy(number);
			if(status == true)
			{
				System.out.println("Number "+number+" is a tidy number");
			}
			else
			{
				System.out.println("Number "+number+" is not a tidy number");
			}
		}

	}

	public static boolean checkTidy(int number) {
		boolean status = false;
		String num = String.valueOf(number);
		char c[] = num.toCharArray();
		int length = c.length;
		int count = 0;
		if (length == 1) {
			status = true;
		} else if (length == 2) {
			if (c[0] <= c[1]) {
				status = true;
			}
		} else {
			for (int i = 0; i < length; i++) {
				for (int j = i + 1; j < length; j++) {
					if (c[i] <= c[j]) {
						count++;
					}
				}
			}
			if (count == length) {
				status = true;
			}
		}
		return status;
	}
}
