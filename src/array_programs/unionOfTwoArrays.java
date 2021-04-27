package array_programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/*
Input arrays : {0,2,4,6,8}, {1,3,10,4,7,8,9}
Output array : 0 1 2 3 4 6 7 8 9 10 
Input arrays : {0,2,2,4,6,6,8}, {1,3,10,10,4,7,8,9}
Output array : 0 1 2 3 4 6 7 8 9 10 
*/

public class unionOfTwoArrays {

	public static void main(String[] args) {
		
		// Arrays with distinct elements in each of the array
		int[] firstArray = {0,2,4,6,8};
	    int[] secondArray = {1,3,10,4,7,8,9};
	    
	    unionUsingSet(firstArray, secondArray);
	    
	    System.out.println();
	    
	    unionUsingHashMap(firstArray,secondArray);
	    System.out.println();
	    
	    // Array with duplicate elements in the array
		int[] firstArray1 = {0,2,2,4,6,6,8};
	    int[] secondArray2 = {1,3,10,10,4,7,8,9};
	    
	    unionUsingSet(firstArray1, secondArray2);
	    
	    System.out.println();
	    
	    unionUsingHashMap(firstArray1,secondArray2);
	}
	
	// All the unique values will be added to the set thus giving us the union
	public static void unionUsingSet(int[] firstArray, int[] secondArray)
	{
	    HashSet<Integer> set = new HashSet<Integer>();
	    
	    for(int i=0; i<firstArray.length; i++)
	    {
	    	set.add(firstArray[i]);
	    }
	    
	    for(int i=0; i<secondArray.length; i++)
	    {
	    	set.add(secondArray[i]);
	    }
	    
	    Integer[] unionArray = set.toArray(new Integer[set.size()]);
	    
	    System.out.println("Union of two arrays using set is : ");
	    for(int i=0; i<unionArray.length; i++)
	    {
	    	System.out.print(unionArray[i]+" ");
	    }
	}
	
	// All the keys will be added to the HashMap. Here we do not care about the value of the key.
	// Print all the keys to get the union.
	public static void unionUsingHashMap(int[] firstArray, int[] secondArray)
	{
	    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
	    
	    for(int i=0; i<firstArray.length; i++)
	    {
	    	Integer item = firstArray[i];
	    	if(hash.containsKey(item))
	    	{
	    		hash.put(item, hash.get(item)+1);
	    	}
	    	else
	    	{
	    		hash.put(item, 1);
	    	}
	    }
	    
	    for(int i=0; i<secondArray.length; i++)
	    {
	    	Integer item = secondArray[i];
	    	if(hash.containsKey(item))
	    	{
	    		hash.put(item, hash.get(item)+1);
	    	}
	    	else
	    	{
	    		hash.put(item, 1);
	    	}
	    }
	    
	    Set<Integer> keys = hash.keySet();
	    
	    System.out.println("Union of two arrays using hashmap is : ");  

	    for(Integer key : keys)
	    {
	    	System.out.print(key+" ");
	    }
	}
	
}
