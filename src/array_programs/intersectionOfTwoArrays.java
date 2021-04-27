package array_programs;

import java.util.Arrays;
import java.util.HashSet;
/*
Input arrays : {0,2,4,6,8}, {1,3,10,4,7,8,9}
Output array : 4,8
Input arrays : {0,2,2,4,6,6,8}, {1,3,10,10,4,7,8,9}
Output array : 4,8
*/

public class intersectionOfTwoArrays {

	public static void main(String[] args) {
		
		// Arrays with distinct elements in each of the array
		Integer[] firstArray = {0,2,4,6,8};
	    Integer[] secondArray = {1,3,10,4,7,8,9};
	    
	    intersectionUsingSet(firstArray, secondArray);

	    System.out.println();
	    
	    // Array with duplicate elements in the array
	    Integer[] firstArray1 = {0,2,2,4,6,6,8};
	    Integer[] secondArray2 = {1,3,10,10,4,7,8,9};
	    
	    intersectionUsingSet(firstArray1, secondArray2);
	}
	
	// Using function addAll and retainAll of Collections.
	public static void intersectionUsingSet(Integer[] firstArray, Integer[] secondArray)
	{
	    HashSet<Integer> set = new HashSet<Integer>();
	    
	    set.addAll(Arrays.asList(firstArray));
	    
	    set.retainAll(Arrays.asList(secondArray));
	    
	    Integer[] intersectionArray = set.toArray(new Integer[set.size()]);
	    
	    System.out.println("Intersection of two arrays using set is : ");
	    
	    for(int i=0; i<intersectionArray.length; i++)
	    {
	    	System.out.print(intersectionArray[i]+" ");
	    }
	}
	
}
