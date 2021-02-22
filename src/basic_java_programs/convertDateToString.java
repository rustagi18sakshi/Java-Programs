package basic_java_programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class convertDateToString {

	public static void main(String[] args) {

		Date date = new Date(); 
		
		//Output like : 02/15/2021
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
	    String strDate = formatter.format(date);  
	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
	    
	    //Output like : 15-2-2021 01:14:32
	    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
	    
	    //Output like : 15 February 2021
	    formatter = new SimpleDateFormat("dd MMMM yyyy");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy : "+strDate); 
	    
	    //Output like : 15 February 2021 India Standard Time
	    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
	    
	}
}
