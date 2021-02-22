package advanced_java_programs;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* FOr eg. Input : 9891795995
   Output : 
   Number  Occurence
   9		5
   8		1
   1		1
   7		1
   5		2
 */
public class RepeatedNumberAndTheirOccurenceInPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phone number");
		int num = sc.nextInt();

		HashMap<Integer, Integer> phoneNumberUnique = new HashMap<Integer, Integer>();
		while (num > 0) {
			int rem = num % 10;

			if (phoneNumberUnique.containsKey(rem)) {
				phoneNumberUnique.put(rem, (phoneNumberUnique.get(rem) + 1));
			} else {
				phoneNumberUnique.put(rem, 1);
			}
			num = num / 10;
		}

		Set<Integer> keys = phoneNumberUnique.keySet();

		System.out.println("Number      Occurence");

		for (Integer key : keys) {
			System.out.println(key + "           " + phoneNumberUnique.get(key));
		}
	}
}
