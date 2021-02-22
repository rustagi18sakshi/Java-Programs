package string_java_programs;

/*
Enter number of strings you want in an array : 5
Enter all the strings : sakshi shru abhinav rohit ahul
Sorted array is: shru ahul rohit sakshi abhinav 
*/
import java.util.Scanner;

public class sortStringOnBasisOfLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings you want in an array : ");
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		
		System.out.println("Enter all the strings : ");
		for(int i=0;i<num;i++)
		{	
			arr[i] = sc.next();
		}
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i].length()>arr[j].length())
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is : ");
		for (int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
