package array_programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class find_duplicate_elements_in_array {

	public static void main(String[] args) {

		String originalArray[] = {"Sakshi","Rachel","Missy","Sheldon","Sakshi","David","Missy","Leo","Sakshi","David"};
		
		// Using brute force 
		System.out.println("**** Brute Force ****");
		
		HashSet<String> uniqueDuplicate = new HashSet<String>();
		for(int i=0; i<originalArray.length; i++)
		{
			for(int j=i+1; j<originalArray.length; j++)
			{
				if(originalArray[i].equals(originalArray[j]))
				{
					uniqueDuplicate.add(originalArray[i]);
				}
			}
		}
		
		System.out.println(uniqueDuplicate);
		
		// Using Hash Set
		System.out.println("**** Using Hashset ****");
		
		HashSet<String> uniqueDuplicates = new HashSet<String>();
		HashSet<String> uniqueElements = new HashSet<String>();
		
		for(int i=0; i<originalArray.length; i++)
		{
			if(uniqueElements.add(originalArray[i])==false)
			{
				uniqueDuplicates.add(originalArray[i]);
			}
		}
		System.out.println(uniqueDuplicates);

		// Using Hash Map
		System.out.println("**** Using Hashmap ****");
		
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		
		for(int i = 0; i<originalArray.length; i++)
		{
			String s = originalArray[i];
			if(hashmap.containsKey(s))
			{
				hashmap.put(s, hashmap.get(s)+1);
			}
			else
			{
				hashmap.put(s, 1);
			}
		}

		for(String key : hashmap.keySet())
		{
			if(hashmap.get(key) > 1)
			{
				System.out.println(key+" ");
			}
		}
	}

}
