package stack_programs;

import java.util.Scanner;
import java.util.Stack;

/*
https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/?ref=leftbar-rightbar
Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
Input: exp = [()]{}{[()()]()} 
Output: Balanced

Input: exp = [(]) 
Output: Not Balanced

Algorithm : 
1. Declare a character stack S.
2. Now traverse the expression string exp. 
If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is 
the matching starting bracket then fine else brackets are not balanced.
*/
public class checkForBalancedExpressions {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want : ");
		String s = sc.nextLine();
		
		boolean status = isBalanced(s);
		if(status == true)
		{
			System.out.println("This is a balanced string. ");
		}
		else
		{
			System.out.println("This is not a balanced string. ");
		}

	}

	public static boolean isBalanced(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++)
		{
			Character c = s.charAt(i);
			
			if(c=='{' || c=='(' || c=='[')
			{
				stack.push(c);
				continue;       // skip the next steps and move with next value of i
			}
			
			// If current character is not an opening bracket, then it must be closing. 
			// Thereby making it unbalanced. So return false. e.g. }[]
			if(stack.isEmpty())
			{
	           return false;
			}
			
			char check;
			
			switch(c)
			{
			case ')':
				check = stack.pop();
				if(check=='{' || check=='[')
				{
					return false;
				}
				break;
			case '}':
				check = stack.pop();
				if(check=='(' || check=='[')
				{
					return false;
				}
				break;
			case ']':
				check = stack.pop();
				if(check=='(' || check=='{')
				{
					return false;
				}
				break;
			}
		}

		return stack.isEmpty();   // stack must be empty if string is balanced
	}
}
