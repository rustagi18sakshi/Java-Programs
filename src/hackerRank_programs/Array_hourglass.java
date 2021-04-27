package hackerRank_programs;
import java.util.*;
/*
https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
*/
public class Array_hourglass {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int[][] arr = new int[6][6];
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				System.out.println("Enter the element at position i: "+i+" and j: "+j);
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Initial array matrix is :");
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int maximum = hourglassSum(arr);
		System.out.println("Maximum sum value in the hourglass is : "+maximum);	
	}
	
	
    static int hourglassSum(int[][] arr) {

        ArrayList<Integer> sum = new ArrayList<Integer>();
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                sum.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            }
        }
        
        int maximum = Collections.max(sum);
        return maximum;
    }
}
