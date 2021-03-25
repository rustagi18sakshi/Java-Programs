package advanced_java_programs;

/*
Input={12,34,45,9,8,90,3}
Output ={12,34,8,90,45,9,3}
*/
public class oddEvenSegregationUsingSwapping {

	public static void main(String[] args) {
		
		int[] inputArr = {12,34,45,9,8,90,3};

		for(int i=0; i<inputArr.length-1; i++)
		{
			int num = inputArr[i];
			
			if(num%2==0)
			{
				inputArr[i] = num;
			}
			else
			{
				for(int j=i+1; j<inputArr.length; j++)
				{
					if((inputArr[j]%2)==0)
					{
						int temp = inputArr[i];
						inputArr[i] = inputArr[j];
						inputArr[j] = temp;
						break;
					}
				}
			}
		}
		
		System.out.println("Even and odd number segregated are : ");
		for(int i= 0;i<inputArr.length;i++)
		{
			System.out.print(inputArr[i]+" ");
		}
	}
}
