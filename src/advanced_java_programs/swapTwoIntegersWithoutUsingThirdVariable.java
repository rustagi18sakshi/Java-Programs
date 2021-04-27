package advanced_java_programs;

import java.util.Scanner;

public class swapTwoIntegersWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first integer : ");
		int num1 = sc.nextInt();  // e.g. 5
		
		System.out.println("Enter the second integer : ");
		int num2 = sc.nextInt();  // e.g. 6
		
		System.out.println("Numbers before swapping are : "+num1+" "+num2);    // 5 6 
		
		num1 = num1 + num2;      // 11
		
		num2 = num1 - num2;      // 5
		num1 = num1 - num2;      // 6
		
		System.out.println("Numbers after swapping are : "+num1+" "+num2);     // 6 5
		
	}
}

