package string_java_programs;

/*Complexity = O(N^2)
Enter the desired string:
my name is sakshi
Reverse string is: 
ym eman si ihskas */

import java.util.ArrayList;
import java.util.Scanner;

public class reversing_all_elements_in_string {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired string:");
		String s = sc.nextLine();
		String[] str = s.split(" ");
		int length = str.length;
		System.out.println("Reverse string is: ");

		for (int i = 0; i < length; i++) {
			String originalString = str[i];
			String reverseString = "";
			int stringLen = originalString.length();
			for (int j = stringLen - 1; j >= 0; j--) {
				reverseString = reverseString + originalString.charAt(j);
			}
			System.out.print(reverseString + " ");
		}
	}

}
