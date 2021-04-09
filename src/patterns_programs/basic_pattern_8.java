package patterns_programs;

/*
Printing the alphabetic pattern : 

A
A B
A B C
A B C D 
A B C D E
A B C D E F
*/
public class basic_pattern_8 {

	public static void main(String[] args) {
		
		// In ASCII , A=65, B=66 and so on.
		int alpha = 65;
		
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print((char)(alpha+j)+" ");  // Type Casting using char
			}
			System.out.println();
		}
	}
}
