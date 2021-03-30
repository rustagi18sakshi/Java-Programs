package string_java_programs;

import java.util.Scanner;

public class swapTwoStringWithoutUsingThirdVariable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		//e.g good
		String str1 = sc.nextLine();
		System.out.println("Enter the second string : ");
		//e.g. morning
		String str2 = sc.nextLine();
		System.out.println("String before swapping : "+str1+" "+str2);
		
		//e.g. goodmorning
		str1 = str1+str2;
		
		//good
		str2 = str1.substring(0, (str1.length()-str2.length()));
		
		//morning
		str1 = str1.substring(str2.length());
		
		System.out.println("String after swapping : "+str1+" "+str2);		

	}

}
