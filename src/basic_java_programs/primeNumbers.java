package basic_java_programs;

import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to verify for prime number : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(" The number : " + num + " is a prime number");
		} else {
			System.out.println("The number : " + num + " is not a prime number");
		}

	}

}
