package advanced_java_programs;

/*
 Link for reference : https://www.java67.com/2012/08/java-program-to-find-gcd-of-two-numbers.html
 Euclid method : 
 In Euclid's algorithm, we start with two numbers X and Y. 
 If Y is zero then greatest common divisor of both will be X, but if Y is not zero then we assign the Y to X
 and Y becomes X%Y.
*/
import java.util.Scanner;

public class HCFofTwoNumbersUsingEuclidMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		
		int HCF = calculateHCF(num1, num2);
		System.out.println("HCF of the numbers is : "+HCF);
	}
	
	public static int calculateHCF(int num1, int num2)
	{
		if(num2==0)
		{
			return num1;
		}
		return calculateHCF(num2, num1%num2);
	}
}
