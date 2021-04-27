package array_programs;

//Complexity = O(N)
// Issue : Duplicate variables not considered

public class IdentifyTwoLargestNumberInArrayWithoutSorting {

	public static void main(String[] args) {

		// int arr[]={2,4,1,9,3,5,11,0};
		// int arr[]={4,5,7,9,8,1};
		// int arr[]={11,5,2,10,6,16};
		// int arr[]={2,0};
		// int arr[]={-2,-4,-1,-9,-3,-5,-11,0};

		// Consider this array for why we need temp
		int[] arr = {11, 18, 19, 9, 0, 2};

		int length = arr.length;
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;

		if(length >= 2) 
		{
			for (int i=0; i<length; i++) 
			{
				int temp = largest;
				
				// Checking if the element is greater than the largest number.If yes, then assign it as largest.
				if (arr[i] > largest) 
				{
					largest = arr[i];
				}
				// Checking if the element is less than largest number & greater than 2nd largest.
				// If yes, then assign it as 2nd largest
				if (arr[i] > second_largest && arr[i] < largest) 
				{
					second_largest = arr[i];
				}
				// Checking if the previous largest element is greater than the already existing
				// second largest element after largest element is replaced by new element
				if (temp < largest && temp > second_largest)
				{
					second_largest = temp;
				}
			}
			
			System.out.println("Largest two numbers in an array are: " + second_largest + " " + largest);
		} 
		else
		{
			System.out.println("There are less than two numbers in an array");
		}
	}
}
