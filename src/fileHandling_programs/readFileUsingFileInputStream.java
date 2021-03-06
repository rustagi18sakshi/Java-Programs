package fileHandling_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readFileUsingFileInputStream {

	public static void main(String[] args) throws IOException {

		String projectPath = System.getProperty("user.dir");
		
		FileInputStream fileInputStream = null;
		
		try
		{	
			File file = new File(projectPath+"/src/fileHandling_programs/demo.txt");
			
			fileInputStream = new FileInputStream(file);
			
			System.out.println("File Content is : ");
			
			int i=0;
			while((i=fileInputStream.read())!=-1)
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
			// Close the stream
			if(fileInputStream != null)
			{
				fileInputStream.close();
			}
		}
	}
}
