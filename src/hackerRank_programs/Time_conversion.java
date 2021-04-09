package hackerRank_programs;

import java.util.Scanner;

/*
https://www.hackerrank.com/challenges/time-conversion/problem
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
      - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock. 
Input  : 07:05:45PM
Output : 19:05:45
Input  : 12:40:22AM
Output : 00:40:22
Input  : 12:45:54PM
Output : 12:45:54
*/
public class Time_conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string date in HH:MM:SSAM or HH:MM:SSPM : ");
		String s = sc.nextLine();

        String result = timeConversion(s);
        System.out.println("Converted string is : "+result);
	}
	
    static String timeConversion(String s) {
        
        String output = "";
        String[] arr = s.split(":");
        
        if(s.contains("AM") && arr[0].contains("12"))
        {
            arr[0]="00";
        }  
        else if(s.contains("PM"))
        {
            if(arr[0].contains("12"))
            {
                arr[0]="12";
            } 
            else
            {    
                int hour = Integer.valueOf(arr[0]);
                hour = hour + 12;
                arr[0] = Integer.toString(hour);  
            }
        }
        
        output = arr[0]+":"+arr[1]+":"+arr[2].substring(0,2);
        return output;
    }
}
