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

public class checkIfNumberIsPerfectSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want : ");
		int num = sc.nextInt();
		
		isPerfectSqaure(num);	
	}
	
	public static void isPerfectSqaure(int number)
	{
	
		if(Math.ceil((double)Math.sqrt(number))== Math.floor((double)Math.sqrt(number)))
		{
			System.out.println("Number : "+number+" is a perfect square.");
		}
		else
		{
			System.out.println("Number : "+number+" is not a perfect square.");
		}	
	}	
	
}
