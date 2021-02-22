package basic_java_programs;

import java.util.Scanner;

public class swapping_two_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number :");
		int b = sc.nextInt();
		System.out.println("Orignal string is : " + a + " " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Swapped string is : " + a + " " + b);
	}

}
