package array_programs;

import java.util.Arrays;
/*
Input  : [1, 0, 9, 6, 0, 4, 0]
Output : [1, 9, 6, 4, 0, 0, 0]
*/
public class shiftAllZerosToRight {

	public static void main(String[] args) {

		int[] array = new int[]{1, 0, 9, 6, 0, 4, 0};
		
		int[] arr = shiftAllZeros(array);
		System.out.println(Arrays.toString(arr));

	}
	// Here we are creating new array and storing all non zero numbers at the beginning.
	public static int[] shiftAllZeros(int[] a)
	{
		int newArray[] = new int[a.length];
		
		int count = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i] != 0)
			{
				newArray[count] = a[i];
				count++;
			}
		}
		
		return newArray;
	}
}
