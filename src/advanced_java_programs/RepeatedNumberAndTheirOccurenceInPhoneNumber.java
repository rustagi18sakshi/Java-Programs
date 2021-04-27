package advanced_java_programs;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/* For e.g. Input : 98917959956
   Output : 
   Number  Occurence
   9		5
   8		1
   1		1
   7		1
   5		2
   6        1
 */
public class RepeatedNumberAndTheirOccurenceInPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phone number");
		Long num = sc.nextLong();

		HashMap<Long, Integer> phoneNumberUnique = new HashMap<Long, Integer>();
		while (num > 0) {
			long rem = num % 10;

			if (phoneNumberUnique.containsKey(rem)) {
				phoneNumberUnique.put(rem, (phoneNumberUnique.get(rem) + 1));
			} else {
				phoneNumberUnique.put(rem, 1);
			}
			num = num / 10;
		}

		Set<Long> keys = phoneNumberUnique.keySet();

		System.out.println("Number      Occurence");

		for (Long key : keys) {
			System.out.println(key + "           " + phoneNumberUnique.get(key));
		}
	}
}
