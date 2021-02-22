package basic_java_programs;

import java.util.Scanner;

public class number_reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		int rev = 0, rem = 0;

		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		System.out.println("The reversed number is: " + rev);
	}

}
