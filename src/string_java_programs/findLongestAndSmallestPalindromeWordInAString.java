package string_java_programs;

/*
Input : Wow you own kayak
Longest palindrome word in the string is : kayak of length : 5
Smallest palindrome word in the string is : wow of length : 3
*/
public class findLongestAndSmallestPalindromeWordInAString {

	public static void main(String[] args) {

		String s = "Wow you own kayak";
		String[] arr = s.toLowerCase().split(" ");
		
		// Assign minimum and maximum value
		int maxLength = Integer.MIN_VALUE;
		int minLength = Integer.MAX_VALUE;
		
		String longest = "";
		String smallest = "";
		
		for(int i=0; i<arr.length; i++)
		{
			String str = arr[i];
			int length = str.length();
			boolean status = isPalindrome(str);   // Verifying if the string is palindrome

			if(status == true)
			{
				if(length > maxLength)
				{
					maxLength = length;
					longest = str;
				}
				if(length < minLength)
				{
					minLength = length;
					smallest = str;
				}
			}
		}
		
		System.out.println("Longest palindrome word in the string is : "+longest+" of length : "+maxLength);
		System.out.println("Smallest palindrome word in the string is : "+smallest+" of length : "+minLength);
	}
	
	public static boolean isPalindrome(String s)
	{
		boolean status = false;
		
		String original = s;
		String reverse = "";
		
		for(int i=original.length()-1; i>=0; i--)
		{
			reverse = reverse + s.charAt(i);
		}
		
		if(original.equals(reverse))
		{
			status = true;
		}
		
		return status;
	}

}
