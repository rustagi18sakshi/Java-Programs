package advanced_java_programs;

import java.util.Scanner;

/*
Math.ceil() : Returns the smallest integer that is greater than or equal to the argument
Math.floor() : Returns the largest integer that is less than or equal to the argument
e.g.
double d1 = 84.6;
double d2 = 0.45;
Math.ceil(d1) = 85, Math.floor(d1) = 84 
Math.ceil(d2) = 1 , Math.floor(d2) = 0 
*/

public class countNumberOfPerfectSquares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number you want : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number you want : ");
		int num2 = sc.nextInt();
		
		int count = countNoOfPerfectSqaure(num1, num2);	
		System.out.println("Total number of perfect squares between "+num1+" and "+num2+" are : "+count);
	}
	
	public static int countNoOfPerfectSqaure(int num1, int num2)
	{
		int count = 0;
		
		for(int i=num1; i<=num2; i++)
		{
			if(Math.ceil((double)Math.sqrt(i))== Math.floor((double)Math.sqrt(i)))
			{
				count++;
			}
		}
		return count;
	}	
	
}
