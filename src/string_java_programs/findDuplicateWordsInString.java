package string_java_programs;

import java.util.HashSet;
import java.util.Scanner;

public class findDuplicateWordsInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//e.g. String : Big black bug bit a big black dog on his big black nose
		System.out.println("Enter the string you want : ");
		String s = sc.nextLine();
		
		String[] arr = s.toLowerCase().split(" ");
		
		int length = arr.length;
		
		HashSet<String> uniqueWords = new HashSet<String>();
		HashSet<String> duplicateWords = new HashSet<String>();
		
		for(int i=0; i<length; i++)
		{
			String str = arr[i];
			
			boolean status = uniqueWords.add(str);
			
			if(status == false)
			{
				duplicateWords.add(str);
			}
		}
		
		System.out.println("Duplicate words in a string are : "+duplicateWords);
	}

}
