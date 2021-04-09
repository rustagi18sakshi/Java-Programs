package matrix_programs;

/*
Link to refer : https://www.programmingsimplified.com/java/source-code/java-program-multiply-two-matrices
*/
import java.util.Scanner;

public class multiplication_of_two_matrices {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of rows for first matrix :");
		int row1 = sc.nextInt();
		System.out.println("Enter the total number of columns for first matrix :");
		int col1 = sc.nextInt();
		
		int[][] matrix1 = new int[row1][col1];
		System.out.println("Enter first matrix values :");
		matrix1 = readInput(sc, row1, col1);
		
		System.out.println("Enter the total number of rows for second matrix :");
		int row2 = sc.nextInt();
		System.out.println("Enter the total number of columns for second matrix :");
		int col2 = sc.nextInt();
		
		int[][] matrix2 = new int[row2][col2];
		System.out.println("Enter second matrix values :");
		matrix2 = readInput(sc, row2, col2);
		
		System.out.println("First matrix is :");
		displayMatrix(matrix1);
		
		System.out.println("Second matrix is :");
		displayMatrix(matrix2);
		
		//Matrix formed by multiplication will have:
		//rows = no. of rows of matrix 1, columns = no.of columns of matrix2
		int[][] multiplicationMatrix = new int[row1][col2];
		
		int sum=0;
		
		if(col1!=row2)
		{
			System.out.println("The matrices can't be multiplied with each other");
		}
		else
		{	
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col2;j++)
				{
					for(int k=0;k<col1;k++)
					{
						sum = sum + matrix1[i][k]*matrix2[k][j];
					}
					multiplicationMatrix[i][j] = sum;
					sum = 0;
				}	
			}
		}
		
		System.out.println("Multiplication matrix is :");
		displayMatrix(multiplicationMatrix);
	}
	
	//function for taking input matrix from user
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
	
	//function for displaying matrix content
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

}
