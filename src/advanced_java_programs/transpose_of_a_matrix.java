package advanced_java_programs;

import java.util.Scanner;

public class transpose_of_a_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows you want");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns you want");
		int col = sc.nextInt();

		int[][] matrix = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter element at " + i + " row and " + j + " column :");
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Original matrix is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		int[][] transpose_matrix = new int[col][row];

		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				transpose_matrix[i][j] = matrix[j][i];
			}
		}

		System.out.println("Transpose of the matrix is :");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(transpose_matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
