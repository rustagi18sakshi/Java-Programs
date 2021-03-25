package string_java_programs;

import java.util.Scanner;
/*
Input : hi sakshi zebra go
Output : go hi sakshi zebra
*/
		
public class sortWordsInArrayInDictionaryOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings you want in an array : ");
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		System.out.println("Enter the elements of the array : ");
		
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.next();
		}

		for(int i=0;i<num-1;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if((arr[i].compareToIgnoreCase(arr[j])) > 0)   // Using compareToIgnoreCase
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted array on the basis of words in dictiorary is : ");
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
