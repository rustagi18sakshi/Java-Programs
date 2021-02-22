package basic_java_programs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayList_iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Sakshi");
		stringList.add("Abhinav");
		stringList.add("Shruti");
		stringList.add("Rohit");

		int length = stringList.size();
		System.out.println("Length of list is : " + length);

		System.out.println("Elements in the list are : ");
		for (String i : stringList) {
			System.out.print(i + " ");
		}

		// Removing 3rd element from list
		stringList.remove(2);

		System.out.println();
		System.out.println("Elements in the list after deletion are : ");
		for (String i : stringList) {
			System.out.print(i + " ");
		}
		System.out.println();
		// Fetching first and last element from list
		String first = stringList.get(0);
		System.out.println("First element is : " + first);

		String last = stringList.get(stringList.size() - 1);
		System.out.println("Last element is : " + last);

	}

}
