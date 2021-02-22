package basic_java_programs;

import java.util.ArrayList;
import java.util.Arrays;

public class remove_duplicates_from_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1, 2, 5, 6, 5, 5, 3, 8, 8));

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (Integer num : list1) {
			if (!list2.contains(num)) {
				list2.add(num);
			}
		}

		System.out.println("List having duplicates is : " + list1);
		System.out.println("List having duplicates removed is : " + list2);
	}

}
