package string_java_programs;

//Complexity = O(N)
//Issue : It can not take consecutive number. For eg in string "jwj34r4h7sk98" it will take numbers as:
// " 3, 4, 4,7,9,8" and not as " 34,4,7,98"

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.PortableInterceptor.INACTIVE;

public class extractNumbersFromStringAndSumThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6'
					|| c == '7' || c == '8' || c == '9') {
				String number = Character.toString(c);
				int num = Integer.valueOf(number);
				arrayList.add(num);
			}
		}
		System.out.println("Total numbers in this string are :" + arrayList.size());
		System.out.print("Numbers in this string are : ");
		for (Integer num : arrayList) {
			System.out.print(num + " ");
			sum = sum + num;
		}
		System.out.println();
		System.out.println("Sum of the numbers is : " + sum);
	}

}
