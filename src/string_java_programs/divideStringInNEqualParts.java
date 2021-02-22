package string_java_programs;

import java.util.Scanner;
/*
For reference : https://www.javatpoint.com/java-program-to-divide-a-string-in-n-equal-parts
 */

public class divideStringInNEqualParts {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();
		System.out.println("Enter the value of how many parts you want to divide : ");
		int n = sc.nextInt();
		
		int len = s.length();
		
		//First checking if remainder is zero else it cannot be divided into equal parts
		if(len%n!=0)
		{
			System.out.println("The string cannot be divided into "+n+" equal parts.");
		}
		else
		{
			//Suppose string length is 12 and we have to divide it in 3 equal parts,
			//then we have to increment char by 4
			int div = len/n;
			int temp = 0;
			String[] arr = new String[n];
			for(int i=0;i<len-1;i=i+div)
			{
				String s1 = s.substring(i,i+div); 
				arr[temp]= s1;
				temp++;		
			}
			
			System.out.println("Equal parts of the string are : ");
			for(int i=0;i<temp;i++)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
