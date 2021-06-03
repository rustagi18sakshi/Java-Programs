package fileHandling_programs;

import java.io.File;
import java.util.Arrays;

public class printFileOrFolderNames {

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		
		File file = new File(projectPath+"/src");
		
		// Lists the files and directories present inside the directory
		File[] downloadDir = file.listFiles();
		
		// Sort the files/directories present inside the directory
		Arrays.sort(downloadDir);
		
		for(File f : downloadDir)
		{
			if(f.isFile())
			{ 
				System.out.println("File is : "+f.getName()+"   "+f.getAbsolutePath());
			}
			else if (f.isDirectory()) 
			{
				System.out.println("Directory is : "+f.getName()+"   "+f.getAbsolutePath());
			}	
			else
			{
				System.out.println("Not known : "+f.getName()+"   "+f.getAbsolutePath());
			}
		}	
	}
}
