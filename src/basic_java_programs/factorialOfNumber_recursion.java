package basic_java_programs;

import java.util.Scanner;

public class factorialOfNumber_recursion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want :");
		int num = sc.nextInt();
		
		int factorialRecursion = factorial(num);
		System.out.println("Factorial of a number is : "+factorialRecursion);
	}
	public static int factorial(int num)
	{
		if(num==0)
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
	}
}
