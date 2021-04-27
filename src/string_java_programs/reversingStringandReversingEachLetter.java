package string_java_programs;

import java.util.Scanner;

/* input = hello world
   output = dlrow olleh 
*/

public class reversingStringandReversingEachLetter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the desired string : ");
		String str = sc.nextLine();
		
		String[] s = str.split(" ");

		System.out.println("Reversed string is : ");
		
		for(int i=s.length-1; i>= 0; i--) 
		{
			String original = s[i];
			String reverse = "";
			
			for (int j=original.length()-1; j>= 0; j--) 
			{
				reverse = reverse + original.charAt(j);
			}
			
			System.out.print(reverse + " ");
		}
	}
}
