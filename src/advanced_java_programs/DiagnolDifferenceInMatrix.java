package advanced_java_programs;

import java.util.Scanner;
import java.lang.Math;

public class DiagnolDifferenceInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of matrix rows you want: ");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int diagnolLeftToRight = 0;
		int diagnolRightToLeft = 0;

		// Entering elements in a matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("Enter the element at row :" + i + " and column :" + j);
				arr[i][j] = sc.nextInt();
			}
		}

		// Displaying the final matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// Calculate sum from left to right( For e.g. in 3*3 matrix : (0,0), (1,1),
				// (2,2)
				if (i == j) {
					diagnolLeftToRight = diagnolLeftToRight + arr[i][j];
				}
				// Calculate sum from right to left( For e.g. in 3*3 matrix : (0,2), (1,1),
				// (2,0). In this case n will be 3
				if (i + j == (n - 1)) {
					diagnolRightToLeft = diagnolRightToLeft + arr[i][j];
				}
			}
		}
		System.out.println("Left to right sum is :" + diagnolLeftToRight);
		System.out.println("Right to left sum is :" + diagnolRightToLeft);

		int difference = Math.abs(diagnolLeftToRight - diagnolRightToLeft);
		System.out.println("Difference is :" + difference);

	}
}
