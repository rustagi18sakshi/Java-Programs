package patterns_programs;

/*
This pattern will print like this : 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/

public class basic_pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
