package advanced_java_programs;

public class IdentifyTwoSmallestNumberInArrayWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int arr[]={2,4,1,9,3,5,11,0};
		// int arr[]={4,5,7,9,8,1};

		// Consider this for why temp is needed
		int arr[] = { 11, 5, 2, 10, 6, 16 };
		// int arr[]={2,0};
		// int arr[]={-2,-4};
		// int arr[]={-2,-4,-1,-9,-3,-5,-11,0};
		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		int length = arr.length;

		if (length >= 2) {
			for (int i = 0; i < length; i++) {
				int temp = smallest;

				// Checking if the new element is smaller than the smallest number. If yes, then
				// assign it as smallest.
				if (arr[i] < smallest) {
					smallest = arr[i];
				}

				// Checking if the element is greater than smallest number & smaller than 2nd
				// largest. If yes, then assign it as 2nd smallest
				if (arr[i] > smallest && arr[i] < second_smallest) {
					second_smallest = arr[i];
				}
				// Checking if the previous smallest element is smaller than the already
				// existing second smallest element after smallest element is replaced by new
				// element
				if (temp > smallest && temp < second_smallest) {
					second_smallest = temp;
				}
			}
			System.out.println("Smallest and second smallest numbers are : " + smallest + " " + second_smallest);
		} else {
			System.out.println("Atleast two numbers are required");
		}
	}

}
