package hackerRank_programs;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings

Example : 
S = AAABABB
Output : 3 (ABAB) 7-4=3
Remove A and B at adjacent positions. Find the minimum number of deletions done.
 */
public class min_deletions_adjacent_characters_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s = sc.nextLine();
		
		int count = 0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
		}
		System.out.println("Minumum number of deletions done :"+count);		
	
	}
}
