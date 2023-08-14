package com.exceptionHandlings;

import java.io.FileWriter;
import java.io.IOException;
// FileWriter is class which throws IOException
public class FileWriterCompileTImeExcep {

	public static void main(String[] args) {
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("mydemo.txt");
			String data = "java is programming language";
			fw.write(data);
			System.out.println("file created");
		}
		catch(IOException o)
		
		{
			System.out.println(o.getMessage());
		}
		finally
		{
			try
			{
				fw.close();
			}
			catch(IOException o)
			{
				System.out.println(o.getMessage());
			}
		}

	}

}
