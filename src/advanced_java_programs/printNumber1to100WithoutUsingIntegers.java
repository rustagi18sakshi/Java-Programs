package advanced_java_programs;

/*
Program to print numbers from 1 to 100 without using integers.
Here we can't use FOR loop with (int i=1;i<=100;i++)
 */
public class printNumber1to100WithoutUsingIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int one = 'A'/'A';
		String s = "..........";
		int len = s.length();
		
		System.out.println("Numbers from 1 to 100 are : ");
		for(int i=one;i<=len*len;i++)
		{
			System.out.println(i);
		}
	}

}
