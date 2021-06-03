package fileHandling_programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class createFile {
/*
Create a new file in Java using :
1. File
2. FileOutputStream
*/
	public static void main(String[] args) throws IOException {

		String projectPath = System.getProperty("user.dir");

		// 1. Using File
		File file = new File(projectPath+"/src/fileHandling_programs/newFile.txt");
		
		try 
		{
			boolean flag = file.createNewFile(); // To create a new file
			if(flag==true)
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File is already present..");
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		// 2. FileOutputStream along with Scanner
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name with location : ");
		String fileName = sc.nextLine();
		
		FileOutputStream fileOutputStream = new FileOutputStream(projectPath+"/src/fileHandling_programs/"+fileName, true);
		
		System.out.println("Enter the file content : ");
		String content = sc.nextLine();
		byte[] b = content.getBytes();
		
		fileOutputStream.write(b); // FileOutputStream writes content in form of bytes
		fileOutputStream.close();
		System.out.println("File is created at the given location.");
	}
}
