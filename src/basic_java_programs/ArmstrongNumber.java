package basic_java_programs;

import java.util.Scanner;
import java.lang.Math;

/* Armstrong numbers are those numbers whose sum of (digits^3) is equal to the number itself
 e.g input = 371 / 153
 sum = 3^3+7^3+1^3 = 371
 output = 371
 input == output . Therefore Armstrong number
 */

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want : ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;

		while (num > 0) {
			int rem = num % 10;
			sum = (int) (sum + Math.pow(rem, 3));
			num = num / 10;
		}

		System.out.println("Sum is : " + sum);

		if (sum == temp) {
			System.out.println("This is an Armstrong number");
		} else {
			System.out.println("This is not an Armstrong number");
		}
	}

}
