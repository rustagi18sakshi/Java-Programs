package basic_java_programs;

/*
Fibonacci series is : 
Series is : 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 
*/
import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of integers you want in fibonacci series");
		int num = sc.nextInt();
		int a = 0, b = 1;
		int sum = 0;
		if (num == 1) {
			System.out.print("0");
		} else if (num == 2) {
			System.out.print("0 1 ");
		} else {
			System.out.print("0 1 ");
			for (int i = 0; i < num - 2; i++) {
				sum = a + b;
				System.out.print(sum + " ");
				a = b;
				b = sum;
			}
		}
	}

}
