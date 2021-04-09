package patterns_programs;

/*
Printing the alphabetic pattern in lower case : 

a 
a b 
a b c 
a b c d 
a b c d e 
a b c d e f 
*/
public class basic_pattern_9 {

	public static void main(String[] args) {
		
		// In ASCII , a=97, b=98 and so on.
		int alpha = 97;
		
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
