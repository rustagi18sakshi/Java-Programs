package string_java_programs;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Input : "Hello my name is \"Sakshi Rustagi\" and \"I love mango\"";
Output : Hello
		 my
         name
         is
         "Sakshi Rustagi"
         and
         "I love mango"
*/
public class splittingString_unless_in_quotes_regex {

	public static void main(String[] args) {
		
		// Adding \ before ", otherwise Java compiler throws error
		String s = "Hello my name is \"Sakshi Rustagi\" and \"I love mango\"";
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		/* Usage of the regex : 
	  		[^\"]   : token starting with something other than \"
		    \\S*    : followed by zero or more non-space characters
		     |      : OR
		    \".+?\" : \" followed by anything until \"
		    \\s*    : followed by zero or more whitespace character
		*/
		Matcher match = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(s);
		
		while(match.find())
		{
			arrayList.add(match.group(1));
		}
		
		String[] output = arrayList.toArray(new String[arrayList.size()]);
		
		for(String out : output)
		{
			System.out.println(out);
		}
	}
}
