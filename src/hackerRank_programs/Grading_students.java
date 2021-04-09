package hackerRank_programs;

import java.util.ArrayList;
/*
https://www.hackerrank.com/challenges/grading/problem
If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
Input  : 73 67 38 33
Output : 75 67 40 33
Explanation :
Student 1 received a 73, and the next multiple of 5 from 73 is 75. Since 75-73<3, the student's grade is rounded to 75 .
Student 2 received a 67, and the next multiple of 5 from 67 is 70. Since 70-67>3, the grade will not be modified and 
the student's final grade is 67.
Student 3 received a 38, and the next multiple of 5 from 38 is 40. Since 40-38<3, the student's grade will be rounded to 40.
Student 4 received a grade below 33, so the grade will not be modified and the student's final grade is 33.
*/

public class Grading_students {

	public static void main(String[] args) {
		
		ArrayList<Integer> inputGrades = new ArrayList<Integer>();
		inputGrades.add(73);
		inputGrades.add(67);
		inputGrades.add(38);
		inputGrades.add(33);
		
		ArrayList<Integer> outputGrades = new ArrayList<Integer>();
		
		outputGrades = gradingStudents(inputGrades);
		
		System.out.println("Output grades rounded off are : ");
		for(Integer i : outputGrades)
		{
			System.out.print(i+" ");
		}
	}
	
    public static ArrayList<Integer> gradingStudents(ArrayList<Integer> grades) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<grades.size(); i++)
        {
            int value = grades.get(i);
            
            if(value<38)
            {
                result.add(value);
            }
            else
            {
                int div = value/5;
                int multiple = div+1;
                int roundOffValue = multiple*5;  // identifying the next multiple of 5
                if((roundOffValue-value) < 3)
                {
                    result.add(roundOffValue);
                }
                else
                {
                    result.add(value);
                }
            }
        }

        return result;
    }
}

