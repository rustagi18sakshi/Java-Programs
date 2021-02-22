package advanced_java_programs;

public class IdentifyTwoLargestNumberInArrayWithSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[]= {1,5,22,6,8,9,11,2};
		int arr[] = { 0, 3, 5, 7, 1, 0, 9, 2 };
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is: ");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Largest two numbers in an array are: " + arr[length - 2] + " " + arr[length - 1]);
	}
}
