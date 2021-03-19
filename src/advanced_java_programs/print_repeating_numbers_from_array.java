package advanced_java_programs;

import java.util.HashSet;
import java.util.Scanner;

public class print_repeating_numbers_from_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of integers you want in an array");
		int num = sc.nextInt();

		int[] numbers = new int[num];
		System.out.println("enter " + num + " numbers :");
		for (int i = 0; i < num; i++) {
			numbers[i] = sc.nextInt();
		}

		HashSet<Integer> all_nonRepeating_elements = new HashSet<Integer>();
		HashSet<Integer> all_Repeating_elements = new HashSet<Integer>();

		for (int i = 0; i < num; i++) {
			boolean status = false;

			status = all_nonRepeating_elements.add(numbers[i]);

			if (status == false) {
				all_Repeating_elements.add(numbers[i]);
			}
		}

		System.out.println("All repeating elements are : "+all_Repeating_elements);

	}

}
