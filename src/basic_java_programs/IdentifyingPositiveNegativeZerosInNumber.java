package basic_java_programs;

import java.util.Scanner;

//This code inputs an array with positive number, negative number and zeros. We have to identify total number of positive numbers, 
// negative numbers and zeros and divide them by total number of inputs

public class IdentifyingPositiveNegativeZerosInNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the " + i + " element :");
			arr[i] = sc.nextInt();
		}
		
		float positive = 0;
		float negative = 0;
		float zero = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				positive = positive + 1;
			} else if (arr[i] == 0) {
				zero = zero + 1;
			} else {
				negative = negative + 1;
			}
		}

		float positives = positive / n;
		float negatives = negative / n;
		float zeros = zero / n;
		System.out.println("Number of positive elements divided by total elements :" + positives);
		System.out.println("Number of negative elements divided by total elements :" + negatives);
		System.out.println("Number of zero elements divided by total elements :" + zeros);
	}
}
