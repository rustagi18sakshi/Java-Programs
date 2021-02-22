package patterns_programs;

/*
Pyramid of numbers in Java : 
     0 
    0 1 
   0 1 2 
  0 1 2 3 
 0 1 2 3 4 
 */
public class basic_pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
