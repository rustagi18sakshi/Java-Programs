package fileHandling_programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readFileUsingBufferedReader {

	public static void main(String[] args) throws IOException {

		String projectPath = System.getProperty("user.dir");
		
		BufferedReader br = null;
		
		try
		{	
			File file = new File(projectPath+"/src/fileHandling_programs/demo.txt");
			
			FileReader fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			
			System.out.println("File Content is : ");
			
			int i=0;
			while((i=br.read())!=-1)
			{
				// It returns ASCII code, so we need to convert to char
				System.out.print((char)i);  
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			// Close the streams
			if(br != null)
			{
				br.close();
			}
		}
	}
}
