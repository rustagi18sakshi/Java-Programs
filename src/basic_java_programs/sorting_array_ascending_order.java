package basic_java_programs;

import java.util.Scanner;

public class sorting_array_ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array:");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter all the numbers:");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			for (int j = i + 1; j < num; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is:");
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
