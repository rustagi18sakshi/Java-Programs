package fileHandling_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileCopy {

	public static void main(String[] args) throws IOException {
		
		String projectPath = System.getProperty("user.dir");

		File inputFile = new File(projectPath+"/src/fileHandling_programs/Profile.pdf");
        
		File outputFile = new File(projectPath+"/src/fileHandling_programs/Profile-copy.pdf");	
		outputFile.delete();          // Delete old file if already exists
		outputFile.createNewFile();   // Create a new file
		
		// Initializing streams
		FileInputStream fileInputStream = new FileInputStream(inputFile);
		FileOutputStream fileOutputStream = new FileOutputStream(outputFile);

		int i = 0;
		
		try {
			while((i = fileInputStream.read())!=-1)
			{
				// Writing to output stream
				fileOutputStream.write(i);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			// Close the streams
			if(fileInputStream != null)
			{
				fileInputStream.close();
			}
			if(fileOutputStream != null)
			{
				fileOutputStream.close();
			}
		}
	}
}
