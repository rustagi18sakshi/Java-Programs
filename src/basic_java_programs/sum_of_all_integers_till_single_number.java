package basic_java_programs;

import java.util.Scanner;

public class sum_of_all_integers_till_single_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number ");
		int num = sc.nextInt();
		while (num > 9) {
			num = calculateSum(num);
		}
		System.out.println("Sum of all the digits of the number is : " + num);
	}

	public static int calculateSum(int num) {
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}
}
