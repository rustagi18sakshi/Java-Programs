package patterns_programs;

/*
-----------------------------------
This pattern will print like this :
* 
* * 
* * * 
* * * * 
* * * * * 
-----------------------------------
*/

public class basic_pattern_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
