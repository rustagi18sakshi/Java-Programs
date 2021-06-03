package fileHandling_programs;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readFileUsingFileReader {

	public static void main(String[] args) throws IOException {

		String projectPath = System.getProperty("user.dir");
		
		FileReader fileReader = null;
		
		try
		{	
			File file = new File(projectPath+"/src/fileHandling_programs/demo.txt");
			
			fileReader = new FileReader(file);

			System.out.println("File Content is : ");
			
			int i=0;
			while((i=fileReader.read())!=-1)
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
			if(fileReader != null)
			{
				fileReader.close();
			}
		}
	}
}
