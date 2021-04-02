package advanced_java_programs;

import java.util.Scanner;
import java.util.Stack;

/*
Input: str= “azxxxzy”
Output: azxzy 
Input: str= “azxxzy”
Output: ay 
*/
public class removeAllAdjacentDuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want :");
		String s = sc.nextLine();
		
		String output = removeAdjacentDuplicatesUsingStack(s);
		System.out.println("String with all adjacent characters removed is :"+output);	
	}
	
	public static String removeAdjacentDuplicatesUsingStack(String s)
	{
		String shortString = "";
		
		Stack<Character> stack = new Stack<Character>();  // Defining a stack
		
		int i = 0;
		
		while(i < s.length())
		{
			// Checks if stack is empty or top of the stack is not equal to current character
			if(stack.isEmpty() || s.charAt(i)!=stack.peek())
			{
				stack.add(s.charAt(i));
				i++;
			}
			// If top element of the stack is equal to the current character 
			else
			{
				stack.pop();
				i++;
			}
		}
		
		// If stack is empty 
		if(stack.isEmpty())
		{
			return "Empty String";
		}
		// If stack is not Empty 
		else 
		{
			while(!stack.isEmpty())
			{
				shortString = stack.peek() + shortString;
				stack.pop();
			}
		}
		
		return shortString;
	}

}
