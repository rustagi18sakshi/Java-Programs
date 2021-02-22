package basic_java_programs;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}

		if (temp == sum) {
			System.out.println("Number:" + " " + temp + " " + "is a palindrome");
		} else {
			System.out.println("Number:" + " " + temp + " " + "is not a palindrome");
		}
	}

}
