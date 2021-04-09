package advanced_java_programs;

/*
Link to refer : https://www.programiz.com/java-programming/examples/leap-year

A leap year is exactly divisible by 4 except for century years (years ending with 00).
The century year is a leap year only if it is perfectly divisible by 400.
*/
import java.util.Scanner;

public class calculateLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year you want :");
		int year = sc.nextInt();
		
		boolean status = false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				// year is divisible by 400, hence the year is a leap year
				if(year%400==0)
				{
					status = true;
				}
				else
				{
					status = false;
				}
			}
			else
			{
				//since year%4 ==0 && year%100!=0, that means it is a leap year . e.g 1992, 2012
				status = true;
			}
		}
		else
		{
			status = false;
		}
		
		if(status == true)
		{
			System.out.println("Year "+year+" is a leap year");	
		}
		else
		{
			System.out.println("Year "+year+" is not a leap year");
		}
	}

}
