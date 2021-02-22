package advanced_java_programs;

import java.util.Scanner;

//Complexity= O(N^2)

public class pairs_that_sum_to_a_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[]={1,2,3,4,5,6,7,8,9,10};
		int arr[] = { 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum of whom you want pairs:");
		int sum = sc.nextInt();
		int length = arr.length;
		int count = 0;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if ((arr[i] + arr[j]) == sum) {
					System.out.println("Pair of the sum is: (" + arr[i] + "," + arr[j] + ")");
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("No such combination of sum exist from given numbers");
		} else {
			System.out.println("The total possible combinations of the sum from given number are: " + count);
		}
	}
}
