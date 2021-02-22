package string_java_programs;

import java.util.HashMap;
import java.util.Set;
/*
In this program, we need to find the smallest and the largest word present in the string.
 */
public class findLargestAndSmallestWordInString {

	public static void main(String[] args) {
		
		String s = "Sakshi is a good girl";
		String[] str = s.split(" ");
		String longest = "";
		String smallest = "";
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		//Storing unique words and their length in a hashmap
		for(int i =0;i<str.length;i++)
		{
			String word = str[i];
			if(!hash.containsKey(word))
			{
				hash.put(word, word.length());
			}
		}
		
		Set<String> uniqueWords = hash.keySet();
		int maxLength = Integer.MIN_VALUE;
		int minLength = Integer.MAX_VALUE;
		
		for(String st : uniqueWords)
		{
			int length = hash.get(st);
			if(length>maxLength)
			{
				maxLength = length;
				longest = st;
			}
			
			if(length<minLength)
			{
				minLength = length;
				smallest = st;
			}
		}
		
		System.out.println("Maximum length word is : "+longest+" and its length is : "+maxLength);
		System.out.println("Minimum length word is : "+smallest+" and its length is : "+minLength);
	
	}

}
