package advanced_java_programs;
/*
Output : Pairs are : 
(3 5) ,(3 8) ,(3 15) ,(3 12) ,(5 7) ,(7 8) ,(7 11) ,(7 12) ,(8 11) ,
Total number of pairs are : 9
*/

public class pairsWhoseSumAlreadyExistInArray {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 7, 8, 11, 18, 15, 12, 19 };

		int length = arr.length;
		int count = 0;
		
		System.out.println("Pairs are : ");
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				for(int k=0;k<length;k++)
				{
					if(arr[i]+arr[j]==arr[k])
					{
						count++;
						System.out.print("("+arr[i]+" "+arr[j]+") ,");
					}
				}
			}
		}
		System.out.println();
		System.out.println("Total number of pairs are : "+count);		
	}
}
