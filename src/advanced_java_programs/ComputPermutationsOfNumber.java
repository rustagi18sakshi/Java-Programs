package advanced_java_programs;

import java.util.Scanner;

/*
 	Permutation = factorial(n) / factorial(n-r);
	Combination =  factorial(n) / (factorial(r) * factorial(n-r));
	e.g. if n = 5, r = 3
	Permutation = 60, Combination = 10
 */
public class ComputPermutationsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n: ");
		int n = sc.nextInt();
		System.out.println("Enter value for r: ");
		int r = sc.nextInt();

		int permutation = factorial(n) / factorial(n - r);
		System.out.println("Permutation of the number is :" + permutation);

		int combination = factorial(n) / (factorial(n - r) * factorial(r));
		System.out.println("Combination of the number is :" + combination);
	}

	public static int factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
