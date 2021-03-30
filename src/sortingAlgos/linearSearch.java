package sortingAlgos;
import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array :");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("Enter the elements of an array :");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number you want to search in an array :");
		int number = sc.nextInt();

		int index = linear(arr ,number);
		if(index == -1)
		{
			System.out.println("Number "+number+" is not found in the array.");
		}
		else		
		{
			System.out.println("Number "+number+" is found in the array at location : "+index);
		}
		
	}

	public static int linear(int[] arr, int number)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==number)
				{
					return i;
				}
			}
			return -1;
		}
}
