package basic_java_programs;

import java.util.Scanner;

public class fibonacci_series_recursion {
	static int a = 0, b = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of integers you want in fibonacci series");
		int num = sc.nextInt();

		System.out.print("0 1 ");
		fibonacci(num - 2);

	}

	public static void fibonacci(int num) {
		if (num > 0) {
			int sum = a + b;
			System.out.print(sum + " ");
			a = b;
			b = sum;
			fibonacci(num - 1);
		}
	}

}
