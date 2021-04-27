package matrix_programs;

import java.util.Scanner;
/*
Inplace means we have to modify the original matrix and not use new matrix for creating transpose.
Square matrix means : 2*2, 3*3, 4*4 etc.
Original matrix is :
1 2 3 
4 5 6 
7 8 9 
Transpose of the matrix is :
1 4 7 
2 5 8 
3 6 9 
*/
public class InplaceTransposeOfSquareMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want");
		int row = sc.nextInt();
		
		System.out.println("Enter the number of columns you want");
		int col = sc.nextInt();

		int[][] matrix =  readInput(sc, row, col);

		System.out.println("Original matrix is :");
		displayMatrix(matrix);

		// Using j=i+1 since suppose in 3*3 matrix
		// matrix[0][1] will be exchanged with matrix[1][0]. So if we start with i=1, j=,
		// then 
		for(int i=0; i<row; i++)
		{
			for(int j=i+1; j<col; j++)
			{
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}


		System.out.println("Transpose of the matrix is :");
		displayMatrix(matrix);
	}
	
	public static int[][] readInput(Scanner sc, int row, int col)
	{
		int[][] matrix = new int[row][col];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
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
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
