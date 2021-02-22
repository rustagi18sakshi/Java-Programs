package basic_java_programs;

import java.util.Scanner;

public class factorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want :");
		int num = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1;i<=num;i++)
		{
				fact = fact*i;
		}
		System.out.println("Factorial of the number is : "+fact);

	}
}
