package advanced_java_programs;

import java.util.Scanner;
/*
Enter the amount of the item you want to purchase : 
3
Enter the note amount that person has inserted : 
1000
Amount to be returned is :997
Total amount returned is in the form of : 
500's :1 ,100's :4 ,50's :1 ,10's :4 ,5's :1 ,1's :2
*/
public class vendingMachine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of the item you want to purchase : ");
		int itemAmount = sc.nextInt();
		
		System.out.println("Enter the note amount that person has inserted : ");
		int noteAmount = sc.nextInt();
		
		int remainingAmount = noteAmount - itemAmount;
		System.out.println("Amount to be returned is :"+remainingAmount);
		int a = 500, b = 100, c = 50, d = 10, e = 5, f = 1;
		
		int fiveHundred = remainingAmount/a;
		remainingAmount = remainingAmount % a;
		
		int hundred = remainingAmount/b;
		remainingAmount = remainingAmount % b;
		
		int fifty = remainingAmount/c;
		remainingAmount = remainingAmount % c;
		
		int ten = remainingAmount/d;
		remainingAmount = remainingAmount % d;
		
		int five = remainingAmount/e;
		remainingAmount = remainingAmount % e;
		
		int one = remainingAmount/f;
		remainingAmount = remainingAmount % f;
		
		System.out.println("Total amount returned is in the form of : ");
		System.out.println("500's :"+fiveHundred+" ,100's :"+hundred+" ,50's :"+fifty+" ,10's :"+ten+" ,5's :"+five+" ,1's :"+one);
	}

}
