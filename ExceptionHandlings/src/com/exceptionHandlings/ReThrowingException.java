package com.exceptionHandlings;
import java.io.IOException;
public class ReThrowingException {
	public static void findlength(String str) throws IOException
	{
		try {
		System.out.println("length of string " + str.length());
		}
		catch(NullPointerException n)
		{
			throw new IOException("String is empty"); //rethrowing excep
		}
	}

	public static void main(String[] args) {
		String s = null;
		
		try
		{
		findlength(s);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
