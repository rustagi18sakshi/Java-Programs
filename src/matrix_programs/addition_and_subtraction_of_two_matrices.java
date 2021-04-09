package matrix_programs;

import java.util.Scanner;

public class addition_and_subtraction_of_two_matrices {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the total number of rows :");
			int row = sc.nextInt();
			System.out.println("Enter the total number of columns :");
			int col = sc.nextInt();
			
			int[][] matrix1 = new int[row][col];
			int[][] matrix2 = new int[row][col];
			
			System.out.println("Enter first matrix values :");
			matrix1 = readInput(sc, row, col);
			
			System.out.println("Enter second matrix values :");
			matrix2 = readInput(sc, row, col);
			
			System.out.println("First matrix is :");
			displayMatrix(matrix1);
			
			System.out.println("Second matrix is :");
			displayMatrix(matrix2);
			
			System.out.println("Addition of the two matrices is :");
			int[][] additionMatrix = addMatrix(matrix1,matrix2);
			displayMatrix(additionMatrix);
			
			System.out.println("Subtraction of the two matrices is :");
			int[][] subtractionMatrix = subtractMatrix(matrix1,matrix2);
			displayMatrix(subtractionMatrix);
			
		}
		
		public static int[][] readInput(Scanner sc, int row, int col)
		{
			int[][] matrix = new int[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.println("Enter value at row : "+i+" and column : "+j);
					matrix[i][j] = sc.nextInt();
				}
			}
			return matrix;
		}
		
		public static void displayMatrix(int matrix[][])
		{
			int row = matrix.length;
			int col = matrix[0].length;
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		public static int[][] addMatrix(int matrix1[][], int matrix2[][])
		{
			int row = matrix1.length;
			int col = matrix1[0].length;
			
			int[][] resultMatrix = new int[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					resultMatrix[i][j] = matrix1[i][j]+matrix2[i][j];
				}
			}
			return resultMatrix;
		}
		
		public static int[][] subtractMatrix(int matrix1[][], int matrix2[][])
		{
			int row = matrix1.length;
			int col = matrix1[0].length;
			
			int[][] resultMatrix = new int[row][col];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					resultMatrix[i][j] = matrix1[i][j]-matrix2[i][j];
				}
			}
			return resultMatrix;
		}
}
