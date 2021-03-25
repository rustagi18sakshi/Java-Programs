package basic_java_programs;

import java.util.Scanner;

public class reversalOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an array :");
		int num  = sc.nextInt();
		
		String[] arr = new String[num];
		System.out.println("Enter the elements of an array :");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.next();
		}
		
		System.out.println("Reversed array is :");
		for(int i=num-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
