package string_java_programs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class findMostRepeatedWordInTextFile {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		FileReader file = new FileReader(projectPath+"/src/string_java_programs/file.txt");
		BufferedReader br = new BufferedReader(file);
		
		String line = "";
		ArrayList<String> list = new ArrayList<String>();
		
		while((line = br.readLine())!=null)
		{
			//Splitting the line obtained by space and storing the words in a string array
			String[] str = line.toLowerCase().split(" ");
			for(String s : str)
			{
				list.add(s);
			}		
		}
		
		int maxCount = 0;
		int length = list.size();
		String maxCharacter = "";
		
		for(int i=0;i<length;i++)
		{
			int count =1;
			for(int j=i+1;j<length;j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					count++;
				}
			}
			
			if(count>maxCount)
			{
				maxCount = count;
				maxCharacter = list.get(i);			
			}
		}
		
		System.out.println("Most repeated character in the file is : "+maxCharacter);
		System.out.println("Most repeated character is : "+maxCount);
	}

}
