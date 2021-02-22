package basic_java_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class all_prime_number_till_nth_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number within which you want all prime numbers :");
		int num = sc.nextInt();

		System.out.println("All the prime number within " + num + " are : ");

		for (int i = 1; i <= num; i++) {
			int count = 0;
			int number = i;
			for (int j = 1; j <= number; j++) {
				if (number % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(number + " ");
			}
		}

	}

}
